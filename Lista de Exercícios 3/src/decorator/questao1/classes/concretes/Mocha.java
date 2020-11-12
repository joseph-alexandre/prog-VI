package decorator.questao1.classes.concretes;

import decorator.questao1.classes.abstracts.Beverage;
import decorator.questao1.classes.abstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return .50 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + " Mocha";
    }
}
