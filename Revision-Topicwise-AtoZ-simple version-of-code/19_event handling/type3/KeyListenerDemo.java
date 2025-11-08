import javax.swing.*;
import java.awt.event.*;

public class KeyListenerDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener Demo");
        frame.setSize(400, 200);
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(100, 50, 200, 30);
        JLabel label = new JLabel("Type something...");
        label.setBounds(100, 100, 200, 30);

        textField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + e.getKeyChar());
            }
            public void keyReleased(KeyEvent e) {}
        });

        frame.add(textField);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

