package decorator.questao2.classes.concretes;

import decorator.questao2.classes.Enum.Size;
import decorator.questao2.classes.abstracts.Beverage;
import decorator.questao2.classes.abstracts.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage, Size size) {
        this.beverage = beverage;
        this.size = size;
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        switch (this.size){
            case P:
                return .20 + beverage.cost();
            case M:
                return .30 + beverage.cost();
            case G:
                return .40 + beverage.cost();
        }
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + " Milk";
    }
}
