package creational.singleton;
//Singleton Pattern : 인스턴스를 한 번만 생성하여 메모리에 저장하여 사용함으로써 하나의 인스턴스를 보장하는 패턴
public class SingletonPattern {
	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance(1);
		Singleton ins2 = Singleton.getInstance(2);
		Singleton ins3 = Singleton.getInstance(3);
		ins1.print();
		ins2.print();
		ins3.print();
		if(ins1 == ins2 && ins1 == ins3 && ins2 == ins3) {
			System.out.println("하나의 객체 입니다.");
		} else {
			System.out.println("서로 다른 객체 입니다.");
		}
		System.out.println("ins1 : "+ins1);
		System.out.println("ins2 : "+ins2);
		System.out.println("ins3 : "+ins3);
	}
}
