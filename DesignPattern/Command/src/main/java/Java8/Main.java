package Java8;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 8:20 PM.
 */
public class Main {
    public static void main(String[] args) {
        CommandFactory cf = CommandFactory.init();
        cf.executeCommand("Light on");
        cf.executeCommand("Light off");
        cf.listCommands();
    }
}
