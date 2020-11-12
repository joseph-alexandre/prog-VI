package strategy.questao2.classes;

public class Terreno extends ImovelContext {

    public Terreno(Float espaco, Character localizacao) {
        super(espaco, localizacao, true);
        definirValorEdificacaoComportamento = new DefinirValorSemEdificacaoStrategy();
    }
}
