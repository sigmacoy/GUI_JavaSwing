package _5_CharacterCounter;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private int count;

    public Main() {
        setTitle("Character Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(423, 321);
        setLocationRelativeTo(null);
        setResizable(false);
        // Code below, don't touch above.
        JPanel MainFrame = new JPanel();
        MainFrame.setLayout(new GridBagLayout());
        add(MainFrame);

        JTextArea messageTextArea = new JTextArea(13, 27); // rows, columns
        messageTextArea.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(messageTextArea);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.weightx = 1.0; gbc.weighty = 0.10;
        MainFrame.add(scrollPane, gbc);

        JPanel entCharPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JLabel entCharLabel = new JLabel("Enter character: ");
        entCharPanel.add(entCharLabel);
        JTextField characterTextField = new JTextField();
        characterTextField.setPreferredSize(new Dimension(50, 19));
        entCharPanel.add(characterTextField);

        entCharPanel.setPreferredSize(new Dimension(160, 20));
        gbc.insets = new Insets(10, 50, 0, 0);
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.weightx = 1.0; gbc.weighty = 0.5;
        MainFrame.add(entCharPanel, gbc);

        JPanel countPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JLabel countLabel = new JLabel("Count:                    " + count);
        countPanel.add(countLabel);
        countPanel.setPreferredSize(new Dimension(160, 20));
        gbc.insets = new Insets(0, 50, 10, 0);
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.weightx = 1.0; gbc.weighty = 0.4;
        MainFrame.add(countPanel, gbc);

        JButton countButton = new JButton("Count");
        countButton.setFont(new Font("Arial", Font.PLAIN, 12));
        countButton.setPreferredSize(new Dimension(50, 20));
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 0, 0, 50);
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.weightx = 1; gbc.weighty = 1;
        MainFrame.add(countButton, gbc);

        // Don't touch below
        setVisible(true);

        countButton.addActionListener(_ -> {
            String text = messageTextArea.getText();
            String character = characterTextField.getText();

            if (character.length() == 1) {
                count = 0;
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == character.charAt(0)) {
                        count++;
                    }
                }
                countLabel.setText("Count:                    " + count);
            } else {
                JOptionPane.showMessageDialog(Main.this, "Please enter exactly one character!");
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
