package strategy.questao3.classes;

import strategy.questao3.interfaces.EmbarcacaoComportamento;

public class VelaStrategy implements EmbarcacaoComportamento {

    @Override
    public void navegar() {
        System.out.println("Estou navegando por vela.");
    }
}
