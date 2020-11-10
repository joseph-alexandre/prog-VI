package strategy.questao2.classes;

import strategy.questao2.interfaces.DefinirValorComportamento;

public class DefinirValorSemEdificacaoStrategy implements DefinirValorComportamento {

    Integer comodos;

    @Override
    public Float definirValor() {
        return 0f;
    }
}
