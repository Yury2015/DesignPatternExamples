/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 3:22 PM.
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.setRequest("HOME");
    }
}
