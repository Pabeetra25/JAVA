package np.edu.asc.gui.layouts;

import javax.swing.*;
import  java.awt.*;



public class BorderLayoutDemo extends JFrame {
    BorderLayoutDemo(){
        JButton north=new JButton("North");
        JButton south=new JButton("South");
        JButton west=new JButton("West");
        JButton east=new JButton("East");
        JButton center=new JButton("Center");

        setLayout(new BorderLayout());

        add(BorderLayout.NORTH,north);
        add(BorderLayout.SOUTH,south);
        add(BorderLayout.WEST,west);
        add(BorderLayout.EAST,east);
        add(BorderLayout.CENTER,center);



        setVisible(true);
        setTitle("Border Layout");
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
