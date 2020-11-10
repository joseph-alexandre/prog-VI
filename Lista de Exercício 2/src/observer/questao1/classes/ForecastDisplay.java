package observer.questao1.classes;

import observer.questao1.interfaces.DisplayElement;
import observer.questao1.interfaces.Observer;
import observer.questao1.interfaces.Subject;
import observer.questao1.utils.GenericUtils;

import java.util.Date;

public class ForecastDisplay implements Observer, DisplayElement {
    private Subject subject;
    private Float temperature;
    private Float humidity;
    private Float preassure;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Display: \n");
        System.out.println(GenericUtils.dateFormat(new Date()) + "\n"
                + "O dia está " + GenericUtils.weatherPrediction(this.temperature, this.humidity)+ ".\n"
                + "Temperatura: " + this.temperature + ".\n"
                + "Umidade: " + this.humidity + ".\n"
                + "Pressão: " + this.preassure + "."
                );
        System.out.println("\n--------------------------------------------\n");
    }

    @Override
    public void update(Float temperature, Float humidity, Float preassure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.preassure = preassure;
        display();
    }
}
