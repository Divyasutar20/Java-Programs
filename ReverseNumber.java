import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumber extends JFrame implements ActionListener {
    JTextField inputField, resultField;
    JButton reverseButton;

    public ReverseNumber() {
        // Set layout manager
        setLayout(new FlowLayout());

        // Input field for the number
        JLabel inputLabel = new JLabel("Enter Number:");
        add(inputLabel);

        inputField = new JTextField(10);
        add(inputField);

        // Reverse button
        reverseButton = new JButton("Find Reverse");
        add(reverseButton);

        // Result field for showing the reversed number
        JLabel resultLabel = new JLabel("Reversed Number:");
        add(resultLabel);

        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(resultField);

        // Add action listener to the button
        reverseButton.addActionListener(this);

        // Frame settings
        setTitle("Reverse Number Finder");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Get the input number as string
            String input = inputField.getText();
            // Reverse the string
            String reversed = new StringBuilder(input).reverse().toString();
            // Display the reversed number
            resultField.setText(reversed);
        } catch (Exception ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new ReverseNumber();
    }
}
