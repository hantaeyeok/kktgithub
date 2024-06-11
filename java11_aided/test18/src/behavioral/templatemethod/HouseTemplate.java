package behavioral.templatemethod;
//House(집)을 짖는 공통 메소드를 정의하되, 재료가 정해지지 않은 것들은 추상 메소드로 정의
public abstract class HouseTemplate {
	protected void buildHouse() {
		buildPillars();
		buildWalls();
		buildWindows();
		buildFoundation();
	}
	private void buildWindows() {
		System.out.println("유리 창문 만들기");
	}
	public abstract void buildWalls(); //아직 벽체를 어떠한 재료로 할지 모름
	public abstract void buildPillars();
	private void buildFoundation() {
		System.out.println("벽체/기둥 등의 재료에 맞는 마감재를 선택하였습니다.");
	}
}
