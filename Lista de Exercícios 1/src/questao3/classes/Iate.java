package questao3.classes;

public class Iate extends EmbarcacaoContext {
    public Iate() {
        embarcacaoComportamento = new MotorStrategy();
    }
}
