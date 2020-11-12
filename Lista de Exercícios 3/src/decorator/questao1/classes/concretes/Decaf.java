package decorator.questao1.classes.concretes;

import decorator.questao1.classes.abstracts.Beverage;

public class Decaf extends Beverage {

    @Override
    public Double cost() {
        return 3.0;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}
