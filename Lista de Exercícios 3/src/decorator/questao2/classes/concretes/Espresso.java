package decorator.questao2.classes.concretes;

import decorator.questao2.classes.Enum.Size;
import decorator.questao2.classes.abstracts.Beverage;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        this.size = size;
    }

    public Espresso() {
    }

    @Override
    public Double cost() {
        switch (this.size){
            case P:
                return 1.25;
            case M:
                return 2.25;
            case G:
                return 3.25;
        }
        return 1.25;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }

}
