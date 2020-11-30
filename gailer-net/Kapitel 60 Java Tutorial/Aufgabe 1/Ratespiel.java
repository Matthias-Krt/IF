/*Kapitel 60 Aufgabe 1
  Matthias Korte

  Passen Sie das Wiederholer-Programm an, so dass der Anwender ein geheimes Wort
  in das obere Feld eingeben muss.
  Nach jedem Eintrag sagt das untere Feld entweder "korrekt" oder "falsch"
  nach drei Fehlversuchen wird das Programm beendet.

  Sie werden die equals() Methode der Klasse String brauchen.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ratespiel extends JFrame implements ActionListener{

    String codeWord = "code";
    int trys = 0;

    JLabel inLbl = new JLabel("Geben Sie das geheime Wort ein: ");
    JTextField inTxt = new JTextField(15);

    JLabel outLbl = new JLabel();
    JLabel tryLbl = new JLabel("Fehlversuche: " + Integer.toString(trys));

    //Konstruktor
    public Ratespiel(String title){
        super(title);

        setLayout(new FlowLayout());
        add(inLbl);
        add(inTxt);
        add(outLbl);
        add(tryLbl);

        inTxt.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event){
        String input = inTxt.getText();

        //check input
        if(input.equals(codeWord)){
            outLbl.setText("Richtig");
        }else{
            outLbl.setText("Falsch");
            trys++;
            tryLbl.setText("Fehlversuche: " + Integer.toString(trys));

            if(trys >= 3){
                System.exit(0);
            }
        }

        repaint();
    }

    public static void main(String args[]){

        Ratespiel win = new Ratespiel("Ratespiel");

        win.setSize(300,300);
        win.setVisible(true);
    }

}
