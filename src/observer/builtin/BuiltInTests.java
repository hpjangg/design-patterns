package observer.builtin;

import observer.builtin.observer.ForecastDisplay;
import observer.builtin.observer.GeneralDisplay;
import observer.builtin.observer.StatisticDisplay;
import observer.builtin.subject.WeatherData;

public class BuiltInTests {

    private static WeatherData weatherData;
    private static ForecastDisplay forecastDisplay;
    private static GeneralDisplay generalDisplay;
    private static StatisticDisplay statisticDisplay1;
    private static StatisticDisplay statisticDisplay2;

    private static void init() {
        weatherData = new WeatherData();
        forecastDisplay = new ForecastDisplay(weatherData);
        generalDisplay = new GeneralDisplay(weatherData);
        statisticDisplay1 = new StatisticDisplay(weatherData);
        statisticDisplay2 = new StatisticDisplay(weatherData);
    }

    public static void main(String[] args) {

        init();

        System.out.println("\n==========\n");
        weatherData.setMeasurements(10.0);
        System.out.println("\n==========\n");

        weatherData.deleteObserver(statisticDisplay2);

        System.out.println("\n==========\n");
        weatherData.measurementsChanged();
        System.out.println("\n==========\n");

        System.out.println("\n==========\n");
        weatherData.notifyObservers();
        System.out.println("\n==========\n");
    }

}
