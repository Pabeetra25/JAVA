package np.edu.asc.gui;

import javax.swing.*;

public class InputDialogBoxDemo {
    public static void main(String[] args) {
       String name= JOptionPane.showInputDialog(null,"Please Enter your name");
        System.out.println(name);
    }
}
