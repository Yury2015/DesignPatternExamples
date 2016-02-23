/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 11:06 PM.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
