/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 7:54 PM.
 */

/** The command for turning off the light - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(Light theLight) {
        this.theLight = theLight;
    }

    @Override // Command
    public void execute() {
        theLight.turnOff();
    }
}
