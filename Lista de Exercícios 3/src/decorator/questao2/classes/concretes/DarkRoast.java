package decorator.questao2.classes.concretes;

import decorator.questao2.classes.Enum.Size;
import decorator.questao2.classes.abstracts.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        this.size = size;
    }

    public DarkRoast() {
    }

    @Override
    public Double cost() {
        switch (this.size){
            case P:
                return 3.0;
            case M:
                return 4.0;
            case G:
                return 5.0;
        }
        return 3.0;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
}
