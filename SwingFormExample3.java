import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingFormExample3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example 3");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select a country:");
        String[] countries = {"USA", "Canada", "India", "Australia"};
        JComboBox<String> comboBox = new JComboBox<>(countries);

        JLabel listLabel = new JLabel("Select your hobbies:");
        String[] hobbies = {"Reading", "Traveling", "Music", "Sports"};
        JList<String> list = new JList<>(hobbies);

        JScrollPane scrollPane = new JScrollPane(list);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String country = (String) comboBox.getSelectedItem();
                String selectedHobbies = String.join(", ", list.getSelectedValuesList());
                JOptionPane.showMessageDialog(frame, "Country: " + country + "\nHobbies: " + selectedHobbies);
            }
        });

        frame.add(label);
        frame.add(comboBox);
        frame.add(listLabel);
        frame.add(scrollPane);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
