package factory.pizza;

import factory.pizza.store.NYPizzaStore;
import factory.pizza.store.PizzaStore;
import factory.pizza.type.PizzaTopping;
import factory.pizza.type.PizzaType;

public class PizzaTests {

    public static void main(String[] args) throws Exception {

        System.out.println("\n==========\n");
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza(PizzaType.PEPPERONI, PizzaTopping.SHREDDED_MOZZARELLA_CHEESE);
        System.out.println("\n==========\n");

    }

}
