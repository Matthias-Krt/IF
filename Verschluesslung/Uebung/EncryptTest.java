/* Matthias Korte

   Schreiben Sie je ein Verschluesslungsprogramm nach der Methode
   von Trithemius und nach Vigenere.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EncryptTest extends JFrame implements ActionListener {

    public String caeserEncrypt(String klarTxt, int key) {
        String chiffre = "";
        char klarCh;
        int charNum;

        for(int i = 0; i < klarTxt.length(); i++){
            klarCh = klarTxt.toUpperCase().charAt(i);

            charNum = (int) klarCh - 65;
            charNum += key;
            charNum %= 26;

            chiffre += (char)(charNum + 65);
        }

        return chiffre;
    }

    public String vigenereEncrypt(String klarTxt, String codeWord) {

        String chiffre = "";
        char klarCh, codeWordCh;
        int charNum, codeIndex = 0;
        int key;

        for(int i = 0; i < klarTxt.length(); i++){
            klarCh = klarTxt.toUpperCase().charAt(i);
            codeWordCh = codeWord.toUpperCase().charAt(codeIndex);

            key = (int) codeWordCh - 65;

            charNum = (int) klarCh - 65;
            charNum += key;
            charNum %= 26;

            chiffre += (char) (charNum + 65);

            if(codeIndex < codeWord.length() - 1) {codeIndex++;} else {codeIndex = 0;}
        }

        return chiffre;

    }

    String trithemiusEncrypt(String txt) {
        String chiffre = "";
        char ch;
        int charNum;
        int codeWordNum = 0;

        for(int i = 0; i < txt.length(); i++){
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
    JPanel codeWordJpnl = new JPanel();
    JPanel inTxtJpnl = new JPanel();

    JLabel topKeyLbl = new JLabel("Geben Sie das Verschluesslungswort ein (nur fuer Vignere noetig):");
    JLabel topInLbl = new JLabel("Geben Sie das Codewort ein:");

    JTextField keyTxt = new JTextField(15);
    JTextField inTxt = new JTextField(15);
    JTextField chiffreTxt = new JTextField(15);

    JButton encryptCaeserBtn = new JButton("Caeser");
    JButton encryptBtn = new JButton("Vigenere");
    JButton encryptVigenereBtn = new JButton("VignereFunc");
    JButton encryptTrithemiusBtn = new JButton("Trithemius");

    public EncryptTest(String title) {
        super(title);

        codeWordJpnl.setLayout(new BoxLayout(codeWordJpnl, BoxLayout.Y_AXIS));
        codeWordJpnl.add(topKeyLbl);
        codeWordJpnl.add(keyTxt);

        inTxtJpnl.setLayout(new BoxLayout(inTxtJpnl, BoxLayout.Y_AXIS));
        inTxtJpnl.add(topInLbl);
        inTxtJpnl.add(inTxt);

        jpnl.setLayout(new BoxLayout(jpnl, BoxLayout.Y_AXIS));
        jpnl.add(codeWordJpnl);
        jpnl.add(inTxtJpnl);
        jpnl.add(chiffreTxt);
        jpnl.add(btnJpnl);

        btnJpnl.setLayout(new FlowLayout());
        btnJpnl.add(encryptCaeserBtn);
        btnJpnl.add(encryptBtn);
        btnJpnl.add(encryptVigenereBtn);
        btnJpnl.add(encryptTrithemiusBtn);

        chiffreTxt.setEditable(false);

        encryptCaeserBtn.setActionCommand("Caeser");
        encryptBtn.setActionCommand("Vignere");
        encryptVigenereBtn.setActionCommand("VignereFunc");
        encryptTrithemiusBtn.setActionCommand("Trithemius");

        encryptCaeserBtn.addActionListener(this);
        encryptBtn.addActionListener(this);
        encryptVigenereBtn.addActionListener(this);
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
                chiffreTxt.setText(encrypt(input));
            } else {}
        } else if(actionCmd.equals("VignereFunc")) {
            chiffreTxt.setText(vigenereEncrypt(inTxt.getText(), keyTxt.getText()));
        } else if(actionCmd.equals("Caeser")) {
            chiffreTxt.setText(caeserEncrypt(inTxt.getText(), 3));
        }
    }

    public static void main(String args[]){

        EncryptTest win = new EncryptTest("Encrypt");
        win.setSize(800,300);
        win.setVisible(true);

    }

}
