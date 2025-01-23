import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingFormExample5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example 5");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);

        JLabel ageLabel = new JLabel("Age:");
        JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 0, 100, 1));

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                int age = (Integer) ageSpinner.getValue();
                JOptionPane.showMessageDialog(frame, "Username: " + username + "\nAge: " + age);
            }
        });

        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(ageLabel);
        frame.add(ageSpinner);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
