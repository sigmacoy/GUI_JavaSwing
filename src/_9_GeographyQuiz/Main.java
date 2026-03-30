package _9_GeographyQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel mainPanel;
    private CardLayout cardLayout;
    final private JLabel scoreLabel1, scoreLabel2, scoreLabel3, scoreLabel4;
    private int score = 0;
    private int currentPanel = 1;

    private JTextField question1TextField;
    private JTextField question2TextField;
    private JTextField question3TextField;

    private boolean question1DoneFlag  = false;
    private boolean question2DoneFlag = false;
    private boolean question3DoneFlag = false;

    public Main() {
        setTitle("Geography Quiz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(345, 310);
        setLocationRelativeTo(null);

        scoreLabel1 = new JLabel("Your score: " + score + "/3");
        scoreLabel1.setFont(new Font("Arial", Font.BOLD, 13));

        scoreLabel2 = new JLabel("Your score: " + score + "/3");
        scoreLabel2.setFont(new Font("Arial", Font.BOLD, 13));

        scoreLabel3 = new JLabel("Your score: " + score + "/3");
        scoreLabel3.setFont(new Font("Arial", Font.BOLD, 13));

        scoreLabel4 = new JLabel("Your score: " + score + "/3");
        scoreLabel4.setFont(new Font("Arial", Font.BOLD, 13));

        initializeComponents();
        setContentPane(mainPanel);
        setVisible(true);
    }

    private void initializeComponents() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel panel1 = createPanel1();
        JPanel panel2 = createPanel2();
        JPanel panel3 = createPanel3();
        JPanel panel4 = createPanel4();

        mainPanel.add(panel1, "1");
        mainPanel.add(panel2, "2");
        mainPanel.add(panel3, "3");
        mainPanel.add(panel4, "4");
    }

    private JPanel createPanel1() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));

        panel.add(scoreLabel1, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(5, 1, 10, 10));

        JLabel questionLabel = new JLabel("What is the capital of France?");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerPanel.add(questionLabel);
        panel.add(centerPanel, BorderLayout.CENTER);

        JPanel textFieldPanel = new JPanel(new FlowLayout());
        question1TextField = new JTextField(17);
        textFieldPanel.add(question1TextField);
        centerPanel.add(textFieldPanel);

        createNavigation(centerPanel, false, true);

        return panel;
    }

    private JPanel createPanel2() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));

        panel.add(scoreLabel2, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(5, 1, 10, 10));

        JLabel questionLabel = new JLabel("What is the capital of Japan?");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerPanel.add(questionLabel);
        panel.add(centerPanel, BorderLayout.CENTER);

        JPanel textFieldPanel = new JPanel(new FlowLayout());
        question2TextField = new JTextField(17);
        textFieldPanel.add(question2TextField);
        centerPanel.add(textFieldPanel);

        createNavigation(centerPanel, true, true);

        return panel;
    }

    private JPanel createPanel3() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));

        panel.add(scoreLabel3, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(5, 1, 10, 10));

        JLabel questionLabel = new JLabel("What is the capital of Germany?");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerPanel.add(questionLabel);
        panel.add(centerPanel, BorderLayout.CENTER);

        JPanel textFieldPanel = new JPanel(new FlowLayout());
        question3TextField = new JTextField(17);
        textFieldPanel.add(question3TextField);
        centerPanel.add(textFieldPanel);

        createNavigation(centerPanel, true, true);

        return panel;
    }

    private JPanel createPanel4() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
//        panel.setBorder(BorderFactory.createCompoundBorder(
//                BorderFactory.createLineBorder(Color.RED, 2),  // Outer red border
//                BorderFactory.createEmptyBorder(20, 20, 10, 10) // Inner padding
//        ));
        panel.add(scoreLabel4, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        // centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1)); // Blue border

        JLabel text = new JLabel("Congratulations! You have finished the quiz.");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        // text.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 1));
        centerPanel.add(text);
        panel.add(centerPanel, BorderLayout.CENTER);

        JLabel empty1 = new JLabel();
        // empty1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1)); // Green border
        centerPanel.add(empty1);

        createNavigation(centerPanel, true, false);

        return panel;
    }

    private void createNavigation(JPanel centerPanel, boolean showBack, boolean showNext) {
        JPanel emptyPanel = new JPanel(new FlowLayout());
        centerPanel.add(emptyPanel);

        JPanel bothButtonsPanel = new JPanel(new BorderLayout());

        if (showBack) {
            JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JButton backButton = new JButton("Back");
            backButton.setFont(new Font("Arial", Font.PLAIN, 14));
            backButton.addActionListener(new backButtonListener());
            backPanel.add(backButton);
            backPanel.setBorder(BorderFactory.createEmptyBorder(0, 70, 0, 0));
            bothButtonsPanel.add(backPanel, BorderLayout.WEST);
        }

        if (showNext) {
            JPanel nextPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            JButton nextButton = new JButton("Next");
            nextButton.setFont(new Font("Arial", Font.PLAIN, 14));
            nextButton.addActionListener(new NextButtonListener());
            nextPanel.add(nextButton);
            nextPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 70));
            bothButtonsPanel.add(nextPanel, BorderLayout.EAST);
        }

        centerPanel.add(bothButtonsPanel);
    }

    private class NextButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            checkAnswerAndUpdateScore();
            currentPanel++;
            cardLayout.show(mainPanel, String.valueOf(currentPanel));
        }
    }

    private void updateAllScoreLabels() {
        String scoreText = "Your score: " + score + "/3";
        if (scoreLabel1 != null) scoreLabel1.setText(scoreText);
        if (scoreLabel2 != null) scoreLabel2.setText(scoreText);
        if (scoreLabel3 != null) scoreLabel3.setText(scoreText);
        if (scoreLabel4 != null) scoreLabel4.setText(scoreText);
    }

    private void checkAnswerAndUpdateScore() {
        String answer = "";
        boolean isCorrect = false;

        switch(currentPanel) {
            case 1 -> {
                if (question1TextField != null) {
                    if(question1DoneFlag) {
                        break;
                    }
                    answer = question1TextField.getText().trim();
                    isCorrect = answer.equalsIgnoreCase("Paris");
                    question1DoneFlag = true;
                    if(answer.isEmpty()){
                        question1DoneFlag = false;
                    }
                }
            }
            case 2 -> {
                if (question2TextField != null) {
                    if(question2DoneFlag) {
                        break;
                    }
                    answer = question2TextField.getText().trim();
                    isCorrect = answer.equalsIgnoreCase("Tokyo");
                    question2DoneFlag = true;
                    if(answer.isEmpty()){
                        question2DoneFlag = false;
                    }
                }
            }
            case 3 -> {
                if (question3TextField != null) {
                    if(question3DoneFlag) {
                        break;
                    }
                    answer = question3TextField.getText().trim();
                    isCorrect = answer.equalsIgnoreCase("Berlin");
                    question3DoneFlag = true;
                    if(answer.isEmpty()){
                        question3DoneFlag = false;
                    }
                }
            }
        }

        if(isCorrect) {
            score++;
            updateAllScoreLabels();
        }
    }

    private class backButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentPanel--;
            cardLayout.show(mainPanel, String.valueOf(currentPanel));
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}