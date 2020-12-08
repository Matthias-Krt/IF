/* Matthias Korte

   Schreiben Sie je ein Verschluesslungsprogramm nach der Methode
   von Trithemius und nach Vigenere.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class caeser93 extends JFrame implements ActionListener {

    public int key = 3;

    String encrypt(String txt, String codeWord) {
        String chiffre = "";
        char ch, codeWordCh;
        int len = txt.length();
        int charNum;
        int codeWordNum = 0;

        for(int i = 0; i < len; i++){
            ch = txt.charAt(i);
            codeWordCh = codeWord.charAt(codeWordNum);

            key = (int) codeWordCh - 65;

            if(ch != 32){
                charNum = (int) ch - 65;
                charNum += key;
                charNum %= 26;

                chiffre += (char) (charNum + 65);
            }else{
                if(ch == 32) {chiffre += " ";}  //Leerzeichen
            }

            if(codeWordNum < codeWord.length()-1) {codeWordNum++;} else {codeWordNum = 0;}

        }

        return chiffre;
    }

    String encryptTrithemius(String txt) {
        String chiffre = "";
        char ch;
        int len = txt.length();
        int charNum;
        int codeWordNum = 0;

        for(int i = 0; i < len; i++){
            ch = txt.charAt(i);

            key = i;

            if(ch != 32){
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
    JPanel btnJpnl = new JPanel();
    JLabel topKeyLbl = new JLabel("Geben Sie das Verschluesslungswort ein (nur fuer Vignere noetig):");
    JLabel topInLbl = new JLabel("Geben Sie das Codewort ein:");
    JTextField keyTxt = new JTextField(15);
    JTextField inTxt = new JTextField(15);
    JTextField chiffreTxt = new JTextField(15);
    JButton encryptBtn = new JButton("Vigenere");
    JButton encryptTrithemiusBtn = new JButton("Trithemius");

    public caeser93(String title) {
        super(title);

        btnJpnl.setLayout(new FlowLayout());
        btnJpnl.add(encryptBtn);
        btnJpnl.add(encryptTrithemiusBtn);

        jpnl.setLayout(new BoxLayout(jpnl, BoxLayout.Y_AXIS));
        jpnl.add(topKeyLbl);
        jpnl.add(keyTxt);
        jpnl.add(topInLbl);
        jpnl.add(inTxt);
        jpnl.add(chiffreTxt);
        jpnl.add(btnJpnl);

        chiffreTxt.setEditable(false);

        encryptBtn.setActionCommand("Vignere");
        encryptTrithemiusBtn.setActionCommand("Trithemius");

        encryptBtn.addActionListener(this);
        encryptTrithemiusBtn.addActionListener(this);

        this.getContentPane().add(jpnl);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {
        String actionCmd = evt.getActionCommand();

        key = 3;

        if(actionCmd.equals("Vignere")) {
            if(keyTxt.getText() != "" && inTxt.getText() != ""){
                String input = inTxt.getText().toUpperCase();
                String codeWord = keyTxt.getText().toUpperCase();

                input = removeVowelMutation(input);

                keyTxt.setText(codeWord);
                inTxt.setText(input);
                chiffreTxt.setText(encrypt(input, codeWord));
            } else {}
        } else if(actionCmd.equals("Trithemius")) {
            if(inTxt.getText() != "") {
                String input = inTxt.getText().toUpperCase();

                input = removeVowelMutation(input);

                inTxt.setText(input);
                chiffreTxt.setText(encryptTrithemius(input));
            } else {}
        }
    }

    public static void main(String args[]){

        caeser93 win = new caeser93("Caeser");
        win.setSize(500,300);
        win.setVisible(true);

    }

}
