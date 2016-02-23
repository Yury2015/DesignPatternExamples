/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 8:50 PM.
 */
public interface ICarElement {
    void accept(ICarElementVisitor visitor);
}
