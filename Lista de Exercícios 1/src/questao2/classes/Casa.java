package questao2.classes;

public class Casa extends Imovel {

    public Casa(Float espaco, Integer comodos, Character localizacao) {
        super(espaco, comodos, localizacao);
        definirValorEdificacaoComportamento = new DefinirValorComEdificacaoStrategy();
    }


}
