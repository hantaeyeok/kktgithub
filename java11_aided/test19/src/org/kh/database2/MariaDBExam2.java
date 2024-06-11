package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam2 {
	public static void main(String[] args) {
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//전원-명령전달
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		Student newSt = new Student(6, "kim", 95);
		String sql = "insert into student values (?, ?, ?)";
		
		//MariaDB 의 temp 데이터베이스의 student 테이블의 newSt의 내용을 레코드로 추가되도록 
		//자바 프로그래밍을 완성하시오.
		
		int i = 0;
		try {
			Class.forName(driver);	//드라이버 로딩
			try {
				con = DriverManager.getConnection(url, userid, userpw); //연결 
				pstmt = con.prepareStatement(sql); //전원 ON
				pstmt.setInt(1, newSt.getNo());	//쿼리 옵션 추가
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
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
