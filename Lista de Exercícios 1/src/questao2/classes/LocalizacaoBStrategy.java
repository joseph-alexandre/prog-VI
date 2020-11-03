package questao2.classes;

import questao2.interfaces.DefinirValorComportamento;

public class LocalizacaoBStrategy implements DefinirValorComportamento {

    @Override
    public Float definirValor() {
        return 1000f;
    }
}
