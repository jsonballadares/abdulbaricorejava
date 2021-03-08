package src;

public class LuxuryCar extends Car {
    public void changeGear() {
        System.out.println("Automatic Gear");
    }

    public void openRoof() {
        System.out.println("Sun Roof is Opened");
    }

    public static void main(String[] args) {
        LuxuryCar car = new LuxuryCar();
        car.start();
        car.accelerate();
        car.changeGear();
    }
}
