/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 9:31 PM.
 */

/** Abstraction */
abstract class Shape {
    protected DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();                           // Low-level
    public abstract void resizeByPercentage(double pct);   // high-level
}
