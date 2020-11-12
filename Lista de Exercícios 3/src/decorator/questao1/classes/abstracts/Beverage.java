package decorator.questao1.classes.abstracts;

public abstract class Beverage {

    protected String description;

    public Beverage() {
    }

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
