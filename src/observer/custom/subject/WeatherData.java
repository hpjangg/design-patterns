package observer.custom.subject;

import observer.custom.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private Double temperature;
    private Double humidity;
    private Double pressure;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 순서 보장됨.
     */
    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(this.temperature, this.humidity, this.pressure));
    }

    public void setMeasurements(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObservers();
    }
}
