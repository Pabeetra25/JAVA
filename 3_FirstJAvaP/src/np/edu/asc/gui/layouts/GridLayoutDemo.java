package np.edu.asc.gui.layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    GridLayoutDemo(){

            JLabel jLabel=new JLabel("i am first JLabel");
            JLabel jLabel2=new JLabel("i am second JLabel");
            JLabel jLabel3=new JLabel("i am third JLabel");
            JLabel jLabel4=new JLabel("i am Fourth JLabel");

            setLayout(new GridLayout(2,2));
            add(jLabel);
            add(jLabel2);
            add(jLabel3);
            add(jLabel4);



        setVisible(true);
        setTitle("Grid Layout");
        setSize(500,500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
