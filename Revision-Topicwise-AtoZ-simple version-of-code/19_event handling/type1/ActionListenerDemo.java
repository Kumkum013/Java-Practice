import javax.swing.*;
import java.awt.event.*;

public class ActionListenerDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Demo");
        frame.setSize(400, 200);
        frame.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(150, 50, 100, 30);

        JLabel label = new JLabel("Button not clicked");
        label.setBounds(130, 100, 200, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
