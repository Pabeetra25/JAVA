package np.edu.asc.gui.eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvents extends JFrame {
    KeyEvents(){
        JTextField jTextField=new JTextField(20);
        jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("key is typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("key is pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("key is released");
            }
        });
        add(jTextField);

    setLayout(new FlowLayout());
    setTitle("KeyEvent Demo");
    setVisible(true);
    setSize(1000,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new KeyEvents();
    }
}
