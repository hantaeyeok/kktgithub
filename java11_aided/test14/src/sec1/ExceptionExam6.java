package sec1;
//ClassNotFoundException : 해당 클래스를 찾을 수 없는 경우. 즉, 드라이버의 패키지이름이 틀렸거나 라이브러리로 추가하지 않은 경우
public class ExceptionExam6 {
	public static void main(String[] args) {
		try {
			Class driver = Class.forName("oracle.jdbc.driver");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 오라클 드라이버를 찾지 못했습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("원인불명");
			e.printStackTrace();
		} finally {
			System.out.println("종료");
		}
	}
}
