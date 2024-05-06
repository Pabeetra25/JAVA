package np.edu.asc.gui.layouts;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    FlowLayoutDemo(){
        JLabel jLabel=new JLabel("i am the first JLabel");
        JLabel jLabel2=new JLabel("i am the  second JLabel");
        JLabel jLabel3=new JLabel("i am the  third JLabel");
        JLabel jLabel4=new JLabel("i am the Fourth JLabel");

        setLayout(new FlowLayout());
        add(jLabel);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);



        setVisible(true);
        setTitle("Flow Layout");
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
