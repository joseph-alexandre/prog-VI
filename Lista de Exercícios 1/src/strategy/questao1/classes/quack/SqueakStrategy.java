package strategy.questao1.classes.quack;

import strategy.questao1.interfaces.quack.QuackBehavior;

public class SqueakStrategy implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
