package facade_singleton.classes;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on(){
        System.out.println("O amplificador está ligado.");
    }

    public void off(){
        System.out.println("O amplificador está desligado.");
    }

    public void setCd(CdPlayer cdPlayer) {
        System.out.println("Configurando o CD Player.");
        this.cdPlayer = cdPlayer;
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Configurando o DVD Player.");
        this.dvdPlayer = dvdPlayer;
    }

    public void setStereoSound(){
        System.out.println("Configurando para reproduzir Stereo Sound.");
    }

    public void setSurroundSound(){
        System.out.println("Configurando para reproduzir Surround Sound.");
    }

    public void setVolume(Integer volume){
        System.out.println("Configurando o volume em " + volume + ".");
    }

    public void setTuner(Tuner tuner) {
        System.out.println("Configurando o Tuner.");
        this.tuner = tuner;
    }
}
