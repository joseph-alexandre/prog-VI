package questao1.classes.duck;

import questao1.classes.fly.FlyWithWingsStrategy;
import questao1.classes.quack.QuackStrategy;

public class RedHeadDuck extends DuckContext {

    public RedHeadDuck() {
        quackBehavior = new QuackStrategy();
        flyBehavior = new FlyWithWingsStrategy();
    }

    @Override
    public void display() {
        System.out.println("Parece um Red Head Duck!");
    }
}
