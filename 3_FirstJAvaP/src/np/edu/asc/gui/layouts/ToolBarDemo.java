package np.edu.asc.gui.layouts;

import javax.swing.*;
import java.awt.*;

public class ToolBarDemo extends JFrame {
    ToolBarDemo(){
        JButton jButton=new JButton("Pencil");
        JLabel jLabel=new JLabel("Line");
        JCheckBox jCheckBox=new JCheckBox("Fill");
        //horizontal=0;vertical=1;for orientation
        JToolBar jToolBar=new JToolBar("My ToolBar",0);

        jToolBar.add(jButton);
        jToolBar.add(jLabel);
        jToolBar.add(jCheckBox);
        setLayout(new BorderLayout());



        add( BorderLayout.NORTH,jToolBar);



        setTitle("ToolBar Demo");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new ToolBarDemo();
    }
}
