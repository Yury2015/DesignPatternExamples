/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 1:28 PM.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatcheRequest("HOME");
        frontController.dispatcheRequest("STUDENT");
    }
}
