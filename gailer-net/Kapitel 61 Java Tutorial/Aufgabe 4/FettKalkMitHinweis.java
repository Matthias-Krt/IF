/*Kapitel 61 Aufgabe 4
  Matthias Korte

  Modifizieren Sie das Fett-Kalkulator, so dass es ein weiteres Textfeld enthaelt.
  Betraegt der Prozentsatz der fettkalorien 30 und mehr, gibt dieses Textfeld
    "Zu viele Fettkalorien!" aus. Betraegt der Prozentsatz der Fettkalorien weniger als 30,
  dann gibt dieses Textfeld "Fettanteil OK." aus.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class FettKalkMitHinweis extends JFrame implements ActionListener{

    JLabel heading = new JLabel("Percent of Calories from Fat");
    JLabel fatLbl = new JLabel("Enter grams of fat: ");
    JLabel calLbl = new JLabel("Enter total calories: ");
    JLabel perLbl = new JLabel("Percent calories from fat: ");

    JTextField inFatTxt = new JTextField(7);
    JTextField inCalTxt = new JTextField(7);
    JTextField outPerTxt = new JTextField(7);
    JTextField outDescTxt = new JTextField(15);

    JButton doit = new JButton("Do It!");

    double calories;    //Input: Gesamtkalorien pro Packung
    double fatGrams;    //Input: Gramm Fett pro Packung
    double percent;     //Ergebnis in Prozent

    public FettKalkMitHinweis(){
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

        add(outDescTxt);
        outDescTxt.setEditable(false);

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

        //check calcPercent
        if(percent >= 30){
            outDescTxt.setText("Zu viele Fettkalorien!");
        }else if(percent < 30){
            outDescTxt.setText("Fettanteil OK.");
        }else{
            outDescTxt.setText("");
        }

        repaint();
    }

    public static void main(String args[]){

        FettKalkMitHinweis win = new FettKalkMitHinweis();
        win.setSize(280,200);
        win.setVisible(true);

    }

}
