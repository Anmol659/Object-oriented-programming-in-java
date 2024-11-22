import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class jframeDemo extends JFrame implements ActionListener {
    JButton addition, sub;
    JTextArea jta, jtb, result;

    public static void main(String[] args) {
        jframeDemo jfd = new jframeDemo(); // Corrected the instantiation
        jfd.setTitle("My Frame");
        jfd.setVisible(true);
        jfd.setSize(400, 400);
        jfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public jframeDemo() {
        setLayout(new FlowLayout());
        
        // Initialize buttons and text areas
        addition = new JButton("ADD");
        sub = new JButton("SUB");
        jta = new JTextArea();
        jtb = new JTextArea();
        result = new JTextArea("Result:- ");
        
        // Set preferred size
        jta.setPreferredSize(new java.awt.Dimension(100, 20));
        jtb.setPreferredSize(new java.awt.Dimension(100, 20));
        result.setPreferredSize(new java.awt.Dimension(100, 20));
        
        // Add components to frame
        add(addition);
        add(sub);
        add(jta);
        add(jtb);
        add(result);
        
        // Add action listeners
        addition.addActionListener(this);
        sub.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Action handling code for buttons
        try {
            int a = Integer.parseInt(jta.getText());
            int b = Integer.parseInt(jtb.getText());
            if (e.getSource() == addition) {
                result.setText("Result: " + (a + b));
            } else if (e.getSource() == sub) {
                result.setText("Result: " + (a - b));
            }
        } catch (NumberFormatException ex) {
            result.setText("Please enter valid numbers.");
        }
    }
}
