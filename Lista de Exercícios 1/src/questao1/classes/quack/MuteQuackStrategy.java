package questao1.classes.quack;

import questao1.interfaces.quack.QuackBehavior;

public class MuteQuackStrategy implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Não posso fazer quack!");
    }
}
