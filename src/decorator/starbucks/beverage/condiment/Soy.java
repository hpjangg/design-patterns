package decorator.starbucks.beverage.condiment;

import decorator.starbucks.beverage.Beverage;

public class Soy extends CondimentDecorator {

    private final Beverage beverage;
    private final Double cost;
    private final String description;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 0.3;
        this.description = "Soy";
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
