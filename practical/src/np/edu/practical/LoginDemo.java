package np.edu.practical;
import javax.swing.*;

public class LoginDemo{
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Login GUI");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create JLabels
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 50, 80, 25);

        // Create JTextFields
        JTextField userTextField = new JTextField();
        userTextField.setBounds(100, 20, 165, 25);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);

        // Create JButton
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 80, 25);

        // Add components to the frame
        frame.add(userLabel);
        frame.add(userTextField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}
