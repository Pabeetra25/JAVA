package np.edu.asc.gui.layouts;

import javax.swing.*;//for swing components

public class CardLayoutDemo extends JFrame {
    CardLayoutDemo(){
        JLabel jLabel=new JLabel("i am first JLabel");
        JLabel jLabel2=new JLabel("i am second JLabel");

        jLabel.setBounds(10,10,110,20);
        jLabel2.setBounds(10,30,110,40);

        add(jLabel);
        add(jLabel2);

        setVisible(true);
        setTitle("Card Layout");
        setSize(500,500);
        setDefaultCloseOperation(2);

    }
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
