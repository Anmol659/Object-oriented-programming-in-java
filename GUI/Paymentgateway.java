import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Paymentgateway extends JFrame implements ItemListener {

    public static void main(String[] args) {
       Paymentgateway db = new Paymentgateway();
        db.setVisible(true);
        db.setSize(500, 500);
        db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JCheckBox cb1, cb2;
    JRadioButton jb1, jb2;
    ButtonGroup bg;
    JTextArea jta;
    Container c = null;

    public Paymentgateway() {
        setLayout(new FlowLayout());
        cb1 = new JCheckBox("JAVA");
        cb2 = new JCheckBox("Python");
        jb1 = new JRadioButton("Red Text", true);
        jb2 = new JRadioButton("Blue Text", false);
        bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        jta = new JTextArea(10, 20);
        jta.setBackground(Color.cyan);
        c = getContentPane();

        c.add(cb1);
        c.add(cb2);
        c.add(jb1);
        c.add(jb2);
        c.add(jta);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        jb1.addItemListener(this);
        jb2.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String msg = "";
        if (cb1.isSelected()) {
            msg += "\n" + cb1.getText();
        }
        if (cb2.isSelected()) {
            msg += "\n" + cb2.getText();
        }

        // Change text color based on selected radio button
        if (jb1.isSelected()) {
            jta.setForeground(Color.RED);
        } else if (jb2.isSelected()) {
            jta.setForeground(Color.BLUE);
        }

        jta.setText(msg);
    }
}
