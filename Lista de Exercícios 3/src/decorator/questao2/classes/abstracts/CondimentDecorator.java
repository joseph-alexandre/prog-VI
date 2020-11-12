package decorator.questao2.classes.abstracts;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public String getDescription() {
        return " and";
    }

}
