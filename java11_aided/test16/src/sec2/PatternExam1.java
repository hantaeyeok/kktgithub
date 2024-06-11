package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : 특정 데이터가 형식이 맞는지 비교하려고 할 경우 데이터 형식을 지정하는 클래스
//Matcher : 특정 패턴의 형태가 맞는지 비교하는 클래스
//정규식(Reg Expression) => RegEx
public class PatternExam1 {
	public static void main(String[] args) {
		String[] dt = {"bag","kim1004","9to6","8to5","single","Mom","ABC","김기태","^_^"};
		Pattern p = Pattern.compile("[a-z]*");	//영문 소문자로만 구성된 데이터
		//Pattern p = Pattern.compile("[0-9a-z]*");	//숫자와 영문 소문자로만 구성된 데이터
		//Pattern p = Pattern.compile("[A-Za-z]*");	//영문 대문자 또는 소문자로만 구성된 데이터
		//Pattern p = Pattern.compile("s[A-Za-z]*");	//s로 시작하면서 영문 대문자 또는 소문자로만 구성된 데이터
		//Pattern p = Pattern.compile("[가-힣]*");		//한글로만 구성된 데이터
		//Pattern p = Pattern.compile("e$*");	//웹 - 특정 문자로 끝나는 경우 문자 뒤에 $
		//Pattern p = Pattern.compile("^b*");	//웹 - 특정 문자로 시작하는 경우 문자 앞에 ^
		//Pattern p = Pattern.compile("^[0-9]*");	//모든 값이 숫자인 데이터
		for(int i=0;i<dt.length;i++) {
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("형식 일치 : "+dt[i]);
			}
		}
	}
}
