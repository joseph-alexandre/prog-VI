package state;

import state.classes.MaquinaBolinhaContext;

public class TesteMaquina {
    public static void main(String[] args) {
        MaquinaBolinhaContext maquinaBolinhaContext = new MaquinaBolinhaContext(5);

        maquinaBolinhaContext.inserirMoeda();

        maquinaBolinhaContext.virarManivela();

        maquinaBolinhaContext.entregar();

        System.out.println(maquinaBolinhaContext.getCount());



    }
}
