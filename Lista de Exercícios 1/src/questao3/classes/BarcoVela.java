package questao3.classes;

public class BarcoVela extends EmbarcacaoContext{
    public BarcoVela() {
        embarcacaoComportamento = new VelaStrategy();
    }
}
