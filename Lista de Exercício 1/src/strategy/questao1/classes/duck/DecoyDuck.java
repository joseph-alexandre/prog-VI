package strategy.questao1.classes.duck;

import strategy.questao1.classes.fly.FlyNoWayStrategy;
import strategy.questao1.classes.quack.MuteQuackStrategy;

public class DecoyDuck extends DuckContext {

    public DecoyDuck() {
        flyBehavior = new FlyNoWayStrategy();
        quackBehavior = new MuteQuackStrategy();
    }

    @Override
    public void display() {
        System.out.println("Parece um Decoy Duck!");
    }
}
