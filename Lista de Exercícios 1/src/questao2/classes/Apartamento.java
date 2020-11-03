package questao2.classes;

public class Apartamento extends Imovel {
    public Apartamento(Float espaco, Integer comodos, Character localizacao) {
        super(espaco, comodos, localizacao);
        definirValorEdificacaoComportamento = new DefinirValorComEdificacaoStrategy();
    }
}
