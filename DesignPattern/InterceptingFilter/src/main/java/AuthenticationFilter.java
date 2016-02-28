/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 1:34 PM.
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
