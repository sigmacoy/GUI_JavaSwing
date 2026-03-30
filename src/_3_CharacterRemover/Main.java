package _3_CharacterRemover;

import javax.swing.*;

public class Main extends JFrame {

    private JPanel MainFrame;
    private JLabel textLabel;
    private JCheckBox vowelsCheckBox;
    private JCheckBox consonantsCheckBox;
    private JCheckBox numbersCheckBox;
    private JButton removeButton;
    private JButton restoreButton;

    public Main() {
        setContentPane(MainFrame);

        setTitle("Character Remover");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(395,230);
        setLocationRelativeTo(null);
        setVisible(true);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        final String originalText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String output = textLabel.getText();

        // Remove button
        removeButton.addActionListener(_ -> {
            String output1 = textLabel.getText();

            // Remove vowels if checkbox selected
            if (vowelsCheckBox.isSelected()) {
                output1 = output1.replaceAll("[AEIOU]", "");
            }

            // Remove consonants if checkbox selected
            if (consonantsCheckBox.isSelected()) {
                output1 = output1.replaceAll("[BCDFGHJKLMNPQRSTVWXYZ]", "");
            }

            // Remove numbers if checkbox selected
            if (numbersCheckBox.isSelected()) {
                output1 = output1.replaceAll("[0-9]", "");
            }

            textLabel.setText(output1);
        });

        // Restore button
        restoreButton.addActionListener(_ -> {
            textLabel.setText(originalText);

            // Uncheck all checkboxes
            vowelsCheckBox.setSelected(false);
            consonantsCheckBox.setSelected(false);
            numbersCheckBox.setSelected(false);
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}

