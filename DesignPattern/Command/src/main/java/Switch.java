/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 7:38 PM.
 */

import java.util.ArrayList;
import java.util.List;

/** The Invoker class */
public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd); // optional
        cmd.execute();
    }
}
