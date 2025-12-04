package SwingExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator implements ActionListener {
    JFrame f;
    JLabel fnlbl,snlbl,resultlbl,outputlbl;
    JTextField fntxt,sntxt;
    JButton addbtn,subbtn,mulbtn,divbtn;
    SimpleCalculator(){
        f=new JFrame();


        f.setTitle("Simple Calculator");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        fnlbl=new JLabel("First Number:");
        fnlbl.setBounds(10,20,100,25);
        f.add(fnlbl);

        snlbl=new JLabel("Second Number:");
        snlbl.setBounds(10,60,100,25);
        f.add(snlbl);

        resultlbl=new JLabel("Result:");
        resultlbl.setBounds(10,100,100,25);
        f.add(resultlbl);

        fntxt=new JTextField();
        fntxt.setBounds(120,20,150,25);
        f.add(fntxt);
        fntxt.setToolTipText("Enter first number");

        sntxt=new JTextField();
        sntxt.setBounds(120,60,150,25);
        f.add(sntxt);
        sntxt.setToolTipText("Enter second number");

        addbtn=new JButton("ADD");
        addbtn.setBounds(10,180,70,25);
        f.add(addbtn);

        subbtn=new JButton("SUB");
       subbtn.setBounds(90,180,70,25);
        f.add(subbtn);

        mulbtn=new JButton("MUL");
        mulbtn.setBounds(170,180,70,25);
        f.add(mulbtn);

        divbtn=new JButton("DIV");
        divbtn.setBounds(250,180,70,25);
        f.add(divbtn);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addbtn.addActionListener(this);

            if(e.getSource()== addbtn){
                int result=Integer.parseInt(fnlbl.getText()+Integer.parseInt(snlbl.getText()));
                outputlbl.setText(""+result);
            }

        }

    }

