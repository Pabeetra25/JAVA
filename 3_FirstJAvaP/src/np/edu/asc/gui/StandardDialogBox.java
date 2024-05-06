package np.edu.asc.gui;

import javax.swing.*;

public class StandardDialogBox {
    public static void main(String[] args) {
                                      //parent,message,title,message type

        JOptionPane.showMessageDialog(null,"Hello world from my first dialog box","Ordinary Message",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Very Critical","Critical Message",JOptionPane.ERROR_MESSAGE);

    }
}
