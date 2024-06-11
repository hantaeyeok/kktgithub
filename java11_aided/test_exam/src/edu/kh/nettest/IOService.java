package edu.kh.nettest;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOService {
	public static void main(String[] args) {
		output1();
	}
	public static void output1() {
		FileOutputStream fos = null;	//1. 1byte만 다루는 OutputStream을 사용하기때문에 2byte인 한글은 정상적으로 출력되지 않는다.
		try {
			fos = new FileOutputStream("test.txt");
			String str = "안녕하세요!";
			for(int i=0 ; i<str.length() ; i++) {
				fos.write( str.charAt(i) );
			}
		} catch(IOException e) {
			e.printStackTrace();
		} //2. finally 구문의 예외 발생 유무와 관계없이 자원반환을 해야하는 close() 구문을 작성하지 않았다.
	}
}
