/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/26/2016 11:45 PM.
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();

    }
}
