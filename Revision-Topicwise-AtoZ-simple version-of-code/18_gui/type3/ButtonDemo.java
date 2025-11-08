import javax.swing.*;
import java.awt.event.*;

public class ButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Demo");
        frame.setSize(400, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Click the button:");
        label.setBounds(50, 50, 150, 30);

        JButton button = new JButton("Click Me");
        button.setBounds(200, 50, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
