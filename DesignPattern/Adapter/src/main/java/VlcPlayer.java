/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/23/2016 4:09 PM.
 */
public class VlcPlayer implements AdvancedMedaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);

    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
