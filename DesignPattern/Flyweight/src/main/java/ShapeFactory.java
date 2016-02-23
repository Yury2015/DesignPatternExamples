import java.util.HashMap;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 7:26 PM.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (null == circle) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }

}
