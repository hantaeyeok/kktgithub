package behavioral.mediator;
//Mediator Pattern : 객체들 간의 상호작용 행위를 캡슐화하여 관리하는 패턴
public class MediatorPattern {
	public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        ChatUser kim = new ChatUser(mediator,"kim");

        mediator.addUser(new ChatUser(mediator,"lee"))
                .addUser(new ChatUser(mediator,"park"))
                .addUser(kim);

        kim.send("하이~! 방가방가~!");
	}
}
