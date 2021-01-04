package facade_singleton.classes;

public class HomeTheaterFacade {

    private PopcornPopper popcornPopper;
    private TheaterLights theaterLights;
    private Projector projector;
    private Screen screen;
    private Tuner tuner;
    private CdPlayer cdPlayer;
    private DvdPlayer dvdPlayer;
    private Amplifier amplifier;
    private static HomeTheaterFacade instance;

    private HomeTheaterFacade() {
        this.popcornPopper = new PopcornPopper();
        this.theaterLights = new TheaterLights();
        this.amplifier = new Amplifier();
        this.dvdPlayer = new DvdPlayer();
        this.projector = new Projector();
        this.screen = new Screen();
        this.tuner = new Tuner();
        this.cdPlayer = new CdPlayer();
    }

    public void watchMovie(){
        System.out.println("Preparando para reproduzir o filme...");
        this.popcornPopper.on();
        this.popcornPopper.pop();
        this.theaterLights.dim();
        this.screen.down();
        this.projector.on();
        this.projector.setDvdPlayer(this.dvdPlayer);
        this.projector.wideScreenMode();
        this.amplifier.on();
        this.amplifier.setDvd(this.dvdPlayer);
        this.amplifier.setSurroundSound();
        this.amplifier.setVolume(5);
        this.dvdPlayer.on();
        this.dvdPlayer.play();
    }

    public void endMovie(){
        System.out.println("Desligando a reprodução do filme.");
        this.popcornPopper.off();
        this.theaterLights.on();
        this.screen.up();
        this.projector.off();
        this.amplifier.off();
        this.dvdPlayer.pause();
        this.dvdPlayer.eject();
        this.dvdPlayer.off();
    }

    public void listenToCd(){
        System.out.println("Preparando para reproduzir o CD...");
        this.amplifier.on();
        this.amplifier.setCd(this.cdPlayer);
        this.amplifier.setStereoSound();
        this.amplifier.setVolume(3);
        this.cdPlayer.on();
        this.cdPlayer.play();
    }

    public void endCd(){
        System.out.println("Desligando a reprodução do CD.");
        this.amplifier.off();
        this.cdPlayer.pause();
        this.cdPlayer.eject();
        this.cdPlayer.off();
    }

    public void listenToRadio(){
        System.out.println("Preparando para reproduzir o rádio...");
        this.amplifier.on();
        this.amplifier.setTuner(this.tuner);
        this.amplifier.setStereoSound();
        this.amplifier.setVolume(5);
        this.tuner.on();
        this.tuner.setAmplifier(this.amplifier);
        this.tuner.setFrequency();
        this.tuner.setFm();
    }

    public void endRadio(){
        System.out.println("Desligando a reprodução do áudio.");
        this.amplifier.off();
        this.tuner.off();
    }

    public static HomeTheaterFacade getInstance(){
        if(instance == null){
            return new HomeTheaterFacade();
        }
        return instance;
    }

}
