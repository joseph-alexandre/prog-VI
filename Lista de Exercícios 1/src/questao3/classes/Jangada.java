package questao3.classes;

public class Jangada extends EmbarcacaoContext {
    public Jangada() {
        embarcacaoComportamento = new RemoStrategy();
    }
}
