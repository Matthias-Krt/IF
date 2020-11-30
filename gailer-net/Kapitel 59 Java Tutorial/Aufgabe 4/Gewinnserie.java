/*Kapitel 59 Aufgabe 4
  Matthias Korte

  Veraendern Sie das Programm aus Aufgabe 3, so dass nur ein Button das Programm beendet.
  Wenn der Anwender einen der anderen Buttons anklickt, dann ändert der Frame nur seine Farbe.
  Der Anwender faehrt fort zu klicken, bis der Verlustbutton angeklickt wird.
  Das Ziel des Anwenders ist es so oft wie moeglich einen Button anzuklicken.
*/

import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gewinnserie extends JFrame implements ActionListener{

    JButton oneBtn;
    JButton twoBtn;
    JButton threeBtn;

    public Gewinnserie(String title){
        super(title);

        oneBtn = new JButton("one");
        twoBtn = new JButton("two");
        threeBtn = new JButton("three");

        //Befehle setzen
        oneBtn.setActionCommand("spin");
        twoBtn.setActionCommand("spin");
        threeBtn.setActionCommand("spin");

        oneBtn.addActionListener(this);
        twoBtn.addActionListener(this);
        threeBtn.addActionListener(this);

        setLayout(new FlowLayout());
        add(oneBtn);
        add(twoBtn);
        add(threeBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getActionCommand().equals("spin")){
            //Spin
            Random rnd = new Random();
            int rndNum = rnd.nextInt(3);

            if(rndNum != 0){
                //Gewonnen
                getContentPane().setBackground(Color.green);
            }else{
                //Verloren
                System.exit(0);
                //getContentPane().setBackground(Color.red);  //anstatt schließen
            }

        }

        repaint();
    }

    public static void main(String[] args){
        Gewinnserie win = new Gewinnserie("Drei Button Monte");

        win.setSize(500, 200);
        win.setVisible(true);
    }

}
