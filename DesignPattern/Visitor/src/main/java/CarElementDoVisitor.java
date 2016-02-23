/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 9:12 PM.
 */
public class CarElementDoVisitor implements ICarElementVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Starting my car");
    }
}
