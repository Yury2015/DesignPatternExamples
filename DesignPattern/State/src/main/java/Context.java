/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 11:03 PM.
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
