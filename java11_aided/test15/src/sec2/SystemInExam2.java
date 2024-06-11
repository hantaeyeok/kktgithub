package sec2;

import java.io.IOException;
//키보드 여러 글자 입력하여 라인단위로 입력하여 출력
public class SystemInExam2 {
	public static void main(String[] args) throws IOException {
		System.out.println("영문 단어 또는 문장을 입력하고, [Enter]를 누르세요");
		int i;
		String data = "";
		try {
			while((i = System.in.read()) != '\n') {	//아스키코드 한 글자 입력 => 바이트 단위 입력
				System.out.println((char) i);
				data += (char) i;
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력된 단어 또는 문장 : "+data);
	}
}
