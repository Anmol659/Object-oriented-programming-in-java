package com.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class Frame extends JFrame implements ActionListener, KeyListener {
    // Typing test fields (existing code)
    String passage = "";
    String typedPass = "";
    String message = "";
    String name = "";

    int typed = 0;
    int count = 0;
    int WPM;

    double start;
    double end;
    double elapsed;
    double seconds;

    boolean running;
    boolean ended;

    final int SCREEN_WIDTH;
    final int SCREEN_HEIGHT;
    final int DELAY = 100;

    JButton button;
    Timer timer;
    JLabel label;

    Connection connection;



    public Frame() {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SCREEN_WIDTH = 720;
        SCREEN_HEIGHT = 400;
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        button = new JButton("Start");
        button.setFont(new Font("Candara", Font.BOLD, 30));
        button.setForeground(Color.BLUE);
        button.setVisible(true);
        button.addActionListener(this);
        button.setFocusable(false);

        label = new JLabel();
        label.setText("Click the Start Button");
        label.setFont(new Font("Candara", Font.BOLD, 30));
        label.setVisible(true);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.lightGray);

        this.add(button, BorderLayout.SOUTH);
        this.add(label, BorderLayout.NORTH);
        this.getContentPane().setBackground(Color.WHITE);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setResizable(false);
        this.setTitle("Typing Test");
        this.revalidate();

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/typingtest", "root", "root");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database connection failed: " + e.getMessage());
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.setFont(new Font("Candara", Font.BOLD, 25));

        if (running) {
            if (passage.length() > 1) {
                g.drawString(passage.substring(0, 50), g.getFont().getSize(), g.getFont().getSize() * 5);
                g.drawString(passage.substring(50, 100), g.getFont().getSize(), g.getFont().getSize() * 7);
                g.drawString(passage.substring(100, 150), g.getFont().getSize(), g.getFont().getSize() * 9);
                g.drawString(passage.substring(150, 200), g.getFont().getSize(), g.getFont().getSize() * 11);
            }

            g.setColor(Color.GREEN);
            if (typedPass.length() > 0) {
                if (typed < 50)
                    g.drawString(typedPass.substring(0, typed), g.getFont().getSize(), g.getFont().getSize() * 5);
                else
                    g.drawString(typedPass.substring(0, 50), g.getFont().getSize(), g.getFont().getSize() * 5);
            }
            if (typedPass.length() > 50) {
                if (typed < 100)
                    g.drawString(typedPass.substring(50, typed), g.getFont().getSize(), g.getFont().getSize() * 7);
                else
                    g.drawString(typedPass.substring(50, 100), g.getFont().getSize(), g.getFont().getSize() * 7);
            }
            if (typedPass.length() > 100) {
                if (typed < 150)
                    g.drawString(typedPass.substring(100, typed), g.getFont().getSize(), g.getFont().getSize() * 9);
                else
                    g.drawString(typedPass.substring(100, 150), g.getFont().getSize(), g.getFont().getSize() * 9);
            }
            if (typedPass.length() > 150)
                g.drawString(typedPass.substring(150, typed), g.getFont().getSize(), g.getFont().getSize() * 11);
            running = false;
        }
        if (ended) {
            if (WPM <= 40)
                message = "You are an Average Typist";
            else if (WPM > 40 && WPM <= 60)
                message = "You are a Good Typist";
            else if (WPM > 60 && WPM <= 100)
                message = "You are an Excellent Typist";
            else
                message = "You are an Elite Typist";

            FontMetrics metrics = getFontMetrics(g.getFont());
            g.setColor(Color.BLUE);
            g.drawString("Typing Test Completed!", (SCREEN_WIDTH - metrics.stringWidth("Typing Test Completed!")) / 2, g.getFont().getSize() * 6);

            g.setColor(Color.BLACK);
            g.drawString("Typing Speed: " + WPM + " Words Per Minute", (SCREEN_WIDTH - metrics.stringWidth("Typing Speed: " + WPM + " Words Per Minute")) / 2, g.getFont().getSize() * 9);
            g.drawString(message, (SCREEN_WIDTH - metrics.stringWidth(message)) / 2, g.getFont().getSize() * 11);

            saveResultsToDatabase(name, WPM);
            showLeaderboard();

            timer.stop();
            ended = false;
            SwingUtilities.invokeLater(() -> new GrammerTestApp().setVisible(true));
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (passage.length() > 1) {
            if (count == 0)
                start = System.nanoTime();
            else if (count == 200) {
                end = System.nanoTime();
                elapsed = end - start;
                seconds = elapsed / 1_000_000_000.0;
                WPM = (int) (((200.0 / 5) / seconds) * 60);
                ended = true;
                running = false;
                count++;
            }
            char[] pass = passage.toCharArray();
            if (typed < 200) {
                running = true;
                if (e.getKeyChar() == pass[typed]) {
                    typedPass = typedPass + pass[typed];
                    typed++;
                    count++;
                }
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            name = JOptionPane.showInputDialog(this, "Enter your name:", "Typing Test", JOptionPane.QUESTION_MESSAGE);
            if (name == null || name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            passage = getPassage();

            timer = new Timer(DELAY, this);
            timer.start();
            running = true;
            ended = false;

            typedPass = "";
            message = "";

            typed = 0;
            count = 0;
        }
        if (running)
            repaint();
        if (ended)
            repaint();
    }

    public void saveResultsToDatabase(String name, int wpm) {
        String query = "INSERT INTO leaderboard (name, wpm) VALUES (?, ?) " +
                "ON DUPLICATE KEY UPDATE wpm = GREATEST(wpm, VALUES(wpm))";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, wpm);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Failed to save results: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*public void showLeaderboard() {
        String query = "SELECT name, wpm FROM leaderboard ORDER BY wpm DESC LIMIT 10";
        try (PreparedStatement pstmt = connection.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            String[] columnNames = {"Name", "WPM"};
            ArrayList<Object[]> data = new ArrayList<>();

            while (rs.next()) {
                data.add(new Object[]{rs.getString("name"), rs.getInt("wpm")});
            }

            Object[][] tableData = data.toArray(new Object[0][0]);
            JTable leaderboardTable = new JTable(tableData, columnNames);
            JScrollPane scrollPane = new JScrollPane(leaderboardTable);
            leaderboardTable.setFillsViewportHeight(true);

            JOptionPane.showMessageDialog(this, scrollPane, "Leaderboard", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Failed to fetch leaderboard: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }*/
    private boolean isLeaderboardOpen = false;

    public void showLeaderboard() {
        if (isLeaderboardOpen) {

            return;
        }

        String query = "SELECT name, wpm FROM leaderboard ORDER BY wpm DESC LIMIT 100";
        try (PreparedStatement pstmt = connection.prepareStatement(query);

             ResultSet rs = pstmt.executeQuery()) {
            String[] columnNames = {"Name", "WPM"};
            ArrayList<Object[]> data = new ArrayList<>();

            while (rs.next()) {
                data.add(new Object[]{rs.getString("name"), rs.getInt("wpm")});
            }

            Object[][] tableData = data.toArray(new Object[0][0]);
            JTable leaderboardTable = new JTable(tableData, columnNames);
            JScrollPane scrollPane = new JScrollPane(leaderboardTable);
            leaderboardTable.setFillsViewportHeight(true);

            isLeaderboardOpen = true;
            JOptionPane.showMessageDialog(this, scrollPane, "Leaderboard", JOptionPane.INFORMATION_MESSAGE);
            isLeaderboardOpen = false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Failed to fetch leaderboard: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    public static String getPassage() {
        ArrayList<String> Passages = new ArrayList<>();
        String pas2="A virtual assistant (typically abbreviated to VA) is generally self-employed and provides professional administrative, technical, or creative assistance to clients remotely from a home office. Many touch typists also use keyboard shortcuts or hotkeys when typing on a computer";
        String pas3="Frank Edward McGurrin, a court stenographer from Salt Lake City, Utah who taught typing classes, reportedly invented touch typing in 1888. On a standard keyboard for English speakers the home row keys are: \"ASDF\" for the left hand and \"JKL;\" for the right hand. The keyboar";
        String pas4="Income before securities transactions was up 10.8 percent from $13.49 million in 1982 to $14.95 million in 1983. Earnings per share (adjusted for a 10.5 percent stock dividend distributed on August 26) advanced 10 percent to $2.39 in 1983 from $2.17 in 1982. Earnings may rise ";
        String pas5="Historically, the fundamental role of pharmacists as a healthcare practitioner was to check and distribute drugs to doctors for medication that had been prescribed to patients. In more modern times, pharmacists advise patients and health care providers on the selection, dosage";
        String pas6="Proofreader applicants are tested primarily on their spelling, speed, and skill in finding errors in the sample text. Toward that end, they may be given a list of ten or twenty classically difficult words and a proofreading test, both tightly timed. The proofreading test will o";
        String pas7="In one study of average computer users, the average rate for transcription was 33 words per minute, and 19 words per minute for composition. In the same study, when the group was divided into \"fast\", \"moderate\" and \"slow\" groups, the average speeds were 40 wpm, 35 wpm, an";
        String pas8="A teacher's professional duties may extend beyond formal teaching. Outside of the classroom teachers may accompany students on field trips, supervise study halls, help with the organization of school functions, and serve as supervisors for extracurricular activities. In some e";

        Passages.add(pas2);
        Passages.add(pas3);
        Passages.add(pas4);
        Passages.add(pas5);
        Passages.add(pas6);
        Passages.add(pas7);
        Passages.add(pas8);
        Random rand = new Random();
        int place = rand.nextInt(Passages.size());
        return Passages.get(place).substring(0, 200);
    }


    private void saveQuizScoreToDatabase(String name, int quizScore) {
        String query = "INSERT INTO leaderboard (name, quiz_score) VALUES (?, ?) " +
                "ON DUPLICATE KEY UPDATE quiz_score = GREATEST(quiz_score, VALUES(quiz_score))";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, quizScore);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Failed to save quiz results: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Frame();
    }
}
