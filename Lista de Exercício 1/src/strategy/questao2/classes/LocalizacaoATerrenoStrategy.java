package strategy.questao2.classes;

import strategy.questao2.interfaces.DefinirValorComportamento;

public class LocalizacaoATerrenoStrategy implements DefinirValorComportamento {

    @Override
    public Float definirValor() {
        return 1500f;
    }

}
