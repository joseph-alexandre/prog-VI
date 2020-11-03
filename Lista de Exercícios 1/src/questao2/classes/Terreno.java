package questao2.classes;

public class Terreno extends Imovel {

    public Terreno(Float espaco, Character localizacao) {
        super(espaco, localizacao, true);
        definirValorEdificacaoComportamento = new DefinirValorSemEdificacaoStrategy();
    }
}
