package strategy.duck.duck;

import strategy.duck.behavior.fly.FlyBehavior;
import strategy.duck.behavior.quack.QuackBehavior;

public class DecoyDuck extends Duck {

    public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("가짜 오리");
    }
}
