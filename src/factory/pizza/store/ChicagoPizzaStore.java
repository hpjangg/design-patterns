package factory.pizza.store;

import factory.pizza.Pizza;
import factory.pizza.chicago.ChicagoStyleCheesePizza;
import factory.pizza.chicago.ChicagoStyleClamPizza;
import factory.pizza.chicago.ChicagoStylePepperoniPizza;
import factory.pizza.chicago.ChicagoStyleVeggiePizza;
import factory.pizza.type.PizzaTopping;
import factory.pizza.type.PizzaType;

import java.util.Optional;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Optional<Pizza> createPizza(PizzaType pizzaType, PizzaTopping... pizzaToppings) {
        if (PizzaType.isCheese(pizzaType)) {
            return Optional.of(new ChicagoStyleCheesePizza(pizzaToppings));
        } else if (PizzaType.isClam(pizzaType)) {
            return Optional.of(new ChicagoStyleClamPizza(pizzaToppings));
        } else if (PizzaType.isPepperoni(pizzaType)) {
            return Optional.of(new ChicagoStylePepperoniPizza(pizzaToppings));
        } else if (PizzaType.isVeggie(pizzaType)) {
            return Optional.of(new ChicagoStyleVeggiePizza(pizzaToppings));
        }
        return Optional.empty();
    }
}
