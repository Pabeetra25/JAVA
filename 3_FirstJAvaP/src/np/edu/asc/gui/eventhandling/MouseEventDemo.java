package np.edu.asc.gui.eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo extends JFrame {
    MouseEventDemo(){
        JButton jButton=new JButton("Click me");
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse was clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse was pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse was released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse was entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse was exited");

            }
        });

        add(jButton);
        setLayout(new FlowLayout());
        setTitle("MouseEvent Demo");
        setVisible(true);
        setSize(1000,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
