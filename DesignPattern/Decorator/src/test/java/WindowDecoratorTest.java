import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/22/2016 1:09 AM.
 */
public class WindowDecoratorTest {

    @Test
    public void testWindowDecoratorTest() {
        Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarrDecorator(new SimpleWindow()));

        // assert that the description indeed includes horizontal + vertical scrollbars
        assertEquals("simple window, including vertical scrollbars, including horizontal scrollbars", decoratedWindow.getDescription());
    }

}
