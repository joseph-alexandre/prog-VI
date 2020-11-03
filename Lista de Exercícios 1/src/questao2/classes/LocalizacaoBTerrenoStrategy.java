package questao2.classes;

import questao2.interfaces.DefinirValorComportamento;

public class LocalizacaoBTerrenoStrategy implements DefinirValorComportamento {

    @Override
    public Float definirValor() {
        return 750f;
    }
}
