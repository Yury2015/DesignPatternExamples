import java.util.List;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 12:47 AM.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
