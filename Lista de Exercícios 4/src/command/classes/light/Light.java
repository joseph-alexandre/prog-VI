package command.classes.light;

public class Light {
    private String local;

    public Light(String local) {
        this.local = local;
    }

    public void on(){
        System.out.println("A luz do(a) " + this.local + " está ligada.");
    }

    public void off(){
        System.out.println("A luz do(a) " + this.local + " está desligada.");
    }
}
