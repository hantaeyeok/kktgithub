package behavioral.chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Chain of Responsibility Pattern : 클라이언트의 요청이 객체 체인으로 전달되어 처리되는 소프트웨어 설계에서 느슨한 결합을 달성하는 데 사용되는 패턴
public class ChainOfResponsibilityPattern {
	public static void main(String[] args) {
        ManagerPower manager = new ManagerPower();
        DirectorPower director = new DirectorPower();
        VicePresidentPower vp = new VicePresidentPower();
        PresidentPower president = new PresidentPower();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        // Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PurchaseRequest(0, d, "General"));
           }
        } catch(Exception e) {
            System.exit(1);
        }
	}
}
