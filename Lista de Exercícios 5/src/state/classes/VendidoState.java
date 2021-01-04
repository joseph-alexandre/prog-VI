package state.classes;

import state.interfaces.State;

public class VendidoState implements State {

    MaquinaBolinhaContext maquinaBolinhaContext;

    public VendidoState(MaquinaBolinhaContext maquinaBolinhaContext) {
        this.maquinaBolinhaContext = maquinaBolinhaContext;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Por favor, aguarde enquanto a máquina lhe devolva uma bolinha.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("A alavanca já foi acionada.");
    }

    @Override
    public void virarManivela() {
        System.out.println("A máquina não irá devolver mais de uma bolinha por vez.");
    }

    @Override
    public void entregar() {
        if (this.maquinaBolinhaContext.count > 0){
            this.maquinaBolinhaContext.count -=1;
            this.maquinaBolinhaContext.setState(new SemCreditoState(this.maquinaBolinhaContext));
            System.out.println("A máquina devolveu uma bolinha.");
        } else {
            this.maquinaBolinhaContext.setState(new EsgotadoState(this.maquinaBolinhaContext));
            System.out.println("Não há mais bolinhas disponíveis.");
        }
    }
}
