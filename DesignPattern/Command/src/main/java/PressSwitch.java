/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 7:59 PM.
 */

/** The test class or client */
public class PressSwitch {
    public static void main(String[] args) {

        // Check number of arguments
        if (args.length != 1) {
            System.err.println("Argument \"ON\" or \"OFF\" is required.");
            System.exit(-1);
        }

        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        Switch mySwith = new Switch();

        switch (args[0]) {
            case "ON":
                mySwith.storeAndExecute(switchUp);
                break;
            case "OFF":
                mySwith.storeAndExecute(switchDown);
                break;
            default:
                System.err.println("Argument \"ON\" or \"OFF\" is required.");
                System.exit(-1);
        }
    }

}
