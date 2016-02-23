/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/22/2016 9:27 PM.
 */
abstract public class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // template method
    public final void play() {

        // initialize the game
        initialize();

        // start game
        startPlay();

        // end game
        endPlay();
    }
}
