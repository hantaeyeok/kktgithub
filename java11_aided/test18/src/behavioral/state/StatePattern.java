package behavioral.state;
//State Pattern : 객체가 내부 상태에 따라 동작을 변경할 때 사용하는 패턴
public class StatePattern {
	public static void main(String[] args) {
        Laptop laptop = new Laptop();
        On on = new On();
        Off off = new Off();
        Saving saving = new Saving();

        laptop.powerPush();
        laptop.setPowerState(on);
        laptop.powerPush();
        laptop.setPowerState(saving);
        laptop.powerPush();
        laptop.setPowerState(off);
        laptop.powerPush();
        laptop.setPowerState(on);
        laptop.powerPush();
	}
}
