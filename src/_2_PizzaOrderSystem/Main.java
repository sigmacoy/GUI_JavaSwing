package _2_PizzaOrderSystem;

import javax.swing.*;

public class Main extends JFrame {
    private JPanel MainFrame;
    private JComboBox<String> pizzaSizeChoice;
    private JLabel SizePanel;
    private JComboBox<String> pizzaToppingsChoice;
    private JComboBox<String> extraCheeseChoice;
    private JButton calculateButton;
    private JLabel totalLabel;

    public Main() {
        setContentPane(MainFrame);

        setTitle("Pizza Order System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(365,330);
        setLocationRelativeTo(null);
        setVisible(true);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        pizzaSizeChoice.addItem("Small");
        pizzaSizeChoice.addItem("Medium");
        pizzaSizeChoice.addItem("Large");

        pizzaToppingsChoice.addItem("Mushrooms");
        pizzaToppingsChoice.addItem("Pepperoni");
        pizzaToppingsChoice.addItem("Onions");

        extraCheeseChoice.addItem("Yes");
        extraCheeseChoice.addItem("No");

        // Button Action
        calculateButton.addActionListener(_ -> {
            int total = 0;

            String size = (String) pizzaSizeChoice.getSelectedItem();
            if (size.equals("Small")) {
                total += 10;
            } else if (size.equals("Medium")) {
                total += 15;
            } else if (size.equals("Large")) {
                total += 20;
            }

            String topping = (String) pizzaToppingsChoice.getSelectedItem();
            if (!topping.equals("None")) {
                total += 2;
            }

            String cheese = (String) extraCheeseChoice.getSelectedItem();
            if (cheese.equals("Yes")) {
                total += 3;
            }

            totalLabel.setText("₱" + total);
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
