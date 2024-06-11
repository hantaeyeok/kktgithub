package structural.bridge;
//Bridge Pattern : 추상화(abstraction)를 구현으로부터 분리하여 각각 독립적으로 변화할 수 있도록 하는 패턴
//그러므로, 기능과 구현을 분리하여 독립적으로 변형과 확장이 가능하도록 결합도를 낮춘 패턴
//Bridge(Color)를 특정 추상화 클래스(Shape)에 멤버로 기용하고, 서브 클래스(Triangle, Pentagon)에서
//해당 색상을 골라 서로 다른 클래스를 조합하여 원래 보다 더 큰 객체를 구현할 수 있도록 하는 패턴
public class BridgePattern {
	public static void main(String[] args) {
		Shape triangle1 = new Triangle(new RedColor());
		Shape pentagon1 = new Pentagon(new GreenColor());
		Shape triangle2 = new Triangle(new GreenColor());
		Shape pentagon2 = new Pentagon(new RedColor());
		
		triangle1.applyColor();
		triangle2.applyColor();
		pentagon1.applyColor();
		pentagon2.applyColor();
	}
}
