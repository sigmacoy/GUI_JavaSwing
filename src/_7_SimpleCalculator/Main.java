package _7_SimpleCalculator;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(444, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        // Code below, don't touch above.

        JPanel MainFrame = new JPanel();
        MainFrame.setBackground(Color.lightGray);
        MainFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        add(MainFrame);

        JLabel num1Text = new JLabel("1st Number", SwingConstants.CENTER);
        num1Text.setFont(new Font("Arial", Font.BOLD, 12));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 10);
        MainFrame.add(num1Text, gbc);

        JLabel empty1 = new JLabel(" ", SwingConstants.CENTER);
        empty1.setBackground(Color.lightGray);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        MainFrame.add(empty1, gbc);

        JLabel num2Text = new JLabel("2nd Number", SwingConstants.CENTER);
        num2Text.setFont(new Font("Arial", Font.BOLD, 12));
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        MainFrame.add(num2Text, gbc);

        JLabel resultText = new JLabel("Result", SwingConstants.CENTER);
        resultText.setFont(new Font("Arial", Font.BOLD, 12));
        resultText.setBackground(Color.lightGray);
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 35, 5, 5);
        MainFrame.add(resultText, gbc);

        // ROW 1 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JTextField tfNumber1 = new JTextField();
        tfNumber1.setName("tfNumber1");
        tfNumber1.setPreferredSize(new Dimension(82, 25));
        tfNumber1.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        MainFrame.add(tfNumber1, gbc);

        JComboBox cbOperations = new JComboBox(new String[]{"+", "-", "*", "/"});
        cbOperations.setName("cbOperations");
        cbOperations.setPreferredSize(new Dimension(70, 25));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        MainFrame.add(cbOperations, gbc);

        JTextField tfNumber2 = new JTextField();
        tfNumber2.setName("tfNumber2");
        tfNumber2.setPreferredSize(new Dimension(82, 25));
        tfNumber2.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        MainFrame.add(tfNumber2, gbc);

        JPanel resPanel = new JPanel();
        resPanel.setPreferredSize(new Dimension(70, 25));
        resPanel.setBackground(Color.lightGray);
        resPanel.setBorder(new LineBorder(Color.black, 1, true));
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 35, 5, 5);
            JLabel lblResult = new JLabel("", SwingConstants.CENTER);
            lblResult.setName("lblResult");
            resPanel.add(lblResult, gbc);

        MainFrame.add(resPanel, gbc);

        // ROW 2 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btnCompute = new JButton("Compute Result");
        btnCompute.setBackground(Color.lightGray);
        btnCompute.setPreferredSize(new Dimension(125, 35));
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 5, 5, 5);
        MainFrame.add(btnCompute, gbc);

        // END OF UI ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        btnCompute.addActionListener(_ -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            String operator = cbOperations.getSelectedItem().toString();

            if(operator.equals("/") && num2 == 0) {
                lblResult.setText("?");
                return;
            }

            int ans = switch (operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num1 * num2;
                default -> throw new IllegalStateException("Unexpected value: " + operator);
            };

            lblResult.setText(String.valueOf(ans));

        });

        // Don't touch below
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

