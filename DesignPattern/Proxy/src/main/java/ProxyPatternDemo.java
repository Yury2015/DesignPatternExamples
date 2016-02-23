/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 3:08 PM.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // image will be load from disk
        image.display();
        System.out.println("");

        // image will not be loaded from disk
        image.display();
    }
}
