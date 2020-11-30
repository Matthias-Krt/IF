/*Kapitel 59 Aufgabe 2
  Matthias Korte

  Schreiben Sie ein Porgramm, dass nur einen Button in dem Frame hat.
  Das Anklicken des Buttons kreist durch die Farben:
    rot -> gruen --> blau --> grau --> rot
  und so weiter.
  Je Klick wird eine Farbe geändert. Zusätzlich zur setBackground(Color.color) Methode,
  die wir verwendet haben, werden Sie die Color getBackground() Methode brauchen,
  um die aktuelle Farbe zu bekommen.

  Eine andere Möglichkeit das zu tun, ist die Verwendung einer Instanzvariable (von Typ Color)
  im Frame, um die akteuelle Farbe zu halten.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Farbkreis extends JFrame implements ActionListener{

    JButton changeBtn;

    Color[] rad = {Color.red, Color.green, Color.blue, Color.gray};
    int radIndex = 0;

    public Farbkreis(String title){
        super(title);

        changeBtn = new JButton("weiter");
        changeBtn.setActionCommand("change");
        changeBtn.addActionListener(this);

        setLayout(new FlowLayout());
        add(changeBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getActionCommand().equals("change")){
            getContentPane().setBackground(rad[radIndex]);

            if(rad.length-1 == radIndex){
                radIndex = 0;
            }else{
                radIndex++;
            }

        }

        repaint();
    }

    public static void main(String[] args){
        Farbkreis win = new Farbkreis("Farbkreis");

        win.setSize(500, 500);
        win.setVisible(true);
    }
}
