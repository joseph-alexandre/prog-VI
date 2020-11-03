package questao1.classes.duck;

import questao1.interfaces.fly.FlyBehavior;
import questao1.interfaces.quack.QuackBehavior;

public abstract class DuckContext {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim(){};
    public void display(){}
    public void performQuack(){
        quackBehavior.quack();
    };
    public void performFly(){
        flyBehavior.fly();
    };
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    };
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    };
}
