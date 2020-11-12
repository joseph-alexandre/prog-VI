package decorator.questao2;

import decorator.questao2.classes.Enum.Size;
import decorator.questao2.classes.abstracts.Beverage;
import decorator.questao2.classes.concretes.*;

public class Application {

    public static void main(String[] args) {
        System.out.println("Exemplo de um Dark Roast simples: ");

        Beverage darkRoast = new DarkRoast(Size.M);
        System.out.println("Preço: " + darkRoast.cost());
        System.out.println("Descrição: " + darkRoast.getDescription());

        System.out.println("\n----------------------------------\n");

        System.out.println("Exemplo de um Dark Roast com Milk: ");

        darkRoast = new Milk(darkRoast, Size.G);
        System.out.println("Preço: " + darkRoast.cost());
        System.out.println("Descrição: " + darkRoast.getDescription());

        System.out.println("\n----------------------------------\n");

        System.out.println("Exemplo de um Dark Roast com Milk e Soy: ");

        darkRoast = new Soy(darkRoast);
        System.out.println("Preço: " + darkRoast.cost());
        System.out.println("Descrição: " + darkRoast.getDescription());

        System.out.println("\n----------------------------------\n");

        System.out.println("Exemplo de um Dark Roast com Milk e Soy e Mocha: ");

        darkRoast = new Mocha(darkRoast, Size.P);
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
