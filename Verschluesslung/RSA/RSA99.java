/* Matthias Korte

   Schreiben Sie ein Programm, das aus einem Verschluessler und einem Entschluesseler besteht.
   Der Verschluessler setzt den Text in eine Zahlenfolge um und verschluesserlt dann die Zahlenbloecke nach RSA wie oben.
   Der Entschluesseler wendet das RSA-Verfahren an und setzt die entschluesselten Zahlenbloecke wieder in Text um.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.BigInteger;

public class RSA99 extends JFrame implements ActionListener {

    String textToNumber(String s) {
        StringBuffer sb = new StringBuffer("");
        int alphabetIndex;

        for (int i = 0; i < s.length(); i++) {
            if (s.toUpperCase().charAt(i) != 32) {
                alphabetIndex = (int) s.toUpperCase().charAt(i) - 64;
            } else {
                alphabetIndex = 0;
            }

            if (alphabetIndex < 10) { sb.append("0"); }
            sb.append(alphabetIndex);
        }

        for (int i = 0; i < sb.length() % 4; i++ ) { sb.append("0"); }
        for (int i = 4; i < sb.length() + 1; i += 5) { sb.insert(i, " "); }

        return sb.toString();
    }

    String numberToText(String n) {
        n = n.replaceAll(" ", "");

        StringBuffer sb = new StringBuffer("");
        int alphabetIndex;
        char ch;

        for (int i = 0; i < n.length(); i += 2) {
            alphabetIndex = Integer.parseInt(n.substring(i, i + 2));
            if (alphabetIndex < 1) {
                ch = ' ';
            } else {
                ch = (char) (alphabetIndex + 64);
            }

            sb.append(ch);
        }

        return sb.toString();
    }

    int rsaDecrypt(int num, int d, int n) {
        BigInteger clearNum = new BigInteger("0");
        BigInteger chiffreNum = BigInteger.valueOf(num);
        BigInteger N = BigInteger.valueOf(n);

        clearNum = chiffreNum.pow(d);
        clearNum = clearNum.remainder(N);

        return clearNum.intValue();
    }

    int rsaEncrypt(int num, int e, int n) {
        BigInteger chiffreNum = new BigInteger("0");
        BigInteger clearNum = BigInteger.valueOf(num);
        BigInteger N = BigInteger.valueOf(n);

        chiffreNum = clearNum.pow(e);
        chiffreNum = chiffreNum.remainder(N);

        return chiffreNum.intValue();
    }

    String encrypt(String num, int E, int N) {
        StringBuffer sb = new StringBuffer("");
        int blockNum;

        for (String block : num.split(" ")) {
            blockNum = Integer.parseInt(block);
            blockNum = rsaEncrypt(blockNum, E, N);

            for (int i = 0; i < 4 - String.valueOf(blockNum).length(); i++) { sb.append("0"); }
            sb.append(blockNum);
            sb.append(" ");
        }

        return sb.toString();
    }

    String decrypt(String num, int D, int N) {
        StringBuffer sb = new StringBuffer("");
        int blockNum;

        for (String block : num.split(" ")) {
            blockNum = Integer.parseInt(block);
            blockNum = rsaDecrypt(blockNum, D, N);

            for (int i = 0; i < 4 - String.valueOf(blockNum).length(); i++) { sb.append("0"); }
            sb.append(blockNum);
            sb.append(" ");
        }

        return sb.toString();
    }

    JPanel pnl = new JPanel();
    JPanel pnlCenter = new JPanel();
    JPanel pnlKeysEN = new JPanel();
    JPanel pnlKeyD = new JPanel();

    JLabel lblKeysEN = new JLabel("Schluessel E und N eingeben, dann Text:");
    JLabel lblKeyD = new JLabel("Schluessel D eingeben: ");
    JLabel lblError = new JLabel("");

    JTextField txtKeyE = new JTextField(15);
    JTextField txtKeyN = new JTextField(15);
    JTextField txtKeyD = new JTextField(15);

    JTextField txtInClearText = new JTextField();
    JTextField txtInChiffreNumber = new JTextField();
    JTextField txtOutClearNumber = new JTextField();    //Disabled
    JTextField txtOutClearText = new JTextField();      //Disabled

    JButton btnEncrypt = new JButton("Verschluesseln");
    JButton btnDecrypt = new JButton("Entschluesseln");

    public RSA99(String title) {
        super(title);

        pnlKeysEN.setLayout(new FlowLayout());
        pnlKeysEN.add(txtKeyE);
        pnlKeysEN.add(txtKeyN);

        pnlKeyD.setLayout(new FlowLayout());
        pnlKeyD.add(lblKeyD);
        pnlKeyD.add(txtKeyD);

        pnlCenter.setLayout(new BoxLayout(pnlCenter, BoxLayout.Y_AXIS));
        pnlCenter.add(lblKeysEN);
        pnlCenter.add(pnlKeysEN);
        pnlCenter.add(txtInClearText);
        pnlCenter.add(txtInChiffreNumber);
        pnlCenter.add(pnlKeyD);
        pnlCenter.add(txtOutClearNumber);
        pnlCenter.add(txtOutClearText);

        pnl.setLayout(new BorderLayout());
        pnl.add(btnEncrypt, BorderLayout.WEST);
        pnl.add(btnDecrypt, BorderLayout.EAST);
        pnl.add(pnlCenter, BorderLayout.CENTER);
        pnl.add(lblError, BorderLayout.SOUTH);

        txtOutClearNumber.setEnabled(false);
        txtOutClearText.setEnabled(false);

        btnEncrypt.setActionCommand("encrypt");
        btnEncrypt.addActionListener(this);
        btnDecrypt.setActionCommand("decrypt");
        btnDecrypt.addActionListener(this);

        this.getContentPane().add(pnl);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getActionCommand().equals("encrypt")) {
            int E = Integer.parseInt(txtKeyE.getText());
            int N = Integer.parseInt(txtKeyN.getText());

            txtInChiffreNumber.setText(encrypt(textToNumber(txtInClearText.getText()), E, N));
            txtOutClearNumber.setText(textToNumber(txtInClearText.getText()));
        } else if (evt.getActionCommand().equals("decrypt")) {
            int D = Integer.parseInt(txtKeyD.getText());
            int N = Integer.parseInt(txtKeyN.getText());

            txtOutClearNumber.setText(decrypt(txtInChiffreNumber.getText(), D, N));
            txtOutClearText.setText(numberToText(txtOutClearNumber.getText()));
        }
    }

    public static void main(String[] args) {
        RSA99 win = new RSA99("RSA");
        win.setSize(800, 500);
        win.setVisible(true);
    }
}
