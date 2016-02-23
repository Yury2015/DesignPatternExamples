/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 11:08 PM.
 */
public class StatePatternDemo {
    public static void main(String... args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
