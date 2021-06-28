package decorator.starbucks.beverage;

public class Decaf extends Beverage {

    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public Double cost() {
        return 2.0;
    }
}
