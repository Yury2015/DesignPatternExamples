import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 12:35 AM.
 */
public class CompositeGraphicTest {
    private Ellipse ellipse1;
    private Ellipse ellipse2;
    private Ellipse ellipse3;
    private Ellipse ellipse4;

    private CompositeGraphic graphic;
    private CompositeGraphic graphic1;
    private CompositeGraphic graphic2;

    private int count;

    @Before
    public void setUp() throws Exception {
        // Initialize four ellipses
        ellipse1 = new Ellipse();
        ellipse2 = new Ellipse();
        ellipse3 = new Ellipse();
        ellipse4 = new Ellipse();

        // Initialize three composite graphics
        graphic = new CompositeGraphic();
        graphic1 = new CompositeGraphic();
        graphic2 = new CompositeGraphic();

        count = 0;
    }

    @After
    public void tearDown() throws Exception {
        Ellipse ellipse1 = null;
        Ellipse ellipse2 = null;
        Ellipse ellipse3 = null;
        Ellipse ellipse4 = null;

        graphic = null;
        graphic1 = null;
        graphic2 = null;

        count = 0;
    }

    @Test
    public void testPrint() throws Exception {
        // Set Up
        count = 0;
        ellipse1 = new Ellipse() {
            @Override
            public void print() {
                super.print();
                ++count;
            }
        };
        ellipse2 = new Ellipse() {
            @Override
            public void print() {
                super.print();
                ++count;
            }
        };
        ellipse3 = new Ellipse() {
            @Override
            public void print() {
                super.print();
                ++count;
            }
        };
        ellipse4 = new Ellipse() {
            @Override
            public void print() {
                super.print();
                ++count;
            }
        };

        // Execute
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        graphic.print();
        assertEquals(4, count);
        assertEquals(4, graphic.getChildrenCount());
    }

    @Test
    public void testAdd() throws Exception {
        // Set Up

        // Execute
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);


        // Verify
        assertEquals(4, graphic.getChildrenCount());

        // Tear Down
    }

    @Test
    public void testRemove1() throws Exception {
        // Set Up
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        // Execute
        graphic.remove(ellipse1);

        // Verify
        assertEquals(4, graphic.getChildrenCount());

        // Tear Down
    }

    @Test
    public void testRemove2() throws Exception {
        // Set Up
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        // Execute
        graphic1.remove(ellipse1);

        // Verify
        assertEquals(3, graphic.getChildrenCount());

        // Tear Down
    }

}
