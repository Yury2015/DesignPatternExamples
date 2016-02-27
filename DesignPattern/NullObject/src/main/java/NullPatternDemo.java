/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 12:32 AM.
 */
public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
