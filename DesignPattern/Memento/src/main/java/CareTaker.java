import java.util.ArrayList;
import java.util.List;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 10:00 PM.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();


    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
