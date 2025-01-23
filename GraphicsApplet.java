import java.applet.Applet;
import java.awt.Graphics;

public class GraphicsApplet extends Applet {
    public void paint(Graphics graphics) {
        graphics.drawRect(50, 50, 120, 60); // Rectangle
        graphics.drawOval(200, 50, 70, 70); // Circle
        graphics.drawLine(50, 150, 250, 150); // Line
    }
}
