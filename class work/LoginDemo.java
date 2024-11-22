import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo extends JFrame implements ActionListener {

    JLabel luser, lpass;
    JTextField tuser;
    JPasswordField tpass;
    JButton login;

    public static void main(String[] args) {
        LoginDemo ld = new LoginDemo();
        ld.setVisible(true);
        ld.setSize(400, 400);
        ld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public LoginDemo() {
        setLayout(null);

        luser = new JLabel("Username");
        lpass = new JLabel("Password");
        tuser = new JTextField();
        tpass = new JPasswordField();
        login = new JButton("Login");

        luser.setBounds(100, 100, 100, 20);
        tuser.setBounds(200, 100, 100, 20);
        lpass.setBounds(100, 150, 100, 20);
        tpass.setBounds(200, 150, 100, 20);
        login.setBounds(150, 200, 100, 20);

        add(luser);
        add(tuser);
        add(lpass);
        add(tpass);
        add(login);

        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = tuser.getText();
        String password = String.valueOf(tpass.getPassword());

        if (username.equals("admin") && password.equals("password123")) {
            JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
