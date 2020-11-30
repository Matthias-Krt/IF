/*Kapitel 60 Aufgabe 3
  Matthias Korte

  Modifizieren Sie das Widerholer-Programm, so dass der Anwender Text sowohl
  in das obere als auch in das untere Feld eingeben kann.
  Der Text wird in dem jeweils anderen Feld wiederholt und ersetzt den vorhandenen Text.
  Um das zu tun, werden Sie getActionCommand() wie in der Aufgabe 2 verwenden muessen.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EchoForBoth extends JFrame implements ActionListener{

    JLabel inLbl = new JLabel("Geben Sie Ihren Text hier ein oder er erscheint hier: ");
    JTextField inTxt = new JTextField(25);

    JLabel outLbl = new JLabel("Hier erscheint Ihr Text oder geben Sie Ihren Text hier ein: ");
    JTextField outTxt = new JTextField(25);

    //Konstruktor
    public EchoForBoth(String title){
        super(title);
        setLayout(new FlowLayout());
        add(inLbl);
        add(inTxt);
        add(outLbl);
        add(outTxt);

        inTxt.addActionListener(this);
        outTxt.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event){
        String input = event.getActionCommand();

        inTxt.setText(input);
        outTxt.setText(input);

    }

    public static void main(String args[]){

        EchoForBoth win = new EchoForBoth("Echo for Both");

        win.setSize(500,300);
        win.setVisible(true);

    }

}
