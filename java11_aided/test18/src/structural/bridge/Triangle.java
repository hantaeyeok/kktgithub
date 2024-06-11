package structural.bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		System.out.println("색이 채워진 삼각형");
		color.applyColor();
	}
}
