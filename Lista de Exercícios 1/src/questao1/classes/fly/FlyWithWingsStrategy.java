package questao1.classes.fly;

import questao1.interfaces.fly.FlyBehavior;

public class FlyWithWingsStrategy implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Estou voando!");
    }
}
