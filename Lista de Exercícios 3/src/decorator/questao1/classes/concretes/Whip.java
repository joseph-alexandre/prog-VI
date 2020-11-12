package decorator.questao1.classes.concretes;

import decorator.questao1.classes.abstracts.Beverage;
import decorator.questao1.classes.abstracts.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return 1.0 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + " Whip";
    }
}
