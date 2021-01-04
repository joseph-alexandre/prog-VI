package state.classes;

import state.interfaces.State;

public class EsgotadoState implements State {
    MaquinaBolinhaContext maquinaBolinhaContext;

    public EsgotadoState(MaquinaBolinhaContext maquinaBolinhaContext) {
        this.maquinaBolinhaContext = maquinaBolinhaContext;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("A máquina está vazia.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Não foi inserida uma moeda.");
    }

    @Override
    public void virarManivela() {
        System.out.println("A máquina está vazia.");
    }

    @Override
    public void entregar() {
        System.out.println("Nenhuma bolinha foi fornecida.");
    }
}
