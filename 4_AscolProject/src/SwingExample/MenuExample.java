package SwingExample;

import javax.swing.*;

public class MenuExample {

    JFrame f;
    JMenu fileMenu,editMenu,viewMenu,newMenu;
    JMenuItem saveItem,openItem,aItem,bItem;
    public MenuExample(){
        f=new JFrame("Menu Example");
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JMenuBar jMenuBar=new JMenuBar();
        f.setJMenuBar(jMenuBar);

        fileMenu=new JMenu("File");
        jMenuBar.add(fileMenu);

        editMenu=new JMenu("Edit");
        jMenuBar.add(editMenu);

        viewMenu=new JMenu("View");
        jMenuBar.add(viewMenu);

        newMenu=new JMenu("New");
        fileMenu.add(newMenu);

        saveItem=new JMenuItem("Save");
        fileMenu.add(saveItem);

        openItem=new JMenuItem("Open");
        fileMenu.add(openItem);

        aItem=new JMenuItem("A");
        newMenu.add(aItem);
        bItem=new JMenuItem("B");
        newMenu.add(bItem);
        
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuExample();
    }
}
