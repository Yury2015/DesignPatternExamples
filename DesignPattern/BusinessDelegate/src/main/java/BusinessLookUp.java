/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/26/2016 11:42 PM.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
