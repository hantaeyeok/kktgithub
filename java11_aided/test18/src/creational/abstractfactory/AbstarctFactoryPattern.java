package creational.abstractfactory;
//Abstarct Factory Pattern : 추상 클래스에서 자식 추상 클래스로 자식 추상 클래스는 구현 클래스로 상속 받아
//처리 되게 하고, final 모드 구조적으로 객체를 생성하여 활용된다는 측면에서 추상화 공장(Abstract Factory)이라고 한다.
//그러므로, Abstarct Factory Pattern은 관련 있는 객체들을 모아서 팩토리로 만들고 조건에 따라 팩토리 중에서 선택하게 하는 패턴
public class AbstarctFactoryPattern {
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("전달된 환경변수가 존재하지 않습니다.");
			System.out.println("Class Name Not Found");
			System.out.println("Main Class 실행 오류");
		}
		
		final Factory factory = Factory.getFactory(args[0]);
		
		Link googleLink = factory.createLink("구글", "https://www.google.com");
		Link naverLink = factory.createLink("네이버", "https://www.naver.com");
		Link daumLink = factory.createLink("다음", "https://www.daum.net");
		
		final Tray searchTray = factory.createTray("검색엔진");
		searchTray.add(googleLink);
		searchTray.add(naverLink);
		searchTray.add(daumLink);
		
		final Page page = factory.createPage("검색엔진 리스트", "김기태");
		page.add(searchTray);
		
		page.output();
		/*
		ListPage의 makeHTML() 메소드 내용이 출력
		 */
	}
}
