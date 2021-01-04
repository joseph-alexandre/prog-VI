package state.classes;

import state.interfaces.State;

public class MaquinaBolinhaContext {
    State comCredito;
    State esgotado;
    State semCredito;
    State vencedor;
    State vendido;

    private State state;
    Integer count = 0;

    public MaquinaBolinhaContext(Integer numeroBolinhas) {
        comCredito = new ComCreditoState(this);
        esgotado = new EsgotadoState(this);
        semCredito = new SemCreditoState(this);
        vencedor = new VencedorState(this);
        vendido = new VendidoState(this);

        this.count = numeroBolinhas;
        if(numeroBolinhas > 0) {
            state = semCredito;
        } else {
            state = esgotado;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void inserirMoeda() {
        state.inserirMoeda();
    }

    public void ejetarMoeda() {
        state.ejetarMoeda();
    }

    public void virarManivela() {
        state.virarManivela();
    }

    public void entregar() {
        state.entregar();
    }

    public Integer getCount() {
        return count;
    }

}
