package structural.proxy;
//Proxy Pattern : 실제 객체가 아닌 가상 객체를 통해 기능을 처리하는 패턴
public class ProxyPattern {
	public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("ReadyKim", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
	}
}
