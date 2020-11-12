package decorator.questao1.classes.concretes;

import decorator.questao1.classes.abstracts.Beverage;
import decorator.questao1.classes.abstracts.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return .70 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + " Soy";
    }
}
