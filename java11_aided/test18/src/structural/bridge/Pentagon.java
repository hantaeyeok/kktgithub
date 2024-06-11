package structural.bridge;

public class Pentagon extends Shape {
	public Pentagon(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("색이 채워진 육각형");
		color.applyColor();
	}	
}
