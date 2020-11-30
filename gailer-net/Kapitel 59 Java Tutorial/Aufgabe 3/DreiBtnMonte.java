/*Kapitel 59 Aufgabe 3
  Matthias Korte

  Schreiben Sie ein Programm, dass das folgende Spiel implementiert:
    Es gibt drei Buttons in einem Frame.
    Zwei der Buttons werden das Programm mit der Methode System.exit(0) beenden.
    Der verbleibende Button wird die Farbe des Frames auf gruen(Gewinn) setzen.
    Der Gewinnbutton wird jedes Mal neu gesetzt, wenn das Spiel gespielt wird.

  Der einfache Weg, das zu tun (obwohl es wie Betrug aussieht),
  ist es jeden Button auf die gleiche Weise zu nehandeln.
  Die actionPerformed() Methode wird noch nicht einmal pruefen welche Button angeklickt wurde.
  Sie wird eine Zufallszahl, einen Integer zwischen 0 und 2, ermittlen und, wenn die 0 kommt,
  die Gewinn-, andererseits die Verlustaktion durchfuehren.

  Das ist aehnlich wie in Casinos manche Glücksspielautomation funktionieren,
  die dem Spieler suggerieren, das es Gewinnzuege gibt.
  Aber tatsaechlich ignoriert die Maschine, was der Spieler tut,
  und weist einen Gewinn nur nach vorher festgelegten Wahrscheinliichkeitsquoten hin und wieder an.
  Sie werden die Random-Klasse brachen:
    Random rnd = new Random();
    int Zufallszahl = rnd.nextInt(3);
*/

import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DreiBtnMonte extends JFrame implements ActionListener{

    JButton oneBtn;
    JButton twoBtn;
    JButton threeBtn;

    public DreiBtnMonte(String title){
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
                //Verloren
                System.exit(0);
                //getContentPane().setBackground(Color.red);  //anstatt schließen
            }else{
                //Gewonnen
                getContentPane().setBackground(Color.green);
            }

        }

        repaint();
    }

    public static void main(String[] args){
        DreiBtnMonte win = new DreiBtnMonte("Drei Button Monte");

        win.setSize(500, 200);
        win.setVisible(true);
    }

}
