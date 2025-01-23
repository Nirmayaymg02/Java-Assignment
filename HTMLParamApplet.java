import java.applet.Applet;
import java.awt.Graphics;

public class HTMLParamApplet extends Applet {
    String userMessage;

    public void init() {
        userMessage = getParameter("userMessage");
        if (userMessage == null) {
            userMessage = "Default Parameter Message!";
        }
    }

    public void paint(Graphics graphics) {
        graphics.drawString(userMessage, 40, 50);
    }
}
