package np.edu.asc.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class SwingDemo2 extends JFrame {
    SwingDemo2(){

        JMenuBar jMenuBar=new JMenuBar();

        JMenu fileMenu=new JMenu("File");
        JMenu viewMenu=new JMenu("View");
        JMenu saveAsMenu=new JMenu("Save as");

        JMenuItem openItem=new JMenuItem("Open");
        JMenuItem saveItem=new JMenuItem("Save");
        JMenuItem pdfItem=new JMenuItem("pdf");
        JMenuItem pngItem=new JMenuItem("png");

        saveAsMenu.add(pdfItem);
        saveAsMenu.add(pngItem);

        //disable the menuItem //true for enable
        saveItem.setEnabled(false);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsMenu);

        jMenuBar.add(fileMenu);
        jMenuBar.add(viewMenu);



        //adding mnemonics and accelerator
       // fileMenu.setMnemonic(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActiveEvent.CTRL_MASK));

        fileMenu.setMnemonic('f');
       
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        JPanel jPanel=new JPanel();
        jPanel.setBackground(Color.RED);
        setLayout(new FlowLayout());
        add(jMenuBar);
        add(jPanel);

        setTitle("My second app");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//2

    }

    public static void main(String[] args) {
        new SwingDemo2();
    }
}
