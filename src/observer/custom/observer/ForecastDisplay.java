package observer.custom.observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private Double temperature;
    private Double humidity;
    private Double pressure;

    @Override
    public void update(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature+10;
        this.humidity = humidity+10;
        this.pressure = pressure+10;
        display();
    }

    @Override
    public void display() {
        System.out.println("예상 온도: " + this.temperature);
        System.out.println("예상 습도: " + this.humidity);
        System.out.println("예상 기압: " + this.pressure);
    }
}
