package behavioral.templatemethod;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("나무 벽체를 만듭니다.");
	}

	@Override
	public void buildPillars() {
		System.out.println("나무 기둥을 만듭니다.");
	}
	
}
