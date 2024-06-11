package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//insert into 테이블명[(필드명1, 필드명2,...)] values (값1, 값2,....) : 테이블에 레코드를 추가
public class OracleExam2 {
	public static void main(String[] args) {
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(ON/OFF) 하고, SQL 문장 실행
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "insert into student values(?,?,?)";
		Student st = new Student(7, "조우진", 95);
		int i = 0;
		try {
			Class.forName(driver);	//드라이버 로딩
			try {
				con = DriverManager.getConnection(url, userid, userpw); //연결 
				pstmt = con.prepareStatement(sql); //전원 ON
				pstmt.setInt(1, st.getNo());	//쿼리 옵션 추가
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getPoint());
				i = pstmt.executeUpdate();	//SQL 실행 및 결과 반환 : insert/update/delete 일 때는 commit 명령이 반드시 필요하므로 executeUpdate() 메소드로 실행해야하며, 결과 반환은 int 타입니다.
				if(i>0) {
					System.out.println(i+"건이 성공적으로 처리 되었습니다.");
				} else {
					System.out.println("SQL 구문 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 처리 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
