package SwingExample;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo  {
    JFrame f;
    JPanel p1,p2,p3,p4,p5;
    BorderLayoutDemo(){
        f=new JFrame();
        p1=new JPanel();
        p1.setBackground(Color.RED);
        p2=new JPanel();
        p2.setBackground(Color.WHITE);
        p3=new JPanel();
        p3.setBackground(Color.CYAN);
        p4=new JPanel();
        p4.setBackground(Color.BLUE);
        p5=new JPanel();
        p5.setBackground(Color.ORANGE);

        BorderLayout br=new BorderLayout(2,2);
       f. setLayout(br);
        f.add(p1,BorderLayout.CENTER);
        f.add(p2,BorderLayout.EAST);
       f. add(p3,BorderLayout.WEST);
        f.add(p4,BorderLayout.NORTH);
        f.add(p5,BorderLayout.SOUTH);



        f.setTitle("Border layout demo");



       f. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();

    }
}

