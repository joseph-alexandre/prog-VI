package decorator.questao2.classes.concretes;

import decorator.questao2.classes.Enum.Size;
import decorator.questao2.classes.abstracts.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        this.size = size;
    }

    public HouseBlend() {
    }

    @Override
    public Double cost() {
        switch (this.size){
            case P:
                return 2.0;
            case M:
                return 3.0;
            case G:
                return 4.0;
        }
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
