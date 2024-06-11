package sec1;
class Outer3 {//외부 클래스
	//익명의 내부 클래스를 선언시에는 Runnable 로 구현해야 한다.
	Runnable getRunnable(int i) { //Runnable은 인터페이스 이므로 인스턴스 생성시 기본 메소드인 run() 메소드의 구현 내용을 기술하여 생성해야함.
		int num = 100;		//지역 변수
		return new Runnable() {
			@Override
			public void run() {
				//int i;	=> 매개 변수로 이미 상단에 i가 있기 때문에 중복되어 오류 발생
				//int num;	=> 지역 변수로 이미 상단에 num이 존재하기 때문에 중복되어 오류 발생
				System.out.println(i);	//i => 매개 변수
				System.out.println(num);	//num => 지역 변수
			}
		};
	}
	//익명의 실행 인스턴스(객체)를 Runnable 생성
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable로 구현된 익명의 내부 클래스~!");
		}
	};
}
public class AnonymousInnerExam {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.getRunnable(500);	//오류는 없지만 Runnable이 만들어지지 않아 구현 내용은 실행이 되지 않음.
		out.runner.run();
		
		Runnable runAble = out.getRunnable(500);	//외부 클래스의 내부 클래스 없이 생성된 인스턴스(runAble)는 Runnable 로 선언하여 생성한다. 
		runAble.run();
	}
}
