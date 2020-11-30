/* Matthias Korte
   In der Codetabele soll ein Codewort eingetragen werden, wobei mehrfach vorkommende Buchstaben dann weggelassen werden.
   Anschließend sollen die restlichen Stellen mit den uebrig gebliebenen Buchstaben der Reihe nach aufgefüllt.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class caeser92 extends JFrame implements ActionListener {

    public int key = 3;

    String encrypt(String txt) {
        String chiffre = "";
        char ch, lastCh;
        int len = txt.length();
        int charNum;

        for(int i = 0; i < len; i++){
            if(i > 0) { lastCh = txt.charAt(i-1); } else { lastCh = 0; }
            ch = txt.charAt(i);

            if(ch != 32 && lastCh != ch || i == 0){
                charNum = (int) ch - 65;
                charNum += key;
                charNum %= 26;

                chiffre += (char) (charNum + 65);
            }else{
                if(ch == 32) {chiffre += " ";}  //Leerzeichen
            }

        }

        return chiffre;
    }

    String removeVowelMutation(String input) {
        String txt = "";
        char ch;

        for(int i = 0; i < input.length(); i++){
            ch = input.charAt(i);
            if(ch == 142) { txt += "AE"; }
            else if(ch == 154) { txt += "UE"; }
            else if(ch == 153) { txt += "OE"; }
            else if(ch == 225) { txt += "SS"; }
            else { txt += ch; }
        }

        return txt;
    }

    JPanel jpnl = new JPanel();
    JLabel topLbl = new JLabel("Geben Sie das Codewort ein:");
    JTextField inTxt = new JTextField(15);
    JTextField chiffreTxt = new JTextField(15);

    public caeser92(String title) {
        super(title);

        jpnl.setLayout(new BoxLayout(jpnl, BoxLayout.Y_AXIS));
        jpnl.add(topLbl);
        jpnl.add(inTxt);
        jpnl.add(chiffreTxt);

        chiffreTxt.setEditable(false);

        inTxt.addActionListener(this);

        this.getContentPane().add(jpnl);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {
        String input = inTxt.getText().toUpperCase();
        input = removeVowelMutation(input);

        inTxt.setText(input);
        chiffreTxt.setText(encrypt(input));
    }

    public static void main(String args[]){

        caeser92 win = new caeser92("Caeser");
        win.setSize(500,300);
        win.setVisible(true);

    }

}
