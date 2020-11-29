package command.classes;

import command.classes.RemoteControl;
import command.classes.ceilingFan.CeilingFan;
import command.classes.ceilingFan.CeilingFanOffCommand;
import command.classes.ceilingFan.CeilingFanOnCommand;
import command.classes.garage.GarageDoor;
import command.classes.garage.GarageDoorCloseCommand;
import command.classes.garage.GarageDoorOpenCommand;
import command.classes.light.Light;
import command.classes.light.LightOffCommand;
import command.classes.light.LightOnCommand;
import command.classes.stereo.Stereo;
import command.classes.stereo.StereoOffCommand;
import command.classes.stereo.StereoOnWithCDCommand;

public class RemoteLoader {
    private RemoteControl remoteControl;

    public RemoteLoader() {
        this.remoteControl = new RemoteControl();
    }

    public void main() {

        Light luzCozinha = new Light("Cozinha");
        Light luzGaragem = new Light("Garagem");
        CeilingFan ventiladorTetoCozinha = new CeilingFan("Cozinha");
        GarageDoor garagem = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand luzCozinhaComandoOn = new LightOnCommand(luzCozinha);
        LightOnCommand luzGaragemComandoOn = new LightOnCommand(luzGaragem);
        LightOffCommand luzCozinhaComandoOff = new LightOffCommand(luzCozinha);
        LightOffCommand luzGaragemComandoOff = new LightOffCommand(luzGaragem);

        CeilingFanOnCommand ventiladorTetoCozinhaComandoOn = new CeilingFanOnCommand(ventiladorTetoCozinha);
        CeilingFanOffCommand ventiladorTetoCozinhaComandoOff = new CeilingFanOffCommand(ventiladorTetoCozinha);

        GarageDoorOpenCommand garagemComandoOpen = new GarageDoorOpenCommand(garagem);
        GarageDoorCloseCommand garagemComandoClose = new GarageDoorCloseCommand(garagem);

        StereoOnWithCDCommand stereoComCdComandoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoComandoOff = new StereoOffCommand(stereo);

        this.remoteControl.setCommand(0, luzCozinhaComandoOn, luzCozinhaComandoOff);
        this.remoteControl.setCommand(1, luzGaragemComandoOn, luzGaragemComandoOff);
        this.remoteControl.setCommand(2, ventiladorTetoCozinhaComandoOn, ventiladorTetoCozinhaComandoOff);
        this.remoteControl.setCommand(3, stereoComCdComandoOn, stereoComandoOff);
        this.remoteControl.setCommand(4, garagemComandoOpen, garagemComandoClose);

        System.out.println(remoteControl);

        this.remoteControl.onButtonWasPushed(0);
        this.remoteControl.offButtonWasPushed(0);
        this.remoteControl.onButtonWasPushed(1);
        this.remoteControl.offButtonWasPushed(1);
        this.remoteControl.onButtonWasPushed(2);
        this.remoteControl.offButtonWasPushed(2);
        this.remoteControl.onButtonWasPushed(3);
        this.remoteControl.offButtonWasPushed(3);
        this.remoteControl.onButtonWasPushed(4);
        this.remoteControl.offButtonWasPushed(4);

    }
}
