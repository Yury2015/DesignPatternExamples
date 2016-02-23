/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/19/2016 11:56 PM.
 */
public abstract class Singleton<T extends Singleton> {
    private static volatile Singleton instance;

    private Singleton() {
    }

    protected Singleton(T t){
        init(t);
    }

    public static <T extends Singleton> T getInstance(T t) {
        init(t);
        return (T)instance;
    }

    public static <T extends Singleton> T getInstance() {
        init(null);
        return (T)instance;
    }

    private static <T> void init(T t) {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance ) {
                    if (null == t) {

                    } else {
                        instance = (Singleton) t;
                    }
                }
            }
        }
    }
}
