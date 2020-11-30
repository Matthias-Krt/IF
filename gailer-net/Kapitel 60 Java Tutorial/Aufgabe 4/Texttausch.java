/*Kapitel 60 Aufgabe 4
  Matthias Korte

  Fuegen Se der GUI einen JButton hinzu. Aendern Sie das Programm, so dass,
   wenn der button angeklickt wird, die String in den beiden Textfeldern ausgetauscht werden;
   d.h. das obere Textfeld bekommt den Text des unteren und das untere Textfeld
   bekommt den Text des oberen.
   Die actionPerformed() Methode wird den Button auf ein Ereignis abhoeren und wird,
   wenn sie eines empfaengt, den Text in den beiden Feldern austauschen.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Texttausch extends JFrame implements ActionListener{

    JButton enterBtn = new JButton("Enter");

    JLabel oneLbl = new JLabel("Geben Sie Ihren Text hier ein oder er erscheint hier: ");
    JTextField oneTxt = new JTextField(25);

    JLabel twoLbl = new JLabel("Hier erscheint Ihr Text oder geben Sie Ihren Text hier ein: ");
    JTextField twoTxt = new JTextField(25);

    //Konstruktor
    public Texttausch(String title){
        super(title);
        setLayout(new FlowLayout());
        add(oneLbl);
        add(oneTxt);
        add(enterBtn);
        add(twoLbl);
        add(twoTxt);

        enterBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event){
        String oneInput = oneTxt.getText();
        String twoInput = twoTxt.getText();

        oneTxt.setText(twoInput);
        twoTxt.setText(oneInput);

    }

    public static void main(String args[]){

        Texttausch win = new Texttausch("Echo for Both");

        win.setSize(500,300);
        win.setVisible(true);

    }

}
