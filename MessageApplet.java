import java.applet.Applet;
import java.awt.Graphics;

public class MessageApplet extends Applet {
    public void paint(Graphics graphics) {
        graphics.drawString("Hello from MessageApplet!", 30, 40);
    }
}
