package decorator.questao2.classes.concretes;

import decorator.questao2.classes.Enum.Size;
import decorator.questao2.classes.abstracts.Beverage;
import decorator.questao2.classes.abstracts.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage, Size size) {
        this.beverage = beverage;
        this.size = size;
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        switch (this.size){
            case P:
                return 1.0 + beverage.cost();
            case M:
                return 1.10 + beverage.cost();
            case G:
                return 1.20 + beverage.cost();
        }
        return 1.0 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + " Whip";
    }
}
