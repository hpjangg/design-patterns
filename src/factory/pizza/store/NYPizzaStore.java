package factory.pizza.store;

import factory.pizza.Pizza;
import factory.pizza.ny.NYStyleCheesePizza;
import factory.pizza.ny.NYStyleClamPizza;
import factory.pizza.ny.NYStylePepperoniPizza;
import factory.pizza.ny.NYStyleVeggiePizza;
import factory.pizza.type.PizzaTopping;
import factory.pizza.type.PizzaType;

import java.util.Optional;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Optional<Pizza> createPizza(PizzaType pizzaType, PizzaTopping... pizzaToppings) {
        if (PizzaType.isCheese(pizzaType)) {
            return Optional.of(new NYStyleCheesePizza(pizzaToppings));
        } else if (PizzaType.isClam(pizzaType)) {
            return Optional.of(new NYStyleClamPizza(pizzaToppings));
        } else if (PizzaType.isPepperoni(pizzaType)) {
            return Optional.of(new NYStylePepperoniPizza(pizzaToppings));
        } else if (PizzaType.isVeggie(pizzaType)) {
            return Optional.of(new NYStyleVeggiePizza(pizzaToppings));
        }
        return Optional.empty();
    }

}
