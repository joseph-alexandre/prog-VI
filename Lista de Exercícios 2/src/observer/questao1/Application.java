package observer.questao1;

import observer.questao1.classes.*;
import observer.questao1.interfaces.DisplayElement;

public class Application {
    public static void main(String[] args) {
        // Exemplo da criação de um Subject e a inscrição de seus observers
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        DisplayElement forecastDisplay = new ForecastDisplay(weatherDataSubject);
        DisplayElement thirdPartDisplay = new ThirdPartDisplay(weatherDataSubject);
        DisplayElement statisticsDisplay = new StatisticsDisplay(weatherDataSubject);
        DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(weatherDataSubject);
        weatherDataSubject.measurementsChanged(30f, 24f, 50f);

        System.out.println("Valor alterado!\n");
        weatherDataSubject.measurementsChanged(10f, 100f, 30f);



    }
}
