package decorator.questao2.classes.concretes;

import decorator.questao2.classes.Enum.Size;
import decorator.questao2.classes.abstracts.Beverage;
import decorator.questao2.classes.abstracts.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage, Size size) {
        this.beverage = beverage;
        this.size = size;
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        switch (this.size){
            case P:
                return .70 + beverage.cost();
            case M:
                return .80 + beverage.cost();
            case G:
                return .90 + beverage.cost();
        }
        return .70 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + " Soy";
    }
}
