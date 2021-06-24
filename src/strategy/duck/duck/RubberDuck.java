package strategy.duck.duck;

import strategy.duck.behavior.fly.FlyBehavior;
import strategy.duck.behavior.quack.QuackBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("고무 오리");
    }
}
