package observer.questao1.classes;

import observer.questao1.interfaces.Observer;
import observer.questao1.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject {
    List<Observer> observers = new ArrayList<>();
    private Float temperature;
    private Float humidity;
    private Float preassure;

    public Float getTemperature() {
        return temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public Float getPreassure() {
        return preassure;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.temperature, this.humidity, this.preassure);
        }
    }

    public void measurementsChanged(Float temperature, Float humidity, Float preassure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.preassure = preassure;
        notifyObservers();
    }

}
