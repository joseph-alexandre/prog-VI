package strategy.questao2.classes;

import strategy.questao2.interfaces.DefinirValorComportamento;

public class LocalizacaoAStrategy implements DefinirValorComportamento {

    @Override
    public Float definirValor() {
        return 3000f;
    }
}
