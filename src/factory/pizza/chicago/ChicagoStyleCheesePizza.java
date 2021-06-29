package factory.pizza.chicago;

import factory.pizza.Pizza;
import factory.pizza.type.PizzaTopping;

import java.util.Arrays;

public class ChicagoStyleCheesePizza extends Pizza {

    private static final String name = "Chicago Style Cheese Pizza";

    public ChicagoStyleCheesePizza(PizzaTopping... pizzaToppings) {
        super(name);
        Arrays.asList(pizzaToppings).forEach(super::addPizzaTopping);
    }
}
