package strategy.questao1.classes.duck;

import strategy.questao1.classes.fly.FlyNoWayStrategy;
import strategy.questao1.classes.quack.SqueakStrategy;

public class RubberDuck extends DuckContext {

    public RubberDuck() {
        flyBehavior = new FlyNoWayStrategy();
        quackBehavior = new SqueakStrategy();
    }

    @Override
    public void display() {
        System.out.println("Parece um Rubber Duck!");
    }
}
