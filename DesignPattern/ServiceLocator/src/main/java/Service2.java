/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/27/2016 12:24 AM.
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
