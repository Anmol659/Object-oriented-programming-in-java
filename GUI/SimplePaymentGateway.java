import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SimplePaymentGateway extends JFrame implements ActionListener {

    JTextField cardNumberField, cardHolderField, expirationField, cvvField, amountField;
    JButton submitButton;
    Container container;

    public static void main(String[] args) {
        SimplePaymentGateway spg = new SimplePaymentGateway();
        spg.setVisible(true);
        spg.setSize(400, 300);
        spg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public SimplePaymentGateway() {
        setLayout(new FlowLayout());
        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField(16);

        JLabel cardHolderLabel = new JLabel("Card Holder Name:");
        cardHolderField = new JTextField(20);

        JLabel expirationLabel = new JLabel("Expiration Date (MM/YY):");
        expirationField = new JTextField(5);

        JLabel cvvLabel = new JLabel("CVV:");
        cvvField = new JTextField(3);

        JLabel amountLabel = new JLabel("Amount:");
        amountField = new JTextField(10);

        submitButton = new JButton("Submit Payment");
        submitButton.addActionListener(this);

        container = getContentPane();
        container.add(cardNumberLabel);
        container.add(cardNumberField);
        container.add(cardHolderLabel);
        container.add(cardHolderField);
        container.add(expirationLabel);
        container.add(expirationField);
        container.add(cvvLabel);
        container.add(cvvField);
        container.add(amountLabel);
        container.add(amountField);
        container.add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String cardNumber = cardNumberField.getText();
            String cardHolder = cardHolderField.getText();
            String expiration = expirationField.getText();
            String cvv = cvvField.getText();
            String amount = amountField.getText();

           
            if (cardNumber.isEmpty() || cardHolder.isEmpty() || expiration.isEmpty() || cvv.isEmpty() || amount.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
               
                JOptionPane.showMessageDialog(this, "Payment of $" + amount + " was successful!", "Payment Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
