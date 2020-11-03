package questao2.classes;

import questao2.interfaces.DefinirValorComportamento;

public class LocalizacaoATerrenoStrategy implements DefinirValorComportamento {

    @Override
    public Float definirValor() {
        return 1500f;
    }

}
