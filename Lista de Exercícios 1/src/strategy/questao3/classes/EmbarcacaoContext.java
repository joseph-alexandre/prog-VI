package strategy.questao3.classes;

import strategy.questao3.interfaces.EmbarcacaoComportamento;

public class EmbarcacaoContext {

    EmbarcacaoComportamento embarcacaoComportamento;

    public void navegar(){
        this.embarcacaoComportamento.navegar();
    }

    public void setEmbarcacaoComportamento(EmbarcacaoComportamento embarcacaoComportamento) {
        this.embarcacaoComportamento = embarcacaoComportamento;
    }

}
