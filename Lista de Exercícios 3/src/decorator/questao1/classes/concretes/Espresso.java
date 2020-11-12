package decorator.questao1.classes.concretes;

import decorator.questao1.classes.abstracts.Beverage;

public class Espresso extends Beverage {

    @Override
    public Double cost() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
