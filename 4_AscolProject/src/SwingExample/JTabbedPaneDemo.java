package SwingExample;

import javax.swing.*;

public class JTabbedPaneDemo extends JFrame {
    JTabbedPaneDemo(){

        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(100,100,500,400);
        tp.add("Listening",new ListeningPanel());
        tp.add("Speaking",new SpeakingPanel());
        add(tp);

        setTitle("JTabbedPane Example");
        setLayout(null);
        setDefaultCloseOperation(2);
        setSize(400,400);
        setVisible(true);

    }
    public static void main(String[] args) {
        new JTabbedPaneDemo();
    }
}

class ListeningPanel extends JPanel{
    JCheckBox cb;JComboBox dob;
    public ListeningPanel(){
        cb=new JCheckBox("Type 1");
        add(cb);

        String month[]={"jan","Feb","Mar","April","May","June","July","August","sep","Oct","nov","Dec"};
        dob=new JComboBox(month);
    }

}

class SpeakingPanel extends JPanel{
    JCheckBox cb;JComboBox dob;
    public SpeakingPanel(){
        cb=new JCheckBox("Type 2");
        add(cb);

        String month[]={"jan","Feb","Mar","April","May","June","July","August","sep","Oct","nov","Dec"};
        dob=new JComboBox(month);
    }

}
