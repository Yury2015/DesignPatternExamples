
/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 8:31 PM.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
