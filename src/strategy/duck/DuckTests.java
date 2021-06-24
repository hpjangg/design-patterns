package strategy.duck;

import strategy.duck.behavior.fly.FlyBehavior;
import strategy.duck.behavior.fly.FlyNoWay;
import strategy.duck.behavior.fly.FlyRocketPowered;
import strategy.duck.behavior.fly.FlyWithWings;
import strategy.duck.behavior.quack.MuteQuack;
import strategy.duck.behavior.quack.Quack;
import strategy.duck.behavior.quack.QuackBehavior;
import strategy.duck.behavior.quack.Squeak;
import strategy.duck.duck.*;

public class DuckTests {

    private static FlyBehavior flyWithWings;
    private static FlyBehavior flyNoWay;
    private static FlyBehavior flyRocketPowered;

    private static QuackBehavior quack;
    private static QuackBehavior squeak;
    private static QuackBehavior muteQuack;

    public static void main(String[] args) {
        initFlyBehavior();
        initQuackBehavior();

        Duck mallardDuck = new MallardDuck(flyWithWings, quack);
        Duck redheadDuck = new RedheadDuck(flyWithWings, quack);
        Duck rubberDuck = new RubberDuck(flyNoWay, squeak);
        Duck decoyDuck = new DecoyDuck(flyNoWay, muteQuack);

        System.out.println("Mallard Duck");
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("\n==========\n");

        System.out.println("Redhead Duck");
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();
        System.out.println("\n==========\n");

        System.out.println("Rubber Duck");
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println("\n==========\n");

        System.out.println("Decoy Duck");
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.setFlyBehavior(flyRocketPowered);
        decoyDuck.performFly();
        System.out.println("\n==========\n");
    }

    private static void initFlyBehavior() {
        flyWithWings = new FlyWithWings();
        flyNoWay = new FlyNoWay();
        flyRocketPowered = new FlyRocketPowered();
    }

    private static void initQuackBehavior() {
        quack = new Quack();
        squeak = new Squeak();
        muteQuack = new MuteQuack();
    }

}
