import javax.swing.*;
import java.awt.event.*;

public class MouseListenerDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListener Demo");
        frame.setSize(400, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Move or click the mouse");
        label.setBounds(100, 50, 200, 30);

        frame.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at: " + e.getX() + "," + e.getY());
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
