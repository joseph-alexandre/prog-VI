package command.classes.stereo;

public class Stereo {

    public void on(){
        System.out.println("O som está ligado!");
    }

    public void off(){
        System.out.println("O som está desligado!");
    }

    public void setCd(){
        System.out.println("CD foi inserido!");
    }

    public void setDvd(){
        System.out.println("DVD foi inserido!");
    }

    public void setRadio(){
        System.out.println("O rádio foi configurado!");
    }

    public void setVolume(int volume){
        System.out.println("O volume foi configurado no valor " + volume + "!");
    }

}
