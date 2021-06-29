package factory.pizza.store;

import factory.pizza.Pizza;
import factory.pizza.type.PizzaTopping;
import factory.pizza.type.PizzaType;

import java.util.Optional;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType, PizzaTopping... pizzaToppings) throws Exception {
        Pizza pizza = createPizza(pizzaType, pizzaToppings).orElseThrow(Exception::new);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Optional<Pizza> createPizza(PizzaType pizzaType, PizzaTopping... pizzaToppings);

}
