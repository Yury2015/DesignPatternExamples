import java.util.ArrayList;
import java.util.List;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 12:09 AM.
 */

/* Composite */
public class CompositeGraphic implements Graphic {

    // Collection of child graphics
    private List<Graphic> childGraphic = new ArrayList<>();

    // Prints the graphic
    @Override
    public void print() {
        for(Graphic graphic: childGraphic) {
            graphic.print();
        }
    }

    @Override
    public boolean isChild() {
        return false;
    }

    // Adds the graphic to the composition
    public void add(Graphic graphic) {
        childGraphic.add(graphic);
    }

    // Removes the graphic from the composition
    public void remove(Graphic graphic) {
        childGraphic.remove(graphic);
    }

    @Override
    public int getChildrenCount() {
        int sum = 0;
        for(Graphic graphic: childGraphic) {
            if (0 == graphic.getChildrenCount()) {
                sum = sum + 1;
            } else {
                sum = sum + graphic.getChildrenCount();
            }
        }
        return sum;
    }
}
