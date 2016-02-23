/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 7:53 PM.
 */

/** The command for turning on the light - ConcreteCommand #1 */
public class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(Light theLight) {
        this.theLight = theLight;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}
