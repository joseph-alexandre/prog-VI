package command.classes.ceilingFan;

import command.interfaces.Command;

public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.ceilingFan.high();
    }
}
