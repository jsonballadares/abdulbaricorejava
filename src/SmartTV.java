package src;

public class SmartTV extends TV {
    @Override
    public void switchON() {
        System.out.println("Smart TV is Switched ON");
    }

    @Override
    public void changeChannel() {
        System.out.println("SmartTV Channel is Changed ");
    }

    public void browse() {
        System.out.println("Smart Tv Browsing");
    }

    public static void main(String[] args) {
        SmartTV t = new SmartTV();
        t.switchON();
        t.browse();
    }
}
