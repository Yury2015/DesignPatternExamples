/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/22/2016 9:00 PM.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
