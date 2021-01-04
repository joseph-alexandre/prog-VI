package state.classes;

import state.interfaces.State;

public class VencedorState implements State {

    MaquinaBolinhaContext maquinaBolinhaContext;

    public VencedorState(MaquinaBolinhaContext maquinaBolinhaContext) {
        this.maquinaBolinhaContext = maquinaBolinhaContext;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Por favor, aguarde enquanto a máquina lhe devolve uma bolinha.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("A manivela já foi acionada.");
    }

    @Override
    public void virarManivela() {
        System.out.println("Acionar a manivela outra vez não irá garantir outra bolinha.");
    }

    @Override
    public void entregar() {
        if (this.maquinaBolinhaContext.count > 0){
            this.maquinaBolinhaContext.count -= 2;
            this.maquinaBolinhaContext.setState(new SemCreditoState(this.maquinaBolinhaContext));
            System.out.println("A máquina devolveu duas bolinhas.");
        } else {
            this.maquinaBolinhaContext.setState(new EsgotadoState(this.maquinaBolinhaContext));
            System.out.println("Não há mais bolinhas disponíveis.");
        }
    }
}
