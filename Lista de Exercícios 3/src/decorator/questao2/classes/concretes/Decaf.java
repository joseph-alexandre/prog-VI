package decorator.questao2.classes.concretes;

import decorator.questao2.classes.Enum.Size;
import decorator.questao2.classes.abstracts.Beverage;

public class Decaf extends Beverage {

    public Decaf(Size size) {
        this.size = size;
    }

    public Decaf() {
    }

    @Override
    public Double cost() {
        switch (this.size){
            case P:
                return 4.5;
            case M:
                return 5.5;
            case G:
                return 6.5;
        }
        return 4.5;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}
