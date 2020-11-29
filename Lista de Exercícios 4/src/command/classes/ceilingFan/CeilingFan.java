package command.classes.ceilingFan;

public class CeilingFan {

    private String local;
    private Speed speed;

    public CeilingFan(String local) {
        this.local = local;
    }

    public void high(){
        this.speed = Speed.HIGH;
        System.out.println("O ventilador de teto do(a) " + this.local + " está funcionando na velocidade alta.");
    }

    public void medium(){
        this.speed = Speed.MEDIUM;
        System.out.println("O ventilador de teto do(a) " + this.local + " está funcionando na velocidade média.");
    }

    public void low(){
        this.speed = Speed.LOW;
        System.out.println("O ventilador de teto do(a) " + this.local + " está funcionando na velocidade baixa.");
    }

    public void off(){
        this.speed = Speed.OFF;
        System.out.println("O ventilador de teto do(a) " + this.local + " está desligado.");
    }

    public Speed getSpeed(){
        return this.speed;
    }



}
