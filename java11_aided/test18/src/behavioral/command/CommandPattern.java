package behavioral.command;
//Command Pattern : 요청을 캡슐화하여 여러 기능을 실행할 수 있는 패턴
public class CommandPattern {
	public static void main(String[] args) {
		
		Command com1 = new AlarmCommand(new Alarm());
		Button btn1 = new Button(com1);	//Button은 Alarm과 Lamp의 기능을 합쳐 전달할 수 있게 구현
		btn1.pressed(true);
		btn1.pressed(false);
		
		com1 = new LampCommand(new Lamp());
		btn1 = new Button(com1);
		btn1.pressed(true);
		btn1.pressed(false);
	}
}
