package factory.pizza.chicago;

import factory.pizza.Pizza;
import factory.pizza.type.PizzaTopping;

import java.util.Arrays;

public class ChicagoStylePepperoniPizza extends Pizza {

    private static final String name = "Chicago Style Pepperoni Pizza";

    public ChicagoStylePepperoniPizza(PizzaTopping... pizzaToppings) {
        super(name);
        Arrays.asList(pizzaToppings).forEach(super::addPizzaTopping);
    }
}
