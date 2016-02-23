/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/22/2016 12:49 AM.
 */

// abstract decorator class - note that it implements Window
abstract class WindowDecorator implements Window {
    protected Window windowToBeDecorated; // the Window being decorated

    public WindowDecorator(Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    public void draw() {
        windowToBeDecorated.draw(); // Delegation
    }

    public String getDescription() {
        return windowToBeDecorated.getDescription(); //Delegation
    }

}
