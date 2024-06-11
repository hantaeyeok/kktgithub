package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//중첩 예외 처리 : try~catch 문장 안에 try~catch가 이중으로 기재되는 경우
//주의사항 : 예외 처리 객체(인스턴스)명은 외부 try~catch와 내부 try~catch 간 서로 달라야 한다.
public class ExceptionExam8 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream ois = null;
		try {
			fis = new FileInputStream("indata.txt");
			try {
				ois = new FileOutputStream("outdata.txt");
			} catch(FileNotFoundException e1) {
				System.out.println("ois의 해당 파일을 찾을 수 없습니다.");
			}
		} catch(FileNotFoundException e) {
			System.out.println("fis의 해당 파일을 찾을 수 없습니다.");
			try {
				ois = new FileOutputStream("outdata.txt");
			} catch(FileNotFoundException e1) {
				System.out.println("ois의 해당 파일을 찾을 수 없습니다.");
			}
		} catch(Exception e) {
			System.out.println("원인불명");
			e.printStackTrace();
		} finally {
			System.out.println("파일 처리 종료");
		}

	}
}
