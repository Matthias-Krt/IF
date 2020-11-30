/*Kapitel 64 Aufgabe 1
  Matthias Korte

  Schreiben Sie einen Idealgewicht-Kalkulator, so dass die Koerpergroesse in Zoll ueber einen Slider eingegeben wird.
  Verwenden Sie die Naeherungsformel:
    W = H^2 / 30, fuer maennlich
    W = H^2 / 28, fuer weiblich
    dabei ist W das Idealgewicht in Pfund,
    H ist die Koerpergroesse in Zoll

  Setzen Sie einen Befehlsstring fuer jeden Radio-Button, indem Sie setActionCommand(String) verwenden.

  Fuegen Sie einen Action-Listener fuer jeden Button hinzu, indem Sie addActionListener() verwenden.

  Fuegen Sie einen Change-Listener fuer den Slider hinzu, indem Sie addChangeListener() verwenden.

  Das Idealgewicht sollte in einem Textfeld angezeigt werden, wenn der Anwender sowohl einen
  Radio-Button als auch den Slider aendert.

  Waehlen Sie Anfangseinstellungen fuer die Buttons und den Slider. Wenn das Programm startet,
  zeigen Sie das Idealgewicht fuer diese Einstellungen an.
*/

import java.text.DecimalFormat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSlider;

public class IdealgewichtKalk extends JFrame implements ActionListener, ChangeListener{

    DecimalFormat ft = new DecimalFormat("#.###");  //format output

    JRadioButton genderM, genderF;
    ButtonGroup genderGroup;
    JPanel genderPanel;

    JSlider heightSlider;
    JTextField heightText;
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
        heightSlider = new JSlider(JSlider.VERTICAL, 40, 80, 62);
        heightSlider.setMajorTickSpacing(5);
        heightSlider.setMinorTickSpacing(1);
        heightSlider.setPaintTicks(true);
        heightSlider.setPaintLabels(true);
        heightSlider.setName("heightSlider");
        heightSlider.addChangeListener(this);

        heightText = new JTextField(7);
        heightText.setEditable(false);
        heightText.setText(heightSlider.getValue() + " ");

        heightPanel = new JPanel();
        heightPanel.setLayout(new BoxLayout(heightPanel, BoxLayout.Y_AXIS));
        heightPanel.add(new JLabel("Your Height"));
        heightPanel.add(heightSlider);
        heightPanel.add(heightText);

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
        }

        String idealWeight = ft.format(kalk(height));
        resultText.setText(idealWeight);

        repaint();

    }

    public void stateChanged(ChangeEvent event){
        JSlider src = (JSlider)event.getSource();

        if(src.getName().equals("heightSlider")){
            height = src.getValue();
            heightText.setText(src.getValue() + " ");
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
