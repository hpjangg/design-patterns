package factory.pizza.chicago;

import factory.pizza.Pizza;
import factory.pizza.type.PizzaTopping;

import java.util.Arrays;

public class ChicagoStyleVeggiePizza extends Pizza {

    private static final String name = "Chicago Style Veggie Pizza";

    public ChicagoStyleVeggiePizza(PizzaTopping... pizzaToppings) {
        super(name);
        Arrays.asList(pizzaToppings).forEach(super::addPizzaTopping);
    }
}
