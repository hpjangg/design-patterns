package strategy.duck.behavior.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("우와 날고 있어요~!");
    }
}
