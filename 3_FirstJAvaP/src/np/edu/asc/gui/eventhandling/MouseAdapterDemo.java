package np.edu.asc.gui.eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterDemo extends JFrame {
    MouseAdapterDemo(){
        JButton jButton=new JButton("Click me");
        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouse was clicked");
            }
        });

         add(jButton);
        setLayout(new FlowLayout());
        setTitle("MouseAdapter Demo");
        setVisible(true);
        setSize(1000,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
