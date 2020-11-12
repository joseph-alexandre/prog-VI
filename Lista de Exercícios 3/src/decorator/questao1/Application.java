package decorator.questao1;

import decorator.questao1.classes.abstracts.Beverage;
import decorator.questao1.classes.concretes.*;

public class Application {

    public static void main(String[] args) {
        System.out.println("Exemplo de um Dark Roast simples: ");

        Beverage darkRoast = new DarkRoast();
        System.out.println("Preço: " + darkRoast.cost());
        System.out.println("Descrição: " + darkRoast.getDescription());

        System.out.println("\n----------------------------------\n");

        System.out.println("Exemplo de um Dark Roast com Milk: ");

        darkRoast = new Milk(darkRoast);
        System.out.println("Preço: " + darkRoast.cost());
        System.out.println("Descrição: " + darkRoast.getDescription());

        System.out.println("\n----------------------------------\n");

        System.out.println("Exemplo de um Dark Roast com Milk e Soy: ");

        darkRoast = new Soy(darkRoast);
        System.out.println("Preço: " + darkRoast.cost());
        System.out.println("Descrição: " + darkRoast.getDescription());

        System.out.println("Exemplo de um Dark Roast com Milk e Soy e Mocha: ");

        darkRoast = new Mocha(darkRoast);
        System.out.println("Preço: " + darkRoast.cost());
        System.out.println("Descrição: " + darkRoast.getDescription());

        System.out.println("\n----------------------------------\n");

        System.out.println("Exemplo de um Dark Roast com Milk e Soy e Whip: ");

        darkRoast = new Whip(darkRoast);
        System.out.println("Preço: " + darkRoast.cost());
        System.out.println("Descrição: " + darkRoast.getDescription());

        //Exemplos das outras classes concretas omitidas por serem basicamente a mesma coisa.



    }
}
