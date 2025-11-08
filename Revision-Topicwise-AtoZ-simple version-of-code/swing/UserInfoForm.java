package Projects.text_field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;

public class UserInfoForm extends JFrame {
    private JTextField nameField, streetField, cityField, pincodeField;
    private JTextArea displayArea;
    private JButton myInfoButton;
    
    // Custom rounded panel class
    class RoundedPanel extends JPanel {
        private Color backgroundColor;
        private int cornerRadius;
        private boolean hasShadow;
        
        public RoundedPanel(int radius, Color bgColor, boolean shadow) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
            hasShadow = shadow;
            setOpaque(false);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            if (hasShadow) {
                // Draw shadow
                g2d.setColor(new Color(0, 0, 0, 40));
                g2d.fillRoundRect(6, 6, getWidth() - 8, getHeight() - 8, cornerRadius, cornerRadius);
            }
            
            // Draw main rounded rectangle
            g2d.setColor(backgroundColor);
            g2d.fillRoundRect(0, 0, getWidth() - 8, getHeight() - 8, cornerRadius, cornerRadius);
        }
    }
    
    // Custom rounded text field
    class RoundedTextField extends JTextField {
        private int cornerRadius = 15;
        
        public RoundedTextField(int columns) {
            super(columns);
            setOpaque(false);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            if (hasFocus()) {
                g2d.setColor(new Color(241, 245, 249));
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
                g2d.setColor(new Color(99, 102, 241));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRoundRect(1, 1, getWidth() - 3, getHeight() - 3, cornerRadius, cornerRadius);
            } else {
                g2d.setColor(new Color(248, 250, 252));
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
                g2d.setColor(new Color(203, 213, 225));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRoundRect(1, 1, getWidth() - 3, getHeight() - 3, cornerRadius, cornerRadius);
            }
            
            super.paintComponent(g2d);
        }
        
        @Override
        protected void paintBorder(Graphics g) {
            // Border is painted in paintComponent
        }
    }
    
    public UserInfoForm() {
        setTitle("User Information Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 900);
        setLocationRelativeTo(null);
        
        // Main panel with gradient background
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                int w = getWidth();
                int h = getHeight();
                Color color1 = new Color(59, 130, 246);
                Color color2 = new Color(147, 51, 234);
                
                GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, w, h);
            }
        };
        mainPanel.setLayout(new BorderLayout(20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));
        
        // Title panel with rounded background
        RoundedPanel titlePanel = new RoundedPanel(25, new Color(255, 255, 255, 30), false);
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel titleLabel = new JLabel("Personal Information Form");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 34));
        titleLabel.setForeground(Color.WHITE);
        
        JLabel subtitleLabel = new JLabel("Fill in your details to continue");
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        subtitleLabel.setForeground(new Color(240, 240, 255));
        
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlePanel.add(titleLabel);
        titlePanel.add(Box.createVerticalStrut(8));
        titlePanel.add(subtitleLabel);
        
        // Card panel for form with rounded corners
        RoundedPanel cardPanel = new RoundedPanel(30, Color.WHITE, true);
        cardPanel.setLayout(new BorderLayout(10, 10));
        cardPanel.setBorder(BorderFactory.createEmptyBorder(40, 50, 40, 50));
        
        // Form panel with Grid Layout (2 rows x 2 columns)
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(2, 2, 30, 25));
        formPanel.setOpaque(false);
        
        // Create labels and rounded text fields
        String[] labels = {"Name:", "Street:", "City:", "Pincode:"};
        RoundedTextField[] fields = new RoundedTextField[4];
        
        for (int i = 0; i < labels.length; i++) {
            JPanel fieldContainer = new JPanel();
            fieldContainer.setLayout(new BorderLayout(10, 10));
            fieldContainer.setOpaque(false);
            
            JLabel label = new JLabel(labels[i]);
            label.setFont(new Font("Segoe UI", Font.BOLD, 18));
            label.setForeground(new Color(30, 41, 59));
            
            fields[i] = new RoundedTextField(20);
            fields[i].setFont(new Font("Segoe UI", Font.PLAIN, 16));
            fields[i].setPreferredSize(new Dimension(350, 50));
            fields[i].setBorder(BorderFactory.createEmptyBorder(10, 18, 10, 18));
            fields[i].setForeground(new Color(15, 23, 42));
            
            fieldContainer.add(label, BorderLayout.NORTH);
            fieldContainer.add(fields[i], BorderLayout.CENTER);
            
            formPanel.add(fieldContainer);
        }
        
        nameField = fields[0];
        streetField = fields[1];
        cityField = fields[2];
        pincodeField = fields[3];
        
        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
        
        // Rounded button with gradient
        myInfoButton = new JButton("MY INFO") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                GradientPaint gp;
                if (getModel().isPressed()) {
                    gp = new GradientPaint(0, 0, new Color(79, 70, 229), 0, getHeight(), new Color(124, 58, 237));
                } else if (getModel().isRollover()) {
                    gp = new GradientPaint(0, 0, new Color(99, 102, 241), 0, getHeight(), new Color(139, 92, 246));
                } else {
                    gp = new GradientPaint(0, 0, new Color(59, 130, 246), 0, getHeight(), new Color(147, 51, 234));
                }
                
                g2d.setPaint(gp);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                
                // Button shadow
                g2d.setColor(new Color(0, 0, 0, 20));
                g2d.fillRoundRect(0, 2, getWidth(), getHeight() - 2, 20, 20);
                
                g2d.setPaint(gp);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight() - 2, 20, 20);
                
                g2d.setColor(getForeground());
                FontMetrics fm = g2d.getFontMetrics();
                int x = (getWidth() - fm.stringWidth(getText())) / 2;
                int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
                g2d.drawString(getText(), x, y);
            }
        };
        
        myInfoButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        myInfoButton.setPreferredSize(new Dimension(280, 60));
        myInfoButton.setForeground(Color.WHITE);
        myInfoButton.setFocusPainted(false);
        myInfoButton.setBorderPainted(false);
        myInfoButton.setContentAreaFilled(false);
        myInfoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        buttonPanel.add(myInfoButton);
        
        // Combine form and button
        JPanel formContainer = new JPanel();
        formContainer.setLayout(new BorderLayout());
        formContainer.setOpaque(false);
        formContainer.add(formPanel, BorderLayout.CENTER);
        formContainer.add(buttonPanel, BorderLayout.SOUTH);
        
        cardPanel.add(formContainer, BorderLayout.CENTER);
        
        // Display area with rounded panel - LARGER SIZE
        RoundedPanel displayPanel = new RoundedPanel(30, Color.WHITE, true);
        displayPanel.setLayout(new BorderLayout(10, 10));
        displayPanel.setBorder(BorderFactory.createEmptyBorder(30, 35, 30, 35));
        
        JPanel labelContainer = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelContainer.setOpaque(false);
        
        JLabel displayLabel = new JLabel("Your Information:");
        displayLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        displayLabel.setForeground(new Color(30, 41, 59));
        
        labelContainer.add(displayLabel);
        
        // Rounded text area - MUCH LARGER
        displayArea = new JTextArea(10, 50) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                g2d.setColor(getBackground());
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                
                g2d.setColor(new Color(226, 232, 240));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRoundRect(1, 1, getWidth() - 3, getHeight() - 3, 20, 20);
                
                super.paintComponent(g2d);
            }
        };
        displayArea.setFont(new Font("Arial", Font.PLAIN, 32));
        displayArea.setEditable(false);
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        displayArea.setBackground(new Color(248, 250, 252));
        displayArea.setForeground(new Color(15, 23, 42));
        displayArea.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        displayArea.setOpaque(false);
        
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setPreferredSize(new Dimension(850, 280));
        
        displayPanel.add(labelContainer, BorderLayout.NORTH);
        displayPanel.add(scrollPane, BorderLayout.CENTER);
        
        // Add action listener
        myInfoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayUserInfo();
            }
        });
        
        // Center container
        JPanel centerContainer = new JPanel();
        centerContainer.setOpaque(false);
        centerContainer.setLayout(new BoxLayout(centerContainer, BoxLayout.Y_AXIS));
        centerContainer.add(cardPanel);
        centerContainer.add(Box.createVerticalStrut(25));
        centerContainer.add(displayPanel);
        
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(centerContainer, BorderLayout.CENTER);
        
        add(mainPanel);
        setVisible(true);
    }
    
    private void displayUserInfo() {
        String name = nameField.getText().trim();
        String street = streetField.getText().trim();
        String city = cityField.getText().trim();
        String pincode = pincodeField.getText().trim();
        
        if (name.isEmpty() || street.isEmpty() || city.isEmpty() || pincode.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Please fill in all fields!", 
                "Incomplete Information", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String info = String.format("Name: %s\nStreet: %s\nCity: %s\nPincode: %s", 
                                   name, street, city, pincode);
        displayArea.setText(info);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new UserInfoForm();
            }
        });
    }
}