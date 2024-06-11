package behavioral.interpreter;
//Expression : 인터페이스(추상체)로서 공통 메소드로 표현식을 정의
//And/Or 연산을 가정 => 논리값 결과
public interface Expression {
	public boolean interpreter(String context); 
}
