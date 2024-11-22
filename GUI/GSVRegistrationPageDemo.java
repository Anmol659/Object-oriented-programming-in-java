import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class GSVRegistrationPageDemo extends JFrame{
    public static void main(String[] args)
    {
    GSVRegistrationPageDemo gsv = new GSVRegistrationPageDemo();
    gsv.setVisible(true);
    gsv.setTitle("Registration Page");
    gsv.setSize(800,500);
    gsv.pack();    
    }
    JLabel lfname, laddress, lgender, lhobbies;
    JTextField tfname, taddress;
    JRadioButton male, female;
    ButtonGroup bg;
    JCheckBox c, cpp, java, python;
    JButton registration;
    JButton reset;
    JPanel jp1, jp2, jp3, jp4, mp;
    GSVRegistrationPageDemo()
    {
        mp = new JPanel (new GridLayout(5,1));
        jp1 = new JPanel();
        jp1.setLayout(new GridLayout(2,2));
        lfname = new JLabel("Fname");
        laddress = new JLabel("Address");
        tfname = new JTextField();
        taddress = new JTextField();
        jp1.add(lfname); 
        jp1.add(laddress);  

        mp.add(jp1);
        jp2 = new JPanel();
        jp2.setLayout(new GridLayout(1,3));
        lgender = new JLabel("Gender");
        male = new JRadioButton("male");
        female = new JRadioButton("Female");
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        jp2.add(lgender); 
        jp2.add(male); 
        jp2.add(female);  
        mp.add(jp2);
        
        jp3 = new JPanel();
        jp3.setLayout(new GridLayout(1,5));
        lhobbies = new JLabel("Hobbies");
        c = new JCheckBox("C");
        cpp = new JCheckBox("CPP");
        java = new JCheckBox("JAVA");
        python = new JCheckBox("PYTHON");
        jp3.add(lhobbies);
        jp3.add(c);
        jp3.add(cpp);
        jp3.add(java);
        jp3.add(python);
        mp.add(jp3);

        jp4 = new JPanel();
        jp4.setLayout(new GridLayout(1,2));
        registration = new JButton("Registration");
        reset = new JButton("Reset");
        jp4.add(registration);
        jp4.add(reset);
        mp.add(jp4);
        add(mp);        
    }
}

