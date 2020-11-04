package questao3.classes;

import questao3.interfaces.EmbarcacaoComportamento;

public class EmbarcacaoContext {

    EmbarcacaoComportamento embarcacaoComportamento;

    public void navegar(){
        this.embarcacaoComportamento.navegar();
    }

    public void setEmbarcacaoComportamento(EmbarcacaoComportamento embarcacaoComportamento) {
        this.embarcacaoComportamento = embarcacaoComportamento;
    }

}
