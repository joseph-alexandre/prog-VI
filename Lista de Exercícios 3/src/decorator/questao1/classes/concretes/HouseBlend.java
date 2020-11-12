package decorator.questao1.classes.concretes;

import decorator.questao1.classes.abstracts.Beverage;

public class HouseBlend extends Beverage {

    @Override
    public Double cost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
