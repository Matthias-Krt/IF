/* Matthias Korte

   Fuegen Sie zwischen beide Textfelder noch eins ein,
   in dem das Alphabet und zu jedem Buchstaben sein entsprechende
   Verschlüsselter steht.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class caeser90 extends JFrame implements ActionListener{

    String encrypt(String txt) {
        String chiffre = "";
        char ch;
        int len = txt.length();
        int charNum;

        for(int i = 0; i < len; i++){
            ch = txt.charAt(i);

            if(ch != 32){
                charNum = (int) ch - 65;
                charNum += 3;
                charNum %= 26;

                chiffre += (char) (charNum + 65);
            }else{
                chiffre += " ";
            }

        }

        return chiffre;
    }

    JPanel jpnl = new JPanel();
    JLabel topLbl = new JLabel("Geben Sie das zu verschluesselnde Wort ein:");
    JTextField inTxt = new JTextField(15);
    JTextField alphabetTxt = new JTextField(26);
    JTextField chiffreAlphabetTxt = new JTextField(26);
    JTextField chiffreTxt = new JTextField(15);

    public caeser90(String title) {
        super(title);

        jpnl.setLayout(new BoxLayout(jpnl, BoxLayout.Y_AXIS));
        jpnl.add(topLbl);
        jpnl.add(inTxt);
        jpnl.add(chiffreTxt);
        jpnl.add(alphabetTxt);
        jpnl.add(chiffreAlphabetTxt);

        alphabetTxt.setEditable(false);
        chiffreAlphabetTxt.setEditable(false);
        chiffreTxt.setEditable(false);

        inTxt.addActionListener(this);

        this.getContentPane().add(jpnl);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        writeAlphabet();
    }

    void writeAlphabet() {
        String alphabet="", chiffreAlphabet="";
        for(char l = 65; l <= 90; l++){
            String letter = String.valueOf(l);
            alphabet += letter;
            chiffreAlphabet += encrypt(letter);
        }

        alphabetTxt.setText(alphabet);
        chiffreAlphabetTxt.setText(chiffreAlphabet);
    }

    public void actionPerformed(ActionEvent evt) {
        String input = inTxt.getText().toUpperCase();

        inTxt.setText(input);
        chiffreTxt.setText(encrypt(input));

        writeAlphabet();

        repaint();
    }

    public static void main(String args[]){

        caeser90 win = new caeser90("Caeser");
        win.setSize(500,300);
        win.setVisible(true);

    }

}
