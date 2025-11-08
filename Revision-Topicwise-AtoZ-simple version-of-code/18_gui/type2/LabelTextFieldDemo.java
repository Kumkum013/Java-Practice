import javax.swing.*;

public class LabelTextFieldDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label & TextField Demo");
        frame.setSize(400, 200);
        frame.setLayout(null); // Using absolute positioning

        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 50, 120, 30);

        JTextField textField = new JTextField();
        textField.setBounds(180, 50, 150, 30);

        frame.add(label);
        frame.add(textField);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
