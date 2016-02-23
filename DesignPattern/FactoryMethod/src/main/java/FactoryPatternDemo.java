/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/22/2016 10:58 PM.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle and call it draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call draw method of Circle
        shape1.draw();

        // get an object of Rectangle and call it draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // call draw method of Rectangle
        shape2.draw();

        // get an object of Square and call it draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        // call draw method of Square
        shape3.draw();

    }
}
