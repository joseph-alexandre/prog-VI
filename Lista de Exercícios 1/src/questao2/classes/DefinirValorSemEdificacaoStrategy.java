package questao2.classes;

import questao2.interfaces.DefinirValorComportamento;

public class DefinirValorSemEdificacaoStrategy implements DefinirValorComportamento {

    Integer comodos;

    @Override
    public Float definirValor() {
        return 0f;
    }
}
