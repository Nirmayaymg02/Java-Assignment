import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickApplet extends Applet implements ActionListener {
    Button clickButton;

    public void init() {
        clickButton = new Button("Press Me");
        clickButton.addActionListener(this);
        add(clickButton);
    }

    public void actionPerformed(ActionEvent e) {
        clickButton.setLabel("Pressed!");
    }
}
