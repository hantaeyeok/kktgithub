package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyExam {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		//finally : 예외사항이 try 되어 성공 수행을 하게 되든 exception 되어 실패 수행을 하든 반드시 처리해야 문장
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("성공이든 실패든 항상 수행1");
		}
		
		FileOutputStream ois = null;
		try {
			ois = new FileOutputStream("b.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} finally {
			if(ois!=null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("성공이든 실패든 항상 수행2");
		} 
		System.out.println("예외 처리의 다음 문장");
	}
}
