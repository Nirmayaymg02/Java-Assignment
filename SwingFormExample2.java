import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingFormExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example 2");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select your gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JCheckBox newsletterCheck = new JCheckBox("Subscribe to newsletter");

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gender = male.isSelected() ? "Male" : "Female";
                String newsletter = newsletterCheck.isSelected() ? "Yes" : "No";
                JOptionPane.showMessageDialog(frame, "Gender: " + gender + "\nNewsletter: " + newsletter);
            }
        });

        frame.add(label);
        frame.add(male);
        frame.add(female);
        frame.add(newsletterCheck);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
