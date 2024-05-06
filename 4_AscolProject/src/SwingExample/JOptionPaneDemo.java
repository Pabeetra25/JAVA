package SwingExample;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JOptionPaneDemo extends WindowAdapter {
    JFrame f;
    JOptionPaneDemo(){
       /* JOptionPane.showMessageDialog(f,"Successfully updated","Alert",JOptionPane.WARNING_MESSAGE);

        */

        //showInputDialog
        f=new JFrame();
        String name=JOptionPane.showInputDialog(f,"Enter your name");


        //ShowConfirmDialog
        f.addWindowListener(this);



        f.setVisible(true);

       f. setTitle("JOptionPane Demo");
        f.setSize(300,300);
        f.setLayout(null);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int a=JOptionPane.showConfirmDialog(f,"Are you Sure?");
        if (a==JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        new JOptionPaneDemo();
    }
}
