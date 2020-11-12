package decorator.questao1.classes.concretes;

import decorator.questao1.classes.abstracts.Beverage;

public class DarkRoast extends Beverage {

    @Override
    public Double cost() {
        return 3.0;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
}
