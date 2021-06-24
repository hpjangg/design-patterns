package strategy.duck.duck;

import strategy.duck.behavior.fly.FlyBehavior;
import strategy.duck.behavior.quack.QuackBehavior;

public class RedheadDuck extends Duck {

    public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("붉은머리 오리");
    }
}
