package questao2.classes;

import questao2.interfaces.DefinirValorComportamento;

public class LocalizacaoAStrategy implements DefinirValorComportamento {

    @Override
    public Float definirValor() {
        return 3000f;
    }
}
