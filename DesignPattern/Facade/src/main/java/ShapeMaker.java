/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 5:15 PM.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCirlce() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public  void drawRectangle() {
        rectangle.draw();
    }
}
