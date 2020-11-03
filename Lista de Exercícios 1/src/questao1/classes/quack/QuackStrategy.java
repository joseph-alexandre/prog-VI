package questao1.classes.quack;

import questao1.interfaces.quack.QuackBehavior;

public class QuackStrategy implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
