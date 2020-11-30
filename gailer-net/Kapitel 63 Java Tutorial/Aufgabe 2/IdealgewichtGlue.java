/*Kapitel 63 Aufgabe 2
  Matthias Korte

  Stellen Sie die grafische Benutzerschnittstelle fertig, indems Sie Glue verwenden um die beiden Button Panles zu trennen.
  Verwenden Sie das Beispiel Idealglue aus diesem Kapitel. Experimentrieren Sie damit, indem Sie mehr Glue hinzufuegen.
  Veraendern Sie die Groesse des Frames, um die Auswirkung des Klebers zu sehen.
  Fuegen Sie den Applikationscode aus der Aufgabe 1 hinzu.
*/

import java.text.DecimalFormat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class IdealgewichtGlue extends JFrame implements ActionListener{

    DecimalFormat ft = new DecimalFormat("#.###");  //format output

    JRadioButton genderM, genderF;
    ButtonGroup genderGroup;
    Box genderBox;

    JRadioButton heightA, heightB, heightC, heightD, heightE;
    ButtonGroup heightGroup;
    Box heightBox;

    Box buttonBox;

    JTextField resultText;
    JLabel resultLabl;
    JPanel resultPanel;

    String gender;
    int height;

    public IdealgewichtGlue(){
        setTitle( "Your Ideal Weight" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        // Gender-Gruppe
        genderM = new JRadioButton("Male", true );
        genderF = new JRadioButton("Female", false );
        genderM.setActionCommand("m");
        genderF.setActionCommand("f");
        genderM.addActionListener(this);
        genderF.addActionListener(this);
        genderGroup = new ButtonGroup();
        genderGroup.add( genderM );
        genderGroup.add( genderF );

        genderBox = new Box( BoxLayout.Y_AXIS );
        genderBox.add( new JLabel("Your Gender") );
        genderBox.add( Box.createRigidArea( new Dimension(1, 8) ) );
        genderBox.add( genderM );
        genderBox.add( genderF );
        genderBox.add( Box.createRigidArea( new Dimension(1, 73) ) );

        // Height-Gruppe
        heightA = new JRadioButton("60 to 64 inches", true  );
        heightB = new JRadioButton("64 to 68 inches", false );
        heightC = new JRadioButton("68 to 72 inches", false );
        heightD = new JRadioButton("72 to 76 inches", false );
        heightE = new JRadioButton("76 to 80 inches", false );

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
        heightGroup.add( heightA ); heightGroup.add( heightB );
        heightGroup.add( heightC ); heightGroup.add( heightD );
        heightGroup.add( heightE );

        heightBox = new Box(BoxLayout.Y_AXIS);
        heightBox.add( new JLabel("Your Height") );
        heightBox.add( Box.createRigidArea( new Dimension(1, 8) ) );
        heightBox.add( heightA ); heightBox.add( heightB );
        heightBox.add( heightC ); heightBox.add( heightD );
        heightBox.add( heightE );

        // Button-Box
        buttonBox = new Box( BoxLayout.X_AXIS );
        buttonBox.add( Box.createHorizontalGlue() );
        buttonBox.add( genderBox );
        buttonBox.add( Box.createHorizontalGlue() );
        buttonBox.add( heightBox );
        buttonBox.add( Box.createHorizontalGlue() );

        // Result-Panel
        resultText  = new JTextField(7);
        resultText.setEditable( false );
        resultLabl  = new JLabel("Ideal Weight");
        resultPanel = new JPanel();
        resultPanel.add( resultLabl );
        resultPanel.add( resultText );

        // Frame
        setLayout( new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ) );
        add( buttonBox );
        add( resultPanel );

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

    public static void main(String[] args){
        IdealgewichtGlue weightApp = new IdealgewichtGlue();
        weightApp.setSize(450, 400);
        weightApp.setResizable(false);
        weightApp.setVisible(true);
    }

}
