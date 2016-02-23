/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 12:18 AM.
 */

/* Leaf */
public class Ellipse implements Graphic {

    // Prints the Graphic
    @Override
    public void print() {
        System.out.println("Ellipse");
    }

    @Override
    public boolean isChild() {
        return true;
    }

    @Override
    public int getChildrenCount() {
        return 0;
    }
}
