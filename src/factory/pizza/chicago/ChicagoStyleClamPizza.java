package factory.pizza.chicago;

import factory.pizza.Pizza;
import factory.pizza.type.PizzaTopping;

import java.util.Arrays;

public class ChicagoStyleClamPizza extends Pizza {

    public static final String name = "Chicago Style Clam Pizza";

    public ChicagoStyleClamPizza(PizzaTopping... pizzaToppings) {
        super(name);
        Arrays.asList(pizzaToppings).forEach(super::addPizzaTopping);
    }
}
