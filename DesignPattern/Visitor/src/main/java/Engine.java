/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 9:04 PM.
 */
public class Engine implements ICarElement {
    @Override
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}
