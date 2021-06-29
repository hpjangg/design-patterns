package factory.pizza.type;

public enum PizzaType {
    CHEESE,
    CLAM,
    PEPPERONI,
    VEGGIE;

    public static boolean isCheese(PizzaType pizzaType) {
        return CHEESE.equals(pizzaType);
    }

    public static boolean isClam(PizzaType pizzaType) {
        return CLAM.equals(pizzaType);
    }

    public static boolean isPepperoni(PizzaType pizzaType) {
        return PEPPERONI.equals(pizzaType);
    }

    public static boolean isVeggie(PizzaType pizzaType) {
        return VEGGIE.equals(pizzaType);
    }
}
