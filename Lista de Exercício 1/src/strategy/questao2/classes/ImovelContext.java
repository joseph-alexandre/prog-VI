package strategy.questao2.classes;

import strategy.questao2.interfaces.DefinirValorComportamento;

public abstract class ImovelContext {
    private Float espaco;
    private Integer comodos = 0;
    private Character localizacao;
    private Boolean isTerreno = false;
    DefinirValorComportamento definirValorEdificacaoComportamento;

    public ImovelContext(Float espaco, Integer comodos, Character localizacao) {
        this.espaco = espaco;
        this.comodos = comodos;
        this.localizacao = localizacao;
    }

    public ImovelContext(Float espaco, Character localizacao, Boolean isTerreno) {
        this.espaco = espaco;
        this.localizacao = localizacao;
        this.isTerreno = isTerreno;
    }

    public Float definirValor(){
        Float valorEdificacao = this.comodos * this.definirValorEdificacaoComportamento.definirValor();
        Float valorLocalizacao = this.espaco * this.getDefinirValorLocalizacaoComportamento().definirValor();
        return valorEdificacao + valorLocalizacao;
    }

    public DefinirValorComportamento getDefinirValorLocalizacaoComportamento() {
        switch (this.localizacao){
            case 'A':
                return !this.isTerreno ? new LocalizacaoAStrategy() : new LocalizacaoATerrenoStrategy();
            case 'B':
                return !this.isTerreno ? new LocalizacaoBStrategy() : new LocalizacaoBTerrenoStrategy();
            case 'C':
                return !this.isTerreno ? new LocalizacaoCStrategy() : new LocalizacaoCTerrenoStrategy();
            default:
                System.out.println("Localização indisponível.");
                return null;
        }
    }
}
