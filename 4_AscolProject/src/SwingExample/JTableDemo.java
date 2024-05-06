package SwingExample;

import javax.swing.*;
import java.awt.*;

public class JTableDemo {
    JFrame f;
    JTableDemo(){
        String data[][]={{"Ram","12","30","Ktm"},{"Sam","13","34","Bhutan"},{"Samy","12","23","Japan"}};
        String column[]={"Name","Roll No:","Age=","Address"};
        f=new JFrame();
        f.setSize(new Dimension(400,300));
        f.setLayout(null);
        JTable table=new JTable(data,column);
        JScrollPane pane=new JScrollPane(table);
        pane.setBounds(50,100,300,100);
        f.add(pane);
        f.setVisible(true);
        f.setDefaultCloseOperation(2);

    }
    public static void main(String[] args) {
        new JTableDemo();
    }
}
