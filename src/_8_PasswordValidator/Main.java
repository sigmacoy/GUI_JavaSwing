package _8_PasswordValidator;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        setTitle("Password Validation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(358, 190); // 150% zoom sa pdf
        setLocationRelativeTo(null);
        setResizable(false);
        // Code below, don't touch above.

        JPanel MainFrame = new JPanel();
        MainFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        add(MainFrame);

        JPasswordField passwordTextField = new JPasswordField();
        passwordTextField.setName("passwordTextField");
        passwordTextField.setPreferredSize(new Dimension(225, 30));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 15, 50);
        MainFrame.add(passwordTextField, gbc);

        JLabel statusLabel = new JLabel("");
        statusLabel.setName("statusLabel");
        statusLabel.setForeground(Color.RED);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(15, 0, 0, 50);
        MainFrame.add(statusLabel, gbc);

        passwordTextField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { updateText(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { updateText(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { updateText(); }

            private void updateText() {
                String text = passwordTextField.getText();
                if (text.length() < 8) {
                    statusLabel.setText("Password must be 8 characters long");
                } else {
                    statusLabel.setText("Password is valid");
                }
            }
        });

        // don't touch below
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
