package decorator.questao1.classes.concretes;

import decorator.questao1.classes.abstracts.Beverage;
import decorator.questao1.classes.abstracts.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + " Milk";
    }
}
