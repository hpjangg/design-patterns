package decorator.starbucks.beverage;

public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public Double cost() {
        return 3.0;
    }
}
