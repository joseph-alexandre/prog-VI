package decorator.questao2.classes.concretes;

import decorator.questao2.classes.Enum.Size;
import decorator.questao2.classes.abstracts.Beverage;
import decorator.questao2.classes.abstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage, Size size) {
        this.beverage = beverage;
        this.size = size;
    }

    @Override
    public Double cost() {
        switch (this.size){
            case P:
                return .50 + beverage.cost();
            case M:
                return .60 + beverage.cost();
            case G:
                return .70 + beverage.cost();
        }
        return .50 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + " Mocha";
    }
}
