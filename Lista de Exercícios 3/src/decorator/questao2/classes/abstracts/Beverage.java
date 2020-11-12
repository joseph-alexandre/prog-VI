package decorator.questao2.classes.abstracts;

import decorator.questao2.classes.Enum.Size;

public abstract class Beverage {

    protected String description;
    protected Size size = Size.P;

    public Beverage() {
    }

    public String getDescription() {
        return description;
    }

    public abstract Double cost();

    public void setDescription(String description) {
        this.description = description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
