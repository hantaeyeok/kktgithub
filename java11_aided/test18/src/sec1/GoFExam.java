package sec1;

public class GoFExam {
	public static void main(String[] args) {
		//SOLID 5가지 원칙에 의한 자바 클래스와 인터페이스의 설계(디자인) 패턴 => GoF 패턴
		//GoF 패턴 : 생성(Creational) 패턴, 구조(Structural) 패턴, 행위(Behavior) 패턴
		//생성(Creational) 패턴 : 객체 생성을 자바 디자인 패턴. 객체(Instance) 생성에 관련된 패턴으로 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 끼치지 않도록 유연성과 재사용성을 향상시킨 디자인 패턴
		//구조(Structural) 패턴 : 여러 클래스를 혼합하기 위한 자바 디자인 패턴. 객체와 클래스를 보다 큰 구조로 조립하여 유연하고, 효율적인 방법을 제공하는 패턴
		//행위(Behavior) 패턴 : 메소드와 관련하여 기능을 분해하거나 조합하기 위한 자바 디자인 패턴.
		System.out.println("GoF(Gang of Fout) 패턴 : SOLID의 5가지 객체지향 프로그래밍 설계 원칙에 의해 생겨난 자바의 디자인 패턴");
		System.out.println("생성(Creational) 패턴 : 객체 생성을 자바 디자인 패턴");
		System.out.println("구조(Structural) 패턴 : 여러 클래스를 혼합하기 위한 자바 디자인 패턴");
		System.out.println("행위(Behavior) 패턴 : 메소드와 관련하여 기능을 분해하거나 조합하기 위한 자바 디자인 패턴");
/*

자바 디자인 패턴(GoF 23)
	생성(Creational) 패턴 - 5 : Factory Method, Abstract Factory, Builder, Prototype, Singleton
		객체(인스턴스) 생성과 관련한 패턴
		Factory Method : 어떤 클래스의 인스턴스를 만들지 서브클래스에서 결정하도록 책임을 위임하는 패턴
		Abstract Factory : 관련 있는 객체들을 모아서 팩토리로 만들고 조건에 따라 팩토리 중에서 선택하게 하는 패턴
		Builder : 객체의 생성 단계를 캡슐화하여 구축 공정을 동일하게 이용하도록 하는 패턴
		Prototype : 원형이 되는 객체를 복제하여 새로운 객체를 생성하는 패턴
		Singleton : 인스턴스를 한 번만 생성하여 메모리에 저장하여 사용함으로써 하나의 인스턴스를 보장하는 패턴
	구조(Structural) 패턴 - 7 :  Adapter, Bridge, Composite, Decorator, Façade, Proxy, Flyweight
		클래스를 확장하거나 합치므로써 클래스의 구조를 변경하는 패턴
		Adapter : 서로 다른 인터페이스를 가진 클래스를 함께 사용할 수 있도록 하는 패턴
		Bridge : 기능과 구현을 분리하여 독립적으로 변형과 확장이 가능하도록 결합도를 낮춘 패턴
		Composite : 여러 개의 객체들로 구성된 복합 객체와 단일 객체를 클라이언트에서 동일하게 사용하는 패턴
		Decorator : 객체에 추가적인 기능을 유연하게 확장하는 패턴
		Façade : 복잡한 클래스들을 묶어 통합된 인터페이스를 제공하는 패턴
		Proxy : 실제 객체가 아닌 가상 객체를 통해 기능을 처리하는 패턴
		Flyweight : 변경할 수 없는 개체와 함께 사용되는 개체 인스턴스를 캐싱하고 재사용하도록 하는 패턴
	행위(Behavioral) 패턴 - 11 :  Interpreter, Template, Command, Iterator, Mediator, Memento, Observer, Strategy, Visitor, Chain of Responsibility, State
		기능 즉, 메소드와 관련한 패턴
		Interpreter : 문법 규칙을 정의하고 해석하는 패턴
		Template Method: 공통 메소드를 상위 클래스에서 정의, 세부 사항은 하위 클래스에서 구현하는 패턴
		Command : 요청을 캡슐화하여 여러 기능을 실행할 수 있는 패턴
		Iterator : 컬렉션의 구현은 노출시키지 않고 요소들에 접근할 수 있는 패턴
		Mediator : 객체들 간의 상호작용 행위를 캡슐화하여 관리하는 패턴
		Memento : 객체의 상태정보를 저장하고 원하는 시점의 이전 상태로 복원할 수 있는 패턴
		Observer : 객체의 상태가 업데이트되면 객체에 의존하는 다른 객체에 알리고 자동으로 내용을 갱신하는 패턴
		Strategy : 행위를 클래스로 캡슐화하여 필요에 따라 동적으로 대체가 가능하도록 한 패턴
		Visitor : 데이터와 구조를 분리하여 구조를 수정하지 않고 새로운 기능을 추가할 수 있는 패턴
		Chain of Responsibility : 클라이언트의 요청이 객체 체인으로 전달되어 처리되는 소프트웨어 설계에서 느슨한 결합을 달성하는 데 사용되는 패턴
		State : 객체가 내부 상태에 따라 동작을 변경할 때 사용하는 패턴

 */
	}
}