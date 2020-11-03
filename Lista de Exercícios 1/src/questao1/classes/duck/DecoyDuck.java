package questao1.classes.duck;

import questao1.classes.fly.FlyNoWayStrategy;
import questao1.classes.quack.MuteQuackStrategy;
import questao1.classes.quack.SqueakStrategy;

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
