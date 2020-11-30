/*Kapitel 60 Aufgabe 2
  Matthias Korte

  Modifizieren Sie das Wiederholer-Programm, so dass wenn der Anwender Text in das untere Textfeld
  eingibt und die Eingabetaste betaetigt, der Text durch die Fehlermeldung
    "Geben Sie Text im oberen Feld ein!" ersetzt wird.

  Sie werden die actionPerformed(ActionEvent evt) Methode anpassen muessen,
  so dass sie bestimmt welches Textfeld die Aktion erzeugt hat.
  Das kan durch die Verwendung der evt.getActionCommand() Methode getan werden, die den String
  ermittelt, den der Anwender gerade eingegeben hat (dabei spielt es keine Rolle in welchem Feld
  er eingegeben wurde).

  Verwenden Sie jetzt getText() fuer die obere Box, um zu sehen,
  ob der String in diesem Feld der gleiche ist, wie der Befehlsstring in ActionEvent.
  Wenn ja, kopieren Sie den String in die untere Box.
  Wenn nein, geben Sie die Fehlermeldung aus. Vergewissern Sie sich,
  dass Sie einen ActionListener fuer jedes JTextField registrieren.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fehlermeldung extends JFrame implements ActionListener{

    JLabel inLbl = new JLabel("Geben Sie Ihren Text hier ein: ");
    JTextField inTxt = new JTextField(25);

    JLabel outLbl = new JLabel("Hier erscheint Ihr Text: ");
    JTextField outTxt = new JTextField(25);

    //Konstruktor
    public Fehlermeldung(String title){
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
        String inputInTxt = inTxt.getText();
        String input = event.getActionCommand();

        if(input.equals(inputInTxt)){
            outTxt.setText(input);
        }else{
            outTxt.setText("Geben Sie Text im oberen Feld ein!");
        }
    }

    public static void main(String args[]){

        Fehlermeldung win = new Fehlermeldung("Fehlermeldung");

        win.setSize(300,300);
        win.setVisible(true);

    }

}
