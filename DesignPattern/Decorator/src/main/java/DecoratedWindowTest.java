/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/22/2016 12:55 AM.
 */
public class DecoratedWindowTest {
    public static void main(String[] args) {
        // Create a decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = new HorizontalScrollBarDecorator(
                new VerticalScrollBarrDecorator(new SimpleWindow()));

        // Pring the Window's description
        System.out.println(decoratedWindow.getDescription());
    }

}
