/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/27/2016 12:24 AM.
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
