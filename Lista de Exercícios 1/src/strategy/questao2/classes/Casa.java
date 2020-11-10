package strategy.questao2.classes;

public class Casa extends ImovelContext {

    public Casa(Float espaco, Integer comodos, Character localizacao) {
        super(espaco, comodos, localizacao);
        definirValorEdificacaoComportamento = new DefinirValorComEdificacaoStrategy();
    }


}
