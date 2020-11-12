package strategy.questao3.classes;

public class Canoa extends EmbarcacaoContext{
    public Canoa() {
        embarcacaoComportamento = new RemoStrategy();
    }
}
