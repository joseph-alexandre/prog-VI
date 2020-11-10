package strategy.questao1;

import strategy.questao1.classes.duck.*;

public class Main {

    public static void main(String[] args) {

        // Exemplo do Decoy Duck
        System.out.println("Decoy Duck: \n");
        DuckContext pato = new DecoyDuck();
        pato.display();
        pato.performFly();
        pato.performQuack();

        System.out.println("\n-------------------------\n");
        // Exemplo do Mallard Duck
        System.out.println("Mallard Duck: \n");
        pato = new MallardDuck();
        pato.display();
        pato.performFly();
        pato.performQuack();

        System.out.println("\n-------------------------\n");
        // Exemplo do Red Head Duck:
        System.out.println("Red Head Duck: \n");
        pato = new RedHeadDuck();
        pato.display();
        pato.performFly();
        pato.performQuack();

        System.out.println("\n-------------------------\n");
        // Exemplo do Rubber Duck:
        System.out.println("Rubber Duck: \n");
        pato = new RubberDuck();
        pato.display();
        pato.performFly();
        pato.performQuack();



    }

}
