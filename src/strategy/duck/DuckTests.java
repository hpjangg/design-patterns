package strategy.duck;

import strategy.duck.behavior.fly.FlyNoWay;
import strategy.duck.behavior.fly.FlyRocketPowered;
import strategy.duck.behavior.fly.FlyWithWings;
import strategy.duck.behavior.quack.MuteQuack;
import strategy.duck.behavior.quack.Quack;
import strategy.duck.behavior.quack.Squeak;
import strategy.duck.duck.*;

public class DuckTests {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
        Duck redheadDuck = new RedheadDuck(new FlyWithWings(), new Quack());
        Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeak());
        Duck decoyDuck = new DecoyDuck(new FlyNoWay(), new MuteQuack());

        System.out.println("Mallard Duck");
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("==========\n");

        System.out.println("Redhead Duck");
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();
        System.out.println("==========\n");

        System.out.println("Rubber Duck");
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println("==========\n");

        System.out.println("Decoy Duck");
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.setFlyBehavior(new FlyRocketPowered());
        decoyDuck.performFly();
        System.out.println("==========\n");
    }

}
