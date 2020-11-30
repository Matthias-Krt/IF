/* Matthias Korte */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class caeser extends JFrame implements ActionListener{

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

    String decrypt(String chiffre) {
        String txt = "";
        char ch;
        int len = chiffre.length();
        int charNum;

        for(int i = 0; i < len; i++){
            ch = chiffre.charAt(i);

            if(ch != 32){
                charNum = (int) ch - 65;
                charNum -= 3;
                charNum %= 26;

                txt += (char) (charNum + 65);
            }else{
                txt += " ";
            }
        }

        return txt;
    }

    JLabel topLbl = new JLabel("Geben Sie das zu verschluesselnde Wort ein:");
    JTextField inTxt = new JTextField(15);
    JTextField chiffreTxt = new JTextField(15);
    JTextField klarTxt = new JTextField(15);

    public caeser(String title) {
        super(title);

        setLayout(new FlowLayout());
        add(topLbl);
        add(inTxt);
        add(chiffreTxt);
        add(klarTxt);

        chiffreTxt.setEditable(false);
        klarTxt.setEditable(false);

        inTxt.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {
        String input = inTxt.getText().toUpperCase();

        inTxt.setText(input);
        chiffreTxt.setText(encrypt(input));
        klarTxt.setText(decrypt(chiffreTxt.getText()));

        repaint();
    }

    public static void main(String args[]){

        caeser win = new caeser("Caeser");
        win.setSize(300,300);
        win.setVisible(true);

    }

}
