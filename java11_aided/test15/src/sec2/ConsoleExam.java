package sec2;

import java.io.Console;
import java.io.IOException;

public class ConsoleExam {
	public static void main(String[] args) throws IOException {
		Console con = System.console();
		
		System.out.println("이름 : ");
		String name = con.readLine();
		
		System.out.println("점수 : ");
		int point = Integer.parseInt(con.readLine());

		System.out.println("체중 : ");
		double weight = Double.parseDouble(con.readLine());
		
		System.out.println("비밀번호 : ");
		char[] pwc = con.readPassword();
		String pw = new String(pwc);	//문자배열을 문자열로 형 변환
		
		Person p = new Person(name, point, weight);
		System.out.println(p.toString());
		System.out.println("비밀번호 : "+pw);
	}
}
//Console은 대기가 없어 값의 입력할 시간이 없으므로 Console 보다 Scanner를 더 많이 이용한다.