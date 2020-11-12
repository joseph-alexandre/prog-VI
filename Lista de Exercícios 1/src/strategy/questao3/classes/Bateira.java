package strategy.questao3.classes;

public class Bateira extends EmbarcacaoContext {

    public Bateira() {
        embarcacaoComportamento = new MotorStrategy();
    }
}
