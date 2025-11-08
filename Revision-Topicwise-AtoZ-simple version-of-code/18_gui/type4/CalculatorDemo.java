import javax.swing.*;
import java.awt.event.*;

public class CalculatorDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JTextField num1 = new JTextField();
        num1.setBounds(50, 50, 100, 30);
        JTextField num2 = new JTextField();
        num2.setBounds(200, 50, 100, 30);
        JTextField result = new JTextField();
        result.setBounds(125, 100, 100, 30);
        result.setEditable(false);

        JButton add = new JButton("Add");
        add.setBounds(150, 150, 80, 30);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                result.setText(String.valueOf(a + b));
            }
        });

        frame.add(num1);
        frame.add(num2);
        frame.add(result);
        frame.add(add);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
