package observer.custom.observer;

public class CurrentConditions implements Observer, DisplayElement {

    private Double temperature;
    private Double humidity;
    private Double pressure;

    @Override
    public void update(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("온도: " + this.temperature);
        System.out.println("습도: " + this.humidity);
        System.out.println("기압: " + this.pressure);
    }
}
