/*Kapitel 59 Aufgabe 6
  Matthias Korte

  Erzeugen Sie einen Frame mit zwei Buttons, beschriftet als Vergroessern und verkleinern.
  Wenn der Vergroessern-Button angeklickt wird, wird der Frame um 10 Prozent vergroessert.
  Wenn der verkleinern-Button angeklickt wird, wird der Frame um 10 Prozent verkleinert.

  Tun Sie das in der actionPerformed() Methode, indem Sie setSize() verwenden.
  Verfolgen Sie die aktuelle Groesse des Frames mit zwei Instanzvariablen vom Typ int.
  Wenn Sie sie um 10 Prozent vergroessern oder verkleinern,
  muessen Sie Integer-Arithmetik verwenden oder eine Typumwandlung vornehmen.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExpandShrinkButtons extends JFrame implements ActionListener{

    //Frame variables
    int minFrameHeight = 150;
    int currentFrameHeight = minFrameHeight;

    JButton expandBtn;
    JButton shrinkBtn;

    public ExpandShrinkButtons(String title){
        super(title);

        expandBtn = new JButton("Vergroessern");
        shrinkBtn = new JButton("verkleinern");

        expandBtn.setActionCommand("expand");
        shrinkBtn.setActionCommand("shrink");

        expandBtn.addActionListener(this);
        shrinkBtn.addActionListener(this);

        setLayout(new FlowLayout());
        add(expandBtn);
        add(shrinkBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event){

        if(event.getActionCommand().equals("expand")){
            //Vergroessern
            currentFrameHeight = currentFrameHeight + (currentFrameHeight * 10/100);
            setSize(500, currentFrameHeight);
        }else if(event.getActionCommand().equals("shrink")){
            //Verkleinern
            currentFrameHeight = currentFrameHeight - (currentFrameHeight * 10/100);
            setSize(500, currentFrameHeight);
        }

    }

    public static void main(String args[]){

        ExpandShrinkButtons win = new ExpandShrinkButtons("Vergroessern - Verkleinern");

        win.setSize(500,100);
        win.setVisible(true);

    }

}
