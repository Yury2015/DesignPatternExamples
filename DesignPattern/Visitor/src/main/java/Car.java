/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 9:05 PM.
 */
public class Car implements ICarElement {
    ICarElement[] elements;

    public Car() {
        this.elements = new ICarElement[] { new Wheel("front left"),
                new Wheel("front right"), new Wheel("back left"),
                new Wheel("back wright"), new Body(), new Engine()};

    }

    @Override
    public void accept(ICarElementVisitor visitor) {
        for (ICarElement elem: elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
}

