package sec1;
//NumberFormatException : 숫자 형태가 아닌 경우 발생하는 예외
public class ExceptionExam4 {
	public static void main(String[] args) {
		String data1 = "1004";
		String data2 = "kim1004";	
		int val1, val2;
		try {
			val1 = Integer.parseInt(data1);
			val2 = Integer.parseInt(data2); //숫자 정수로 변환할 수 없는 문자열
			System.out.println(val1);
			System.out.println(val2);
			System.out.println(val1+20);
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식으로 처리할 수 없는 데이터");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("정체를 알 수 없는 예외");
			e.getMessage();
		} finally {
			System.out.println("종료");
		}
	}
}
