package _1_NumberCounter;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel MainFrame;
    private JButton decreaseButton;
    private JButton increaseButton;
    private JLabel countLabel;

    public Main(){
        setContentPane(MainFrame);

        setTitle("Number Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(340,210);
        setLocationRelativeTo(null);
        setVisible(true);

        // ActionListener for increase button
        ActionListener increaseListener = _ -> {
            String text = countLabel.getText();
            int current = Integer.parseInt(text) + 1;
            countLabel.setText(String.valueOf(current));
        };

        // ActionListener for decrease button
        ActionListener decreaseListener = _ -> {
            String text = countLabel.getText();
            int current = Integer.parseInt(text) - 1;
            countLabel.setText(String.valueOf(current));
        };

        // Attach listeners to buttons
        increaseButton.addActionListener(increaseListener);
        decreaseButton.addActionListener(decreaseListener);
    }

    public static void main(String[] args) {
        new Main();
    }
}
