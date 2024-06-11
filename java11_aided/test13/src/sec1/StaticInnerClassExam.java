package sec1;
//정적 내부 클래스인 Inner 클래스는 외부든 내부든 정적 요소만 허용
class Outer2 {	//외부 클래스
	private int num = 10;
	private static int sNum = 20;
		
	static class Inner {	//정적 내부 클래스
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inMethod() {
			System.out.println("내부에서 내부 클래스의 인스턴스 변수 : inNum = "+inNum);
			System.out.println("내부에서 내부 클래스의 정적 멤버 변수 : sInNum = "+sInNum);
			//System.out.println("내부에서 외부 클래스의 인스턴스 변수 : num = "+num);
			System.out.println("내부에서 외부 클래스의 정적 멤버 변수 : sNum = "+ sNum);
		}
	}
	
	static void outMethod() { //외부 클래스의 정적 메소드
		//System.out.println("외부에서 내부 클래스의 인스턴스 변수 : inNum = "+inNum);
		System.out.println("외부에서 내부 클래스의 정적 멤버 변수 : sInNum = "+Inner.sInNum);
		//System.out.println("외부에서 외부 클래스의 인스턴스 변수 : num = "+num);
		System.out.println("외부에서 외부 클래스의 정적 멤버 변수 : sNum = "+ sNum);
	}
}
public class StaticInnerClassExam {
	public static void main(String[] args) {
		Outer2 out = new Outer2();	//외부 클래스의 인스턴스
		//out.outMethod();	//outMethod()는 정적 메소드이므로 객체를 생성하지 않고, 실행
		Outer2.outMethod();	
		//Outer2.Inner.inMethod();	//inMethod()는 인스턴스 메소드이므로 정적 클래스인 Inner로 실행할 수 없음
		//out.Inner.inMethod();	//Inner가 정적 클래스이므로 out 인스턴스를 생성하지 않고, Outer2를 활용해야 한다.
		
		Outer2.Inner inner = new Outer2.Inner();	//정적 내부 클래스의 인스턴스
		inner.inMethod();
		//외부 클래스에서는 외부 메소드는 모두 실행 가능하며, 내부 메소드 및 멤버 변수의 접근 및 실행이 불가능
		//정적 내부 클래스로 생성된 인스턴스는 내부 메소드 및 멤버 변수의 접근 및 실행이 가능		
	}
}
