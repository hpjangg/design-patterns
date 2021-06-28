package decorator.starbucks.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("Dark Roast");
    }

    @Override
    public Double cost() {
        return 1.0;
    }
}
