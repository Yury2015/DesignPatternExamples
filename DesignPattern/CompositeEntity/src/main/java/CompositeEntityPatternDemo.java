/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 1:10 PM.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();

        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
