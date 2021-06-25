package observer.custom.observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    @Override
    public void update(Double temperature, Double humidity, Double pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics Display");
    }
}
