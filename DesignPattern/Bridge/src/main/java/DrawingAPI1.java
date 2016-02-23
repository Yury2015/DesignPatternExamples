/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 9:26 PM.
 */

/** "ConcreteImplementor" 1/2 */
public class DrawingAPI1 implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
    }
}
