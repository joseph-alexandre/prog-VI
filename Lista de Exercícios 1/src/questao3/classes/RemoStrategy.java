package questao3.classes;

import questao3.interfaces.EmbarcacaoComportamento;

public class RemoStrategy implements EmbarcacaoComportamento {

    @Override
    public void navegar() {
        System.out.println("Estou navegando por remo.");
    }
}
