package questao2.classes;

import questao2.interfaces.DefinirValorComportamento;

public class LocalizacaoCTerrenoStrategy implements DefinirValorComportamento {

    @Override
    public Float definirValor() {
        return 200f;
    }
}
