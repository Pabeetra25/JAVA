package np.edu.asc.gui;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class SwingDemo extends JFrame {
    SwingDemo(){
        JPanel jPanel=new JPanel();
        jPanel.setBackground(Color.CYAN);

        JButton jButton=new  JButton("Click Me");
        jButton.setToolTipText("click this for magic");
        JButton jButton2=new  JButton("Click Me for good luck");

        JLabel jLabel=new JLabel("i am a Label");

        JTextField jTextField=new JTextField("This is pretext",20);

        JPasswordField jPasswordField=new JPasswordField(20);

        JCheckBox jCheckBox=new JCheckBox("i am a checkbox");
        JCheckBox jCheckBox2=new JCheckBox("i am a checkbox2");

        JRadioButton jRadioButton=new JRadioButton("male");
        JRadioButton jRadioButton2=new JRadioButton("female");
        JRadioButton jRadioButton3=new JRadioButton("other");

        ButtonGroup buttonGroup=new ButtonGroup();

        String[]subjects={"BBA","BCA","IT"};
        JComboBox jComboBox=new JComboBox(subjects);

        JList jList=new JList(subjects);
        jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JTextArea jTextArea=new JTextArea(10,5);


       // jPanel.add(jScrollPane);


        String[] header={"Name","Roll No","Class"};
        String[][]tableContent={{"Ram","10","7"},
                {"Raman","11","7"},
                {"Radha","12","7"}};

        //                       body        ,head
        JTable jTable=new JTable(tableContent,header);
        JScrollPane jScrollPane=new JScrollPane(jTable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);




           jPanel.add(jScrollPane);
       // jPanel.add(jTable);

        //JTree
        DefaultMutableTreeNode rootNode=new DefaultMutableTreeNode("MenuBar");
        DefaultMutableTreeNode menuNode=new DefaultMutableTreeNode("Menu");
        DefaultMutableTreeNode menuItem=new DefaultMutableTreeNode("Menu Item");
        DefaultMutableTreeNode menu2Node=new DefaultMutableTreeNode("Menu 2");
        DefaultMutableTreeNode menuItem2Node=new DefaultMutableTreeNode("Menu Item 2");

        menu2Node.add(menuItem2Node);

        menuNode.add(menuItem);
        menuNode.add(menu2Node);

        rootNode.add(menuNode);

        JTree jTree=new JTree(rootNode);

        jPanel.add(jTree);

        //JSlider
        //0-horizontal alignment 1-vertical alignment
         //                           alignment,min val,max val,preset value
        JSlider jSlider=new JSlider(0,0,100,77);
        jPanel.add(jSlider);


       // jScrollPane.add(jTextArea);
        jPanel.add(jComboBox);
        jPanel.add(jList);
       // jPanel.add(jTextArea);

        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);

        jPanel.add(jRadioButton);
        jPanel.add(jRadioButton2);
        jPanel.add(jRadioButton3);

        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jCheckBox);
        jPanel.add(jCheckBox2);
        jPanel.add(jButton2);
        jPanel.add(jButton);
        jPanel.add(jPasswordField);

        add(jPanel);



        setTitle("My first swing application");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//2

    }
    public static void main(String[] args) {

        new SwingDemo();

    }
}
