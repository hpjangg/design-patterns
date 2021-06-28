package decorator.starbucks.beverage.condiment;

import decorator.starbucks.beverage.Beverage;

public class Milk extends CondimentDecorator {

    private final Beverage beverage;
    private final Double cost;
    private final String description;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 0.1;
        this.description = "Milk";
    }

    @Override
    public Double cost() {
        return beverage.cost() + this.cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.description;
    }
}
