import javax.lang.model.element.ElementVisitor;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 8:49 PM.
 */
public class Wheel implements ICarElement {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ICarElementVisitor visitor) {
        /*
         * accept(ICarElementVisitor) in Wheel elements
         * accept(ICarElementVisitor) in ICarElement, so the call
         * to accept is bound at run time. This can be considered
         * the first dispatch. However, the desision to call
         * visit(Wheel) (as opposed to visit(Engine) etc.) can be
         * made during compile time since 'this' is klown at compile
         * time to be a Wheel. Moreever, each implementation of
         * ICarElementVisitor implements the visit(Wheel), which is
         * another desision that is made at run time. This can be considered
         * the second dispatch.
         */
        visitor.visit(this);

    }
}
