package behavioral.memento;
//Memento Pattern : 객체의 상태정보를 저장하고 원하는 시점의 이전 상태로 복원할 수 있는 패턴
public class MementoPattern {
	   public static void main(String[] args) {
		      Originator originator = new Originator();
		      CareTaker careTaker = new CareTaker();
		      originator.setState("State #1");
		      originator.setState("State #2");
		      careTaker.add(originator.saveStateToMemento());
		      originator.setState("State #3");
		      careTaker.add(originator.saveStateToMemento());
		      originator.setState("State #4");

		      System.out.println("Current State: " + originator.getState());		
		      originator.getStateFromMemento(careTaker.get(0));
		      System.out.println("First saved State: " + originator.getState());
		      originator.getStateFromMemento(careTaker.get(1));
		      System.out.println("Second saved State: " + originator.getState());
		   }
}
