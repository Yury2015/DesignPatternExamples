import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/20/2016 12:12 AM.
 */
public class SingletonTest {

    @Test
    public void testSingleton() {

        // SetUP
        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();

        // Execute & verify
        assertNotNull(one);
        assertEquals(one, two);

        // Tear Down

    }

    @Test
    public void testMyClass() {

        // SetUP
        MyClass one = MyClass.getInstance();
        MyClass two = MyClass.getInstance();

        // Execute & verify
        assertNotNull(one);
        assertEquals(one, two);

        // Tear Down

    }

    @Test
    public void testFieldMyClass() {

        // SetUP
        MyClass one = MyClass.getInstance();
        MyClass two = MyClass.getInstance();


        one.setString("one");
        two.setString("two");

        // Execute & verify
        assertNotNull(one);
        assertNotNull(two);

        assertEquals(one, two);
        assertEquals("two", one.getString());

        // Tear Down

    }


}
