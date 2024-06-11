package behavioral.state;

public class Off implements PowerState {
    public void powerPush(){
        System.out.println("power off");
    }
}
