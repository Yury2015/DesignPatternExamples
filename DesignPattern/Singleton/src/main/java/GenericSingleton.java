import java.util.HashMap;
import java.util.Map;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 2:10 PM.
 */
public class GenericSingleton<T extends Class, Singleton> {
    public static <T> T getInstance(T t) {
        return t;
    }
}
