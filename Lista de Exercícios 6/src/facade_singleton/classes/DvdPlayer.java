package facade_singleton.classes;

public class DvdPlayer {
    Amplifier amplifier;

    public void on(){
        System.out.println("O DVD Player ligado.");
    }

    public void off(){
        System.out.println("O DVD Player está desligado.");
    }

    public void eject(){
        System.out.println("Ejetando o DVD.");
    }

    public void pause(){
        System.out.println("O DVD Player pausou 'Raiders of the Lost Ark'.");
    }

    public void play(){
        System.out.println("O DVD Player está reproduzindo 'Raiders of the Lost Ark'.");
    }

    public void setSurroundAudio(){
        System.out.println("Configurando o DVD Player para reproduzir com Surround Audio.");
    }

    public void setTwoChannelAudio(){
        System.out.println("Configurando o DVD Player para reproduzir com Two Channel Audio.");
    }

    public void stop(){
        System.out.println("O DVD Player está pausado.");
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }
}
