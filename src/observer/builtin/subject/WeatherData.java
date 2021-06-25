package observer.builtin.subject;

import java.util.Observable;

public class WeatherData extends Observable {

    private Double temperature;

    public Double getTemperature() {
        return this.temperature;
    }

    public void setMeasurements(Double temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

}
