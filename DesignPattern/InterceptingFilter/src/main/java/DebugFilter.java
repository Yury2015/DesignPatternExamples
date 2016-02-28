/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 1:35 PM.
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
