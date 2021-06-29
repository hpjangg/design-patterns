package factory.pizza.ny;

import factory.pizza.Pizza;
import factory.pizza.type.PizzaTopping;

import java.util.Arrays;

public class NYStyleClamPizza extends Pizza {

    private static final String name = "New York Style Clam Pizza";

    public NYStyleClamPizza(PizzaTopping... pizzaToppings) {
        super(name);
        Arrays.asList(pizzaToppings).forEach(super::addPizzaTopping);
    }
}
