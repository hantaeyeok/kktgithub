package sec1;
//내부 클래스(Inner Class) : 클래스 안에 더 작은 클래스
class Outer { //외부 클래스
	private int num = 10;	//멤버 필드
	private static int sNum = 20; //정적 멤버 필드 => 데이터 공유
	
	public Inner inner;	//인스턴스 내부 클래스
	public Outer() {	//Outer 생성자를 호출하게 되면, 자동적으로 내부 클래스에 대한 인스턴스 생성
		inner = new Inner();
	}
	
	class Inner {	//내부 클래스
		int inNum = 1000;
		void inMethod() {
			System.out.println("내부 클래스에서 외부 클래스의 멤버 변수 접근 : num "+num);
			System.out.println("내부 클래스에서 외부 클래스의 정적 멤버 변수 접근 : sNum "+sNum);
		}
	}
	public void outMethod() { //외부 클래스에서 내부 클래스의 멤버 메소드 호출
		inner.inMethod();
	}
}
public class InnerClassExam {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.outMethod();	//타 클래스에서 객체 생성 후 외부 클래스의 멤버 메소드 호출 
		out.inner.inMethod(); //타 클래스에서 객체 생성 후 내부 클래스의 멤버 메소드 호출
	}
}
