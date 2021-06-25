package observer.custom;

import observer.custom.observer.CurrentConditions;
import observer.custom.observer.ForecastDisplay;
import observer.custom.observer.StatisticsDisplay;
import observer.custom.observer.ThirdPartyDisplay;
import observer.custom.subject.WeatherData;

public class CustomTests {

    private static CurrentConditions currentConditions;
    private static ForecastDisplay forecastDisplay;
    private static StatisticsDisplay statisticsDisplay;
    private static ThirdPartyDisplay thirdPartyDisplay1;
    private static ThirdPartyDisplay thirdPartyDisplay2;

    private static void init() {
        currentConditions = new CurrentConditions();
        forecastDisplay = new ForecastDisplay();
        statisticsDisplay = new StatisticsDisplay();
        thirdPartyDisplay1 = new ThirdPartyDisplay();
        thirdPartyDisplay2 = new ThirdPartyDisplay();
    }

    public static void main(String[] args) {
        init();

        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(thirdPartyDisplay1);
        weatherData.registerObserver(thirdPartyDisplay2);


        System.out.println("\n==========\n");
        weatherData.setMeasurements(10.0, 20.0, 30.0);
        System.out.println("\n==========\n");

        weatherData.removeObserver(thirdPartyDisplay2);
        weatherData.removeObserver(thirdPartyDisplay2);

        System.out.println("\n==========\n");
        weatherData.notifyObservers();
        System.out.println("\n==========\n");
    }

}
