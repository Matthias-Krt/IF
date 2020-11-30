/*Kapitel 61 Aufgabe 3
  Matthias Korte

  Modifizieren Sie das Feld fuer die Kalorien, so dass es keinen Fehler verursacht,
  wenn der Anwender Text eingibt, der nicht in ein double konvertiert werden kann.
  Betrachten Sie dazu das modifizierte Temperatur-Konverter Programm
  und versuchen Sie etwas Aehnliches.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class FettKalk extends JFrame implements ActionListener{

    JLabel heading = new JLabel("Percent of Calories from Fat");
    JLabel fatLbl = new JLabel("Enter grams of fat: ");
    JLabel calLbl = new JLabel("Enter total calories: ");
    JLabel perLbl = new JLabel("Percent calories from fat: ");

    JTextField inFatTxt = new JTextField(7);
    JTextField inCalTxt = new JTextField(7);
    JTextField outPerTxt = new JTextField(7);

    JButton doit = new JButton("Do It!");

    double calories;    //Input: Gesamtkalorien pro Packung
    double fatGrams;    //Input: Gramm Fett pro Packung
    double percent;     //Ergebnis in Prozent

    public FettKalk(){
        setTitle("Calories from Fat");

        setLayout(new FlowLayout());
        add(heading);
        add(fatLbl);
        add(inFatTxt);
        add(calLbl);
        add(inCalTxt);
        add(perLbl);
        add(outPerTxt);
        outPerTxt.setEditable(false);

        add(doit);
        doit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Application
    public void calcPercent(){
        percent = ((fatGrams * 9) / calories) * 100;
    }

    public void actionPerformed(ActionEvent event){
        String inputFat, inputCal;

        inputFat = inFatTxt.getText();
        inputCal = inCalTxt.getText();

        try{
            fatGrams = Double.parseDouble(inputFat);
            calories = Double.parseDouble(inputCal);
        }catch (Exception e) {
            outPerTxt.setText("Geben Sie die Daten erneut ein.");
        }

        calcPercent();

        //Die Prozente in einen String konvertieren
        //und im Ergebnisfeld ausgeben
        outPerTxt.setText(new DecimalFormat("#0.0##").format(percent) + "%");

        repaint();
    }

    public static void main(String args[]){

        FettKalk win = new FettKalk();
        win.setSize(280,200);
        win.setVisible(true);

    }

}
