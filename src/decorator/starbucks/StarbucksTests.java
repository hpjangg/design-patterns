package decorator.starbucks;

import decorator.starbucks.beverage.Beverage;
import decorator.starbucks.beverage.DarkRoast;
import decorator.starbucks.beverage.condiment.Milk;
import decorator.starbucks.beverage.condiment.Mocha;
import decorator.starbucks.beverage.condiment.Soy;
import decorator.starbucks.beverage.condiment.Whip;

public class StarbucksTests {

    public static void main(String[] args) {

        Beverage darkRoast = new DarkRoast();

        System.out.println("\n==========\n");
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
        System.out.println("\n==========\n");

        darkRoast = new Milk(darkRoast);
        System.out.println("\n==========\n");
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
        System.out.println("\n==========\n");

        darkRoast = new Whip(darkRoast);
        System.out.println("\n==========\n");
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
        System.out.println("\n==========\n");

        darkRoast = new Mocha(darkRoast);
        System.out.println("\n==========\n");
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
        System.out.println("\n==========\n");

        darkRoast = new Soy(darkRoast);
        System.out.println("\n==========\n");
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
        System.out.println("\n==========\n");

        darkRoast = new DarkRoast();
        System.out.println("\n==========\n");
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
        System.out.println("\n==========\n");
    }

}
