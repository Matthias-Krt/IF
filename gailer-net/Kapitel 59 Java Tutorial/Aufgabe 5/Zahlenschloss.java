/*Kapitel 59 Aufgabe 5
  Matthias Korte

  Erzeugen Sie inen Frame mit 10 Buttons, beschriftet von 0 bis 9.
  Um das Programm zu beenden, muessen drei Buttons in der richtigen Reihenfolge angeklickt werden,
  wie z.B. 7-3-5.
  Wenn die falsche Kombination verwendet wird, wird der Frame rot.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Zahlenschloss extends JFrame implements ActionListener{

    String code = "173";    //Kombination
    int index = 0;

    JButton zeroBtn;
    JButton oneBtn;
    JButton twoBtn;
    JButton threeBtn;
    JButton fourBtn;
    JButton fiveBtn;
    JButton sixBtn;
    JButton sevenBtn;
    JButton eightBtn;
    JButton nineBtn;

    public Zahlenschloss(String title){
        super(title);

        zeroBtn = new JButton("0");
        oneBtn = new JButton("1");
        twoBtn = new JButton("2");
        threeBtn = new JButton("3");
        fourBtn = new JButton("4");
        fiveBtn = new JButton("5");
        sixBtn = new JButton("6");
        sevenBtn = new JButton("7");
        eightBtn = new JButton("8");
        nineBtn = new JButton("9");

        zeroBtn.setActionCommand("pick");
        oneBtn.setActionCommand("pick");
        twoBtn.setActionCommand("pick");
        threeBtn.setActionCommand("pick");
        fourBtn.setActionCommand("pick");
        fiveBtn.setActionCommand("pick");
        sixBtn.setActionCommand("pick");
        sevenBtn.setActionCommand("pick");
        eightBtn.setActionCommand("pick");
        nineBtn.setActionCommand("pick");

        zeroBtn.addActionListener(this);
        oneBtn.addActionListener(this);
        twoBtn.addActionListener(this);
        threeBtn.addActionListener(this);
        fourBtn.addActionListener(this);
        fiveBtn.addActionListener(this);
        sixBtn.addActionListener(this);
        sevenBtn.addActionListener(this);
        eightBtn.addActionListener(this);
        nineBtn.addActionListener(this);

        setLayout(new FlowLayout());
        add(zeroBtn);
        add(oneBtn);
        add(twoBtn);
        add(threeBtn);
        add(fourBtn);
        add(fiveBtn);
        add(sixBtn);
        add(sevenBtn);
        add(eightBtn);
        add(nineBtn);

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    public void actionPerformed(ActionEvent event){

        //get the Buttons text
        Object o = event.getSource();
        JButton b = null;
        String btnText = "";

        if(o instanceof JButton){
            b = (JButton)o;
        }
        if(b != null){
            btnText = b.getText();
        }

        System.out.println(btnText);

        //check for the right code
        //close the window when the full code has been entered
        if(code.length()-1 > index){
            if(btnText.charAt(0) == code.charAt(index)){
                getContentPane().setBackground(Color.green);
                index++;
                System.out.println("RIGHT");
            }else{
                getContentPane().setBackground(Color.red);
                System.out.println("FALSE");
            }
        }else{
            System.exit(0);
        }

        repaint();
    }

    public static void main(String args[]){

        Zahlenschloss win = new Zahlenschloss("Zahlenschloss");

        win.setSize(500,500);
        win.setVisible(true);

    }

}
