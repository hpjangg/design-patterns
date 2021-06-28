package decorator.starbucks.beverage;

public abstract class Beverage {

    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    };

    public abstract Double cost();

}
