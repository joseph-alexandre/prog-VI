package facade_singleton.classes;

public class Projector {

    DvdPlayer dvdPlayer;

    public void on(){
        System.out.println("O projetor está ligado.");
    }

    public void off(){
        System.out.println("O projetor está desligado.");
    }

    public void tvMode(){
        System.out.println("O modo TV está ativado.");
    }

    public void wideScreenMode(){
        System.out.println("O modo Wide Screen está ativado.");
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
}
