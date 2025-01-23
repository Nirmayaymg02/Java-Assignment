import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingFormExample4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example 4");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter your feedback:");
        JTextArea textArea = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String feedback = textArea.getText();
                JOptionPane.showMessageDialog(frame, "Feedback received:\n" + feedback);
            }
        });

        frame.add(label);
        frame.add(scrollPane);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
