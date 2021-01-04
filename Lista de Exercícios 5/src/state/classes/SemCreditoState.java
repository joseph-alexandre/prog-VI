package state.classes;

import state.interfaces.State;

public class SemCreditoState implements State {

    MaquinaBolinhaContext maquinaBolinhaContext;

    public SemCreditoState(MaquinaBolinhaContext maquinaBolinhaContext) {
        this.maquinaBolinhaContext = maquinaBolinhaContext;
    }

    @Override
    public void inserirMoeda() {
        this.maquinaBolinhaContext.setState(new ComCreditoState(this.maquinaBolinhaContext));
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Ainda não foi inserida uma moeda.");
    }

    @Override
    public void virarManivela() {
        System.out.println("Foi acionado a manivela porém não foi inserida uma moeda.");
    }

    @Override
    public void entregar() {
        System.out.println("Foi acionado a manivela porém não foi inserida uma moeda.");
    }
}
