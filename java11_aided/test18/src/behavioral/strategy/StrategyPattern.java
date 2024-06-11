package behavioral.strategy;
//Strategy Pattern : 행위를 클래스로 캡슐화하여 필요에 따라 동적으로 대체가 가능하도록 한 패턴
public class StrategyPattern {
	public static void main(String[] args) {
        Movable train = new Train();
        Movable bus = new Bus();

        train.move();
        bus.move();
	}
}
