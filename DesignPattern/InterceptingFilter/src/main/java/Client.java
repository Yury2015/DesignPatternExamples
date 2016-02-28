/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 3:20 PM.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void setRequest(String request) {
        filterManager.filterRequest(request);
    }
}
