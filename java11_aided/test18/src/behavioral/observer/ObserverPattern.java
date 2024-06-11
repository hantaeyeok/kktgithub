package behavioral.observer;
//Observer Pattern : 객체의 상태가 업데이트되면 객체에 의존하는 다른 객체에 알리고 자동으로 내용을 갱신하는 패턴
public class ObserverPattern {
	public static void main(String[] args) {
		DashBoard dashBoard = new DashBoard(); //Subject 클래스 생성
        new Subscriber(dashBoard);
        new Subscriber2(dashBoard);

        dashBoard.setMessage("some event"); //새로운 메시지
	}
}
