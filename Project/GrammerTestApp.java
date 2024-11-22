package com.project;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrammerTestApp extends JFrame implements ActionListener {
    private final String[] questions = {
            "Select the correct sentence:",
            "Choose the correct form of the verb: 'He ___ to the market every day.'",
            "Identify the correct plural form of 'child':",
            "Which sentence uses the correct article?",
            "Find the correct spelling:"
    };
    private final String[][] options = {
            {"She go to school.", "She goes to school.", "She going to school.", "She gone to school."},
            {"go", "going", "goes", "gone"},
            {"childs", "children", "childes", "childrens"},
            {"An apple is red.", "A apple is red.", "An red apple.", "A red apple."},
            {"definately", "definitely", "definitly", "deffinetly"}
    };
    private final int[] correctAnswers = {1, 2, 1, 3, 1};
    private int score = 0;

    private int currentQuestionIndex = 0;
    private JLabel questionLabel;
    private JRadioButton[] optionButtons;
    private ButtonGroup optionsGroup;
    private JButton nextButton;

    public GrammerTestApp() {

        this.setTitle("Grammar Test");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        setLayout(new BorderLayout());
        questionLabel = new JLabel("Question will appear here", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1));
        optionButtons = new JRadioButton[4];
        optionsGroup = new ButtonGroup();
        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i] = new JRadioButton();
            optionsGroup.add(optionButtons[i]);
            optionsPanel.add(optionButtons[i]);
        }

        nextButton = new JButton("Next");
        nextButton.addActionListener(this);

        add(questionLabel, BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.CENTER);
        add(nextButton, BorderLayout.SOUTH);

        displayQuestion();
    }

    private void displayQuestion() {
        if (currentQuestionIndex < questions.length) {
            questionLabel.setText((currentQuestionIndex + 1) + ". " + questions[currentQuestionIndex]);
            String[] optionsForCurrentQuestion = options[currentQuestionIndex];
            for (int i = 0; i < optionButtons.length; i++) {
                optionButtons[i].setText(optionsForCurrentQuestion[i]);
                optionButtons[i].setSelected(false);
            }
        } else {
            showResult();
        }
    }

    private void showResult() {
        JOptionPane.showMessageDialog(this, "You scored " + score + " out of " + questions.length, "Quiz Completed", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int selectedOption = -1;
        for (int i = 0; i < optionButtons.length; i++) {
            if (optionButtons[i].isSelected()) {
                selectedOption = i;
                break;
            }
        }

        if (selectedOption == -1) {
            JOptionPane.showMessageDialog(this, "Please select an answer.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if (selectedOption == correctAnswers[currentQuestionIndex]) {
                score++;
            }
            currentQuestionIndex++;
            displayQuestion();
        }
    }
}
   /* public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GrammerTestApp().setVisible(true));
    }
}
*/