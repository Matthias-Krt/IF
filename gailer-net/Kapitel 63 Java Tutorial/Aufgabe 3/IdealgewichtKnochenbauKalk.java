/*Kapitel 63 Aufgabe 3
  Matthias Korte

  Ein verbessterter Gewichtskalkulator beruecksichtigt den menschlichen Knochenbau.
  Fuegen Sie ein weiteres Panel von Radio-Buttons hinzu, das den Anwender erlaubt zwischen schmalen,
  normalen und starken Knochenbau zu waehlen.
  Multiplizieren Sie das Ergebnis der oben stehenden Idealgewichtsberechnung mit:
    0.95 bei schmalen
    1.0  bei normalem
    1.05 bei starkem
  Knochenbau.
*/

import java.text.DecimalFormat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class IdealgewichtKnochenbauKalk extends JFrame implements ActionListener{

    DecimalFormat ft = new DecimalFormat("#.###");  //format output

    JRadioButton genderM, genderF;
    ButtonGroup genderGroup;
    JPanel genderPanel;

    JRadioButton heightA, heightB, heightC, heightD, heightE;
    ButtonGroup heightGroup;
    JPanel heightPanel;

    JRadioButton smallBones, normalBones, bigBones;
    ButtonGroup bonesGroup;
    JPanel bonesPanel;

    JTextField resultText;
    JLabel resultLabel;
    JPanel resultPanel;

    String gender;
    int height;
    String bones;

    public IdealgewichtKnochenbauKalk(){
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

        //Bone-Group
        smallBones = new JRadioButton("schmaler Knochenbau", false);
        normalBones = new JRadioButton("normaler Knochenbau", true);
        bigBones = new JRadioButton("schwerer Knochenbau", false);

        smallBones.setActionCommand("smallB");
        normalBones.setActionCommand("normB");
        bigBones.setActionCommand("bigB");

        smallBones.addActionListener(this);
        normalBones.addActionListener(this);
        bigBones.addActionListener(this);

        bonesGroup = new ButtonGroup();
        bonesGroup.add(smallBones);
        bonesGroup.add(normalBones);
        bonesGroup.add(bigBones);

        bonesPanel = new JPanel();
        bonesPanel.setLayout(new BoxLayout(bonesPanel, BoxLayout.Y_AXIS));
        bonesPanel.add(new JLabel("Your Gender"));
        bonesPanel.add(smallBones);
        bonesPanel.add(normalBones);
        bonesPanel.add(bigBones);

        //Result-Panel
        resultText = new JTextField(7);
        resultText.setEditable(false);

        resultLabel = new JLabel("Idealgewicht");

        resultPanel = new JPanel();
        resultPanel.add(resultLabel);
        resultPanel.add(resultText);

        //Frame
        add(genderPanel, BorderLayout.LINE_START);
        add(heightPanel, BorderLayout.CENTER);
        add(bonesPanel, BorderLayout.LINE_END);
        add(resultPanel, BorderLayout.PAGE_END);

        //setting startsettings
        gender = "m";
        height = 62;
        bones = "normB";

        resultText.setText(ft.format(kalk(height,gender,bones)));
    }

    //App
    public double kalk(int h, String g, String b){
        double result;

        //Gender
        if(g.equals("f")){
            result = (Math.pow(h, 2))/30;
        }else{
            result = (Math.pow(h, 2))/28;
        }

        //Bone build
        if(b.equals("smallB")){
            result *= 0.95;
        }else if(b.equals("normB")){
            result *= 1;
        }else if(b.equals("bigB")){
            result *= 1.05;
        }

        return result;
    }

    public void actionPerformed(ActionEvent event){
        String actionCmd = event.getActionCommand();

        if(actionCmd.equals("f")||actionCmd.equals("m")){
            //check for gender change
            gender = actionCmd;
            System.out.println("Gender change: " + gender + "; height: " + height + "; Kalk: " + kalk(height, gender, bones));
        }else if(actionCmd.equals("62")||actionCmd.equals("66")||actionCmd.equals("70")||actionCmd.equals("74")||actionCmd.equals("78")){
            //check for height change
            height = Integer.parseInt(actionCmd);
            System.out.println("Height change: " + height + "; gender: " + gender + "; Kalk: " + kalk(height, gender, bones));
        }else if(actionCmd.equals("smallB")||actionCmd.equals("normB")||actionCmd.equals("bigB")){
            //check for bone build change
            bones = actionCmd;
            System.out.println("Bone build: " + bones + "; gender: " + gender + "; Height: " + height + "; Kalk: " + kalk(height, gender, bones));
        }

        String idealWeight = ft.format(kalk(height, gender, bones));

        resultText.setText(idealWeight);

        repaint();

    }

    public static void main(String args[]){

        IdealgewichtKnochenbauKalk weightApp = new IdealgewichtKnochenbauKalk();
        weightApp.setSize(450, 400);
        weightApp.setResizable(false);
        weightApp.setVisible(true);

    }

}
