package SwingExample;

import javax.swing.*;

public class JMenuBarDemo extends JFrame {
    JMenuBarDemo(){
        JMenuBar mb=new JMenuBar();

        setTitle("JMenuBar Example");
        setSize(300,400);
        setDefaultCloseOperation(2);
        setVisible(true);

    }


    public static void main(String[] args) {
      new  JMenuBarDemo();
    }
}
