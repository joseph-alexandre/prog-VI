package strategy.questao1.classes.duck;

import strategy.questao1.classes.fly.FlyWithWingsStrategy;
import strategy.questao1.classes.quack.QuackStrategy;

public class MallardDuck extends DuckContext {

    public MallardDuck() {
        quackBehavior = new QuackStrategy();
        flyBehavior = new FlyWithWingsStrategy();
    }

    @Override
    public void display() {

    }
}
