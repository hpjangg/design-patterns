package factory.pizza.ny;

import factory.pizza.Pizza;
import factory.pizza.type.PizzaTopping;

import java.util.Arrays;

public class NYStyleCheesePizza extends Pizza {

    private static final String name = "New York Style Cheese Pizza";

    public NYStyleCheesePizza(PizzaTopping... pizzaToppings) {
        super(name);
        Arrays.asList(pizzaToppings).forEach(super::addPizzaTopping);
    }
}
