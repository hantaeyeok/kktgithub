package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//자주 사용하는 정규 표현식(비밀번호, 이메일, 휴대폰 번호, 주민번호, 우편번호)
public class PatternExam2 {
	public static void main(String[] args) {
		
		
		Pattern p1 = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+$");	//이메일 패턴
		String[] email = {"kkt09072","kbs@naver","kkt@gmail.com","kim@kr","kkt@daum.net"};
		for(int i=0;i<email.length;i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches()) {
				System.out.println("이메일 형식이 맞습니다.");
				System.out.println(email[i]);
			}
		}
		System.out.println();
		
		//\\d는 10진수 {} 안에는 자릿수
		Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}");	//휴대폰 번호 패턴
		String[] phone = {"02-1234-1234","010-2836-1004","032-7979-2424","010-8284-3690"
				,"031-1247-9985","010-234-1234"};
		for(int i=0;i<phone.length;i++) {
			Matcher m = p2.matcher(phone[i]);
			if(m.matches()) {
				System.out.println("휴대폰 번호 형식이 맞습니다.");
				System.out.println(phone[i]);
			}
		}
		System.out.println();
		
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");	//주민번호 패턴
		String[] jm = {"941207-1234567","010203-6789012","3812256-2234567",
				"851019-234567","780528-2456123"};
		for(int i=0;i<jm.length;i++) {
			Matcher m = p3.matcher(jm[i]);
			if(m.matches()) {
				System.out.println("맞는 주민번호 입니다.");
				System.out.println(jm[i]);
			}
		}
		System.out.println();
		
		Pattern p4 = Pattern.compile("[1-7]\\d{2}\\-\\d{2}");	
		//우편번호 패턴 : 100번대(1xx-yy)~700번대(7xx-yy) 
		String[] post = {"123-123","212-34","816-24","5434-54","683-39"};
		for(int i=0;i<post.length;i++) {
			Matcher m = p4.matcher(post[i]);
			if(m.matches()) {
				System.out.println("맞는 우편번호 입니다.");
				System.out.println(post[i]);
			}
		}
		System.out.println("\n\n");
		
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");	//비밀번호 패턴
		//비밀번호 패턴 : 4~10 글자로 영문 대/소문자와 특수문자(!@#$%^&*?_) 그리고 숫자를 모두 최소 1문자를 포함
		//() 반드시 포함 
		//? 한 문자
		//=. 이상
		//* 뒤에 나오는 조건으로
		//(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$
		String[] pw = {"abcd1234","A123a","1234","ABCD!123456","Abc!432","KIM#1004"};
		for(int i=0;i<pw.length;i++) {
			Matcher m = p5.matcher(pw[i]);
			if(m.matches()) {
				System.out.println("영문 대문자, 소문자, 특수문자, 숫자가 모두 포함된 맞는 비밀번호 입니다.");
				System.out.println(pw[i]);
			}
		}
	}
}
