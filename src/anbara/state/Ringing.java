package anbara.state;

public class Ringing implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Ringing");
    }
}
