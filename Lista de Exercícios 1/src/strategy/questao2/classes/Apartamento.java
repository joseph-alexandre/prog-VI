package strategy.questao2.classes;

public class Apartamento extends ImovelContext {
    public Apartamento(Float espaco, Integer comodos, Character localizacao) {
        super(espaco, comodos, localizacao);
        definirValorEdificacaoComportamento = new DefinirValorComEdificacaoStrategy();
    }
}
