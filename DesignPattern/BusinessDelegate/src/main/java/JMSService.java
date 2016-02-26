/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/26/2016 11:40 PM.
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
