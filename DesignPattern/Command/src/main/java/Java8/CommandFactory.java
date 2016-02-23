package Java8;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 8:10 PM.
 */

import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/** The CommandFactory class */
public class CommandFactory {
    private final HashMap<String, Command> commands;

    public CommandFactory() {
        commands = new HashMap<>();
    }

    public void addCommand(String name, Command command) {
        commands.put(name, command);
    }

    public void executeCommand(String name) {
        if (commands.containsKey(name)) {
            commands.get(name).apply();
        }
    }

    public void listCommands() {
        System.out.println("Enable command: " + commands.keySet().stream().collect(Collectors.joining(", ")));
    }


    /** Factory pattern */
    public static CommandFactory init(){
        CommandFactory cf = new  CommandFactory();

        // commands are added here using Lambdas. It is also possible to dynamically add commands without editing the code.
        cf.addCommand("Light on", () -> System.out.println("Light turned on"));
        cf.addCommand("Light off", () -> System.out.println("Light turned off"));

        return cf;
    }
}
