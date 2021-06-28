package decorator.starbucks.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend");
    }

    @Override
    public Double cost() {
        return 4.0;
    }
}
