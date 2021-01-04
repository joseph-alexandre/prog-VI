package state.classes;

import state.interfaces.State;

public class ComCreditoState implements State {

    MaquinaBolinhaContext maquinaBolinhaContext;

    public ComCreditoState(MaquinaBolinhaContext maquinaBolinhaContext) {
        this.maquinaBolinhaContext = maquinaBolinhaContext;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Não pode inserir mais de uma moeda por vez.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda devolvida.");
        this.maquinaBolinhaContext.setState(new SemCreditoState(this.maquinaBolinhaContext));
    }

    @Override
    public void virarManivela() {
        this.maquinaBolinhaContext.setState(new VendidoState(this.maquinaBolinhaContext));
    }

    @Override
    public void entregar() {
        System.out.println("Nenhuma bolinha foi entregue.");
    }
}
