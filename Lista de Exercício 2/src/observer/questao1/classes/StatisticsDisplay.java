package observer.questao1.classes;

import observer.questao1.interfaces.DisplayElement;
import observer.questao1.interfaces.Observer;
import observer.questao1.interfaces.Subject;
import observer.questao1.utils.GenericUtils;

import java.util.Date;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject subject;
    private Float temperature;
    private Float humidity;
    private Float preassure;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        Float maxima = this.temperature + 3f;
        Float minima = this.temperature - 5f;
        Float media = (maxima + minima) / 2;

        System.out.println("Statistics Display: \n");
        System.out.println(GenericUtils.dateFormat(new Date()) + ".\n");
        System.out.println("Máxima de " + maxima + ".\n"
                         + "Mínima de " + minima + ".\n"
                         + "Média de "  + media + ".\n"
                         + "Umidade: " + this.humidity + ".\n"
                         + "Pressão: " + this.preassure
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
