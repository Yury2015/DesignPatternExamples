/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/21/2016 9:35 PM.
 */

/** "Refined Abstraction" */
public class CircleShape extends Shape {
    private double x, y, radius;

    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Low-level i.e. Implementation specific
    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    // high-level i.e Abstraction specific
    @Override
    public void resizeByPercentage(double pct) {
        radius *= (1.0 + pct/100.0);
    }
}
