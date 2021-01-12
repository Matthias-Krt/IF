/* Matthias Korte

   Schreiben Sie ein Programm, das aus einem Verschluessler und einem Entschluesseler besteht.
   Der Verschluessler setzt den Text in eine Zahlenfolge um und verschluesserlt dann die Zahlenbloecke nach RSA wie oben.
   Der Entschluesseler wendet das RSA-Verfahren an und setzt die entschluesselten Zahlenbloecke wieder in Text um.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RSA99 extends JFrame implements ActionListener {

    JFrame frame = new JFrame("RSA");

    JPanel jpnl = new JPanel();
    JPanel jpnlCenter = new JPanel();
    JPanel jpnlKeysEN = new JPanel();
    JPanel jpnlKeysD = new JPanel();

    JLabel lblKeys = new JLabel("Schluessel E und N eingeben, dann Text:");
    JLabel lblKeyD = new JLabel("Schluessel D eingeben: ");

    JTextField txtKeyE = new JTextField();
    JTextField txtKeyN = new JTextField();
    JTextField txtInput = new JTextField();
    JTextField txtNumberInput = new JTextField();
    JTextField txtKeyD = new JTextField();
    JTextField txtNumberChiffre = new JTextField();
    JTextField txtChiffre = new JTextField();

    JButton btnEncrypt= new JButton("Verschluesseln");
    JButton btnDecrypt = new JButton("Entschluesseln");

    public RSA99(String title) {
        super(title);

        jpnlKeysEN.setLayout(new FlowLayout());
        jpnlKeysEN.add(txtKeyE);
        jpnlKeysEN.add(txtKeyN);

        jpnlKeysD.setLayout(new FlowLayout());
        jpnlKeysD.add(lblKeyD);
        jpnlKeysD.add(txtKeyD);

        jpnlCenter.setLayout(new BoxLayout(jpnlCenter, BoxLayout.Y_AXIS));
        jpnlCenter.add(jpnlKeysEN);
        jpnlCenter.add(txtInput);
        jpnlCenter.add(txtNumberInput);
        jpnlCenter.add(jpnlKeysD);
        jpnlCenter.add(txtNumberChiffre);
        jpnlCenter.add(txtChiffre);

        jpnl.setLayout(new BorderLayout());
        jpnl.add(lblKeys, BorderLayout.NORTH);
        jpnl.add(btnEncrypt, BorderLayout.WEST);
        jpnl.add(btnDecrypt, BorderLayout.EAST);
        jpnl.add(jpnlCenter, BorderLayout.CENTER);

        btnEncrypt.setActionCommand("Encrypt");
        btnDecrypt.setActionCommand("Decrypt");
        btnEncrypt.addActionListener(this);
        btnDecrypt.addActionListener(this);

        this.getContentPane().add(jpnl);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getActionCommand().equals("Encrypt")) {

        } else if(evt.getActionCommand().equals("Decrypt")) {

        }
    }

    public static void main(String[] args) {

        RSA99 win = new RSA99("RSA");
        win.setSize(800, 500);
        win.setVisible(true);

    }

}
