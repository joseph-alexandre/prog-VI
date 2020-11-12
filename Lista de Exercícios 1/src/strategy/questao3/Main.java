package strategy.questao3;

import strategy.questao3.classes.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exemplo de bateira: \n");
        EmbarcacaoContext embarcacao = new Bateira();
        embarcacao.navegar();

        System.out.println("\n-------------------------\n");

        System.out.println("Exemplo de canoa: \n");
        embarcacao = new Canoa();
        embarcacao.navegar();

        System.out.println("\n-------------------------\n");

        System.out.println("Exemplo de iate: \n");
        embarcacao = new Iate();
        embarcacao.navegar();

        System.out.println("\n-------------------------\n");

        System.out.println("Exemplo de jangada: \n");
        embarcacao = new Jangada();
        embarcacao.navegar();

        System.out.println("\n-------------------------\n");

        System.out.println("Exemplo de Barco à vela: \n");
        embarcacao = new BarcoVela();
        embarcacao.navegar();

    }
}
