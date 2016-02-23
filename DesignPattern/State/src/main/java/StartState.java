/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 11:04 PM.
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
