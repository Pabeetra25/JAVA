package np.edu.asc.gui.eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class ActionEventDemo extends JFrame implements ActionListener {
    ActionEventDemo(){
        JButton jButton=new JButton("Click me");
        JButton jButton2=new JButton("Click me for good luck");
        jButton.addActionListener(this);
        jButton2.addActionListener(this);
        add(jButton);
        add(jButton2);

        setLayout(new FlowLayout());

        setTitle("ActionEvent Demo");
        setVisible(true);
        setSize(1000,500);
        setDefaultCloseOperation(2);

    }
    public static void main(String[] args) {
        new ActionEventDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked");
    }
}
