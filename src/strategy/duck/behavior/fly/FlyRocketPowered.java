package strategy.duck.behavior.fly;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("와우! 로켓 추진으로 날아요!");
    }
}
