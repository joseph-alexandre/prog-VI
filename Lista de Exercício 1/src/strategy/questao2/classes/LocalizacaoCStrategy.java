package strategy.questao2.classes;

import strategy.questao2.interfaces.DefinirValorComportamento;

public class LocalizacaoCStrategy implements DefinirValorComportamento {

    @Override
    public Float definirValor() {
        return 500f;
    }
}
