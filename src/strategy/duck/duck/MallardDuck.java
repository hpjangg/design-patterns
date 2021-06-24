package strategy.duck.duck;

import strategy.duck.behavior.fly.FlyBehavior;
import strategy.duck.behavior.quack.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("물 오리");
    }
}
