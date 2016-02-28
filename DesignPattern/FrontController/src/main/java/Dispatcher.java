/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 1:19 PM.
 */
public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        this.homeView = new HomeView();
        this.studentView = new StudentView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
