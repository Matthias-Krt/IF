/* Matthias Korte
   Die Zahl der Stellen, um die verschoben wird, soll durch Eingabe waehlbar sein.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class caeser91 extends JFrame implements ActionListener {

    public int key = 3;

    String encrypt(String txt) {
        String chiffre = "";
        char ch;
        int len = txt.length();
        int charNum;

        for(int i = 0; i < len; i++){
            ch = txt.charAt(i);

            if(ch != 32){
                charNum = (int) ch - 65;
                charNum += key;
                charNum %= 26;

                chiffre += (char) (charNum + 65);
            }else{
                chiffre += " ";
            }

        }

        return chiffre;
    }

    JPanel jpnl = new JPanel();
    JPanel keyJpnl = new JPanel();
    JLabel topLbl = new JLabel("Geben Sie das zu verschluesselnde Wort ein:");
    JLabel keyLbl = new JLabel("Geben Sie die Stellen ein, um die verschoben werden soll:");
    JTextField keyTxt = new JTextField(3);
    JTextField inTxt = new JTextField(15);
    JTextField alphabetTxt = new JTextField(26);
    JTextField chiffreAlphabetTxt = new JTextField(26);
    JTextField chiffreTxt = new JTextField(15);

    public caeser91(String title) {
        super(title);

        keyJpnl.setLayout(new FlowLayout());
        keyJpnl.add(keyLbl);
        keyJpnl.add(keyTxt);

        jpnl.setLayout(new BoxLayout(jpnl, BoxLayout.Y_AXIS));
        jpnl.add(keyJpnl);
        jpnl.add(topLbl);
        jpnl.add(inTxt);
        jpnl.add(chiffreTxt);
        jpnl.add(alphabetTxt);
        jpnl.add(chiffreAlphabetTxt);

        alphabetTxt.setEditable(false);
        chiffreAlphabetTxt.setEditable(false);
        chiffreTxt.setEditable(false);

        keyTxt.addActionListener(this);
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
        if(inTxt.getText() != "" && keyTxt.getText() != ""){
            key = Integer.parseInt(keyTxt.getText());

            String input = inTxt.getText().toUpperCase();

            inTxt.setText(input);
            chiffreTxt.setText(encrypt(input));

            writeAlphabet();
        }else{

        }

        repaint();
    }

    public static void main(String args[]){

        caeser91 win = new caeser91("Caeser");
        win.setSize(500,300);
        win.setVisible(true);

    }

}
