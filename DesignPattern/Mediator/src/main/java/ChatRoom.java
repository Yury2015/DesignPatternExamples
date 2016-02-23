import java.util.Date;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 9:04 PM.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
