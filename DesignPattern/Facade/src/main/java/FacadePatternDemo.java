/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 5:18 PM.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCirlce();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
