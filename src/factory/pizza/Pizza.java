package factory.pizza;

import factory.pizza.type.PizzaTopping;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    private final String name;
    private final List<PizzaTopping> pizzaToppingList = new ArrayList<>();

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Prepare");
        for (PizzaTopping pizzaTopping: pizzaToppingList) {
            System.out.println("Topping: " + pizzaTopping.name());
        }
    }

    public void bake() {
        System.out.println("Bake");
    }

    public void cut() {
        System.out.println("Cut");
    }

    public void box() {
        System.out.println("box");
    }

    public String getName() {
        return this.name;
    }

    public void addPizzaTopping(PizzaTopping pizzaTopping) {
        this.pizzaToppingList.add(pizzaTopping);
    }

}
