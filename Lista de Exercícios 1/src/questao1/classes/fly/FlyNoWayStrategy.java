package questao1.classes.fly;

import questao1.interfaces.fly.FlyBehavior;

public class FlyNoWayStrategy implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Não posso voar.");
    }
}
