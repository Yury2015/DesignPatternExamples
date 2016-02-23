/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 3:13 PM.
 */
public class MyClass extends Singleton {
    private static MyClass singleton = new MyClass() ;

    private MyClass() {
        super(singleton);
    }

    public static MyClass getInstance() {
        return singleton.<MyClass>getInstance(singleton);
    }

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
