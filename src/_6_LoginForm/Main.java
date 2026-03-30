package _6_LoginForm;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(382, 325);
        setLocationRelativeTo(null);
        setResizable(false);
        // Code below, don't touch above.

        JPanel MainFrame = new JPanel();
        MainFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        add(MainFrame);

        // Username Label
        JLabel usernameText = new JLabel("Username", SwingConstants.CENTER);
        usernameText.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(0, 0, 5, 150);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        MainFrame.add(usernameText, gbc);

        // Username Text Field
        JTextField userNameTextField = new JTextField();
        userNameTextField.setName("userNameTextField");
        userNameTextField.setPreferredSize(new Dimension(232, 42));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(5, 0, 20, 0);
        gbc.fill = GridBagConstraints.NONE;
        MainFrame.add(userNameTextField, gbc);

        // Password Label
        JLabel passText = new JLabel("Password", SwingConstants.CENTER);
        passText.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(15, 0, 20, 150);
        gbc.fill = GridBagConstraints.NONE;
        MainFrame.add(passText, gbc);

        // Password Text Field
        JPasswordField passwordTextField = new JPasswordField();
        passwordTextField.setName("passwordTextField");
        passwordTextField.setPreferredSize(new Dimension(232, 42));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(5, 0, 20, 0);
        gbc.fill = GridBagConstraints.NONE;
        MainFrame.add(passwordTextField, gbc);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton loginButton = new JButton("Login");
        loginButton.setName("loginButton");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
        loginButton.setOpaque(true);
        loginButton.setPreferredSize(new Dimension(67, 33));
        buttonPanel.add(loginButton);

        gbc.gridx = 1; // Right side
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0, 0, 20, 165);
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.weighty = 0;
        MainFrame.add(buttonPanel, gbc);

        // if username is admin and password is admin
        // Dialog output Login Successful!
        // else Login Failed!
        loginButton.addActionListener(_ -> {
            String username = userNameTextField.getText();
            String password = passwordTextField.getText();

            if (username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(Main.this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(Main.this, "Login Failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Don't touch below
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

