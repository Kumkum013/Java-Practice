import javax.swing.*;
import java.awt.event.*;

public class CombinedEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combined Events");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JButton button = new JButton("Click or Press Key");
        button.setBounds(100, 50, 200, 30);

        JLabel label = new JLabel("No event yet");
        label.setBounds(100, 100, 250, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        button.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + e.getKeyChar());
            }
            public void keyTyped(KeyEvent e) {}
            public void keyReleased(KeyEvent e) {}
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
