package facade_singleton.classes;

public class CdPlayer {
    Amplifier amplifier;

    public void on(){
        System.out.println("O CD Player está ligado.");
    }

    public void off(){
        System.out.println("O CD Player está desligado.");
    }

    public void eject(){
        System.out.println("Ejetando o CD.");
    }

    public void pause(){
        System.out.println("Pausando o CD.");
    }

    public void play(){
        System.out.println("O CD Player está reproduzindo o álbum de AC/DC.");
    }

    public void stop(){
        System.out.println("O CD Player está pausado.");
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }
}
