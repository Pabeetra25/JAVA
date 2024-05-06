package SwingExample;

import javax.swing.*;

public class LoginForm extends JFrame {
    LoginForm(){

        //Label
        JLabel userName=new JLabel("User Name");
        userName.setBounds(10,30,100,25);
        add(userName);
        JLabel password=new JLabel("Password");
        password.setBounds(10,70,100,25);
        add(password);

        JTextField userText=new JTextField();
        userText.setBounds(125,30,150,25);
        add(userText);

        JPasswordField passwordText=new JPasswordField();
        passwordText.setBounds(125,70,150,25);
        passwordText.setEchoChar('*');
        add(passwordText);
        String name=JOptionPane.showInputDialog(null,"Enter ur name");
        JOptionPane.showMessageDialog(null,name);


        setVisible(true);
        setTitle("Login Form");
        setSize(400,400);
        setLocation(400,300);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(2);


    }
    public static void main(String[] args) {
        new LoginForm();
    }
}
