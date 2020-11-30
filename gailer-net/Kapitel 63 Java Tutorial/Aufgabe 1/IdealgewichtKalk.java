/*Kapitel 63 Aufgabe 1
  Matthias Korte

  Verwenden Sie die Näherungsformel:
    W = H^2 / 30, fuer weiblich
    W = H^2 / 28, fuer maennlich
    dabei ist W das Idealgewicht in Pfund,
    H ist die Koerpergroesse in Zoll

  Verwenden Sie fuer die Koerpergroesse die Mitte des Bereis fuer jeden der Bereiche der Radio-Buttons.
  Setzen Sie einen Befehlsstring fuer jeden der Radio-Buttons, indem Sie setActionCommand(String) verwenden,
  genau wie bei den Befehlsschaltflaechen.
  Fuegen Sie fuer jeden Button einene Action-Listener hinzu, indem Sie addActionListener() verwenden.

  Waehlen Sie eine Anfangseinstellung fuer die Buttons und geben Sie beim Programmstart das
  Idealgewicht fuer diese Einstellung aus.
  Jedes Mal, wenn ein neuer Button angeklickt wird, berechnen Sie das Idealgewicht
  und geben Sie es aus.
*/

import java.text.DecimalFormat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class IdealgewichtKalk extends JFrame implements ActionListener{

    DecimalFormat ft = new DecimalFormat("#.###");  //format output

    JRadioButton genderM, genderF;
    ButtonGroup genderGroup;
    JPanel genderPanel;

    JRadioButton heightA, heightB, heightC, heightD, heightE;
    ButtonGroup heightGroup;
    JPanel heightPanel;

    JTextField resultText;
    JLabel resultLabel;
    JPanel resultPanel;

    String gender;
    int height;

    public IdealgewichtKalk(){
        setTitle("Idealgewicht Kalkulator");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Gender-Group
        genderM = new JRadioButton("Male", true);
        genderF = new JRadioButton("Female", false);

        genderM.setActionCommand("m");
        genderF.setActionCommand("f");

        genderM.addActionListener(this);
        genderF.addActionListener(this);

        genderGroup = new ButtonGroup();
        genderGroup.add(genderM);
        genderGroup.add(genderF);

        genderPanel = new JPanel();
        genderPanel.setLayout(new BoxLayout(genderPanel, BoxLayout.Y_AXIS));
        genderPanel.add(new JLabel("Your Gender"));
        genderPanel.add(genderM);
        genderPanel.add(genderF);

        //Height-Group
        heightA = new JRadioButton("60 to 64 inches", true);
        heightB = new JRadioButton("64 to 68 inches", false);
        heightC = new JRadioButton("68 to 72 inches", false);
        heightD = new JRadioButton("72 to 76 inches", false);
        heightE = new JRadioButton("76 to 80 inches", false);

        heightA.setActionCommand("62");
        heightB.setActionCommand("66");
        heightC.setActionCommand("70");
        heightD.setActionCommand("74");
        heightE.setActionCommand("78");

        heightA.addActionListener(this);
        heightB.addActionListener(this);
        heightC.addActionListener(this);
        heightD.addActionListener(this);
        heightE.addActionListener(this);

        heightGroup = new ButtonGroup();
        heightGroup.add(heightA);
        heightGroup.add(heightB);
        heightGroup.add(heightC);
        heightGroup.add(heightD);
        heightGroup.add(heightE);

        heightPanel = new JPanel();
        heightPanel.setLayout(new BoxLayout(heightPanel, BoxLayout.Y_AXIS));
        heightPanel.add(new JLabel("Your Height"));
        heightPanel.add(heightA);
        heightPanel.add(heightB);
        heightPanel.add(heightC);
        heightPanel.add(heightD);
        heightPanel.add(heightE);

        //Result-Panel
        resultText = new JTextField(7);
        resultText.setEditable(false);

        resultLabel = new JLabel("Idealgewicht");

        resultPanel = new JPanel();
        resultPanel.add(resultLabel);
        resultPanel.add(resultText);

        //Frame
        add(genderPanel, BorderLayout.WEST);
        add(heightPanel, BorderLayout.EAST);
        add(resultPanel, BorderLayout.SOUTH);

        //setting startsettings
        gender = "m";
        height = 62;

        resultText.setText(ft.format(kalk(height)));
    }

    //App
    public double kalk(int h){
        if(gender.equals("f")){
            return (Math.pow(h, 2))/30;
        }else{
            return (Math.pow(h, 2))/28;
        }
    }

    public void actionPerformed(ActionEvent event){
        String actionCmd = event.getActionCommand();

        if(actionCmd.equals("f")||actionCmd.equals("m")){
            gender = actionCmd;
            System.out.println("Gender change: " + gender + "; height: " + height + "; Kalk: " + kalk(height));
        }else if(actionCmd.equals("62")||actionCmd.equals("66")||actionCmd.equals("70")||actionCmd.equals("74")||actionCmd.equals("78")){
            height = Integer.parseInt(actionCmd);
            System.out.println("Height change: " + height + "; gender: " + gender + "; Kalk: " + kalk(height));
        }

        String idealWeight = ft.format(kalk(height));

        resultText.setText(idealWeight);

        repaint();

    }

    public static void main(String args[]){

        IdealgewichtKalk weightApp = new IdealgewichtKalk();
        weightApp.setSize(250, 225);
        weightApp.setResizable(false);
        weightApp.setVisible(true);

    }

}
