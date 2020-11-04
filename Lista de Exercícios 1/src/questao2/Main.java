package questao2;

import questao2.classes.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exemplo de casa: \n");
        ImovelContext imovel = new Casa(30f, 5, 'A');
        System.out.println(imovel.definirValor());

        System.out.println("\n-------------------------\n");

        System.out.println("Exemplo de apartamento: \n");
        imovel = new Apartamento(30f, 5, 'C');
        System.out.println(imovel.definirValor());

        System.out.println("\n-------------------------\n");

        System.out.println("Exemplo de terreno: \n");
        imovel = new Terreno(30f, 'A');
        System.out.println(imovel.definirValor());

    }
}
