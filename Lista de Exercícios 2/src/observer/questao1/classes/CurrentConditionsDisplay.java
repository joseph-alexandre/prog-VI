package observer.questao1.classes;

import observer.questao1.interfaces.DisplayElement;
import observer.questao1.interfaces.Observer;
import observer.questao1.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Subject subject;
    private Float temperature;
    private Float humidity;
    private Float preassure;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditions Display: \n");
        System.out.println("Temperatura: " + this.temperature + ".\n"
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
