/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 3:04 PM.
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}

