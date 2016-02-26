/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/26/2016 11:52 PM.
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
