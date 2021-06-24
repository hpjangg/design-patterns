package strategy.duck.duck;

import strategy.duck.behavior.fly.FlyBehavior;
import strategy.duck.behavior.quack.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("물에 떠 있음. 모든 오리는 물에 떠 있을 수 있음.");

    };

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        System.out.println("Fly Action 변경!");
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        System.out.println("Quack Action 변경!");
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

}
