package decorator.starbucks.beverage.condiment;

import decorator.starbucks.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
