/*Kapitel 61 Aufgabe 2
  Matthias Korte

  Fuegen Sie dem Temperatur-Konverter Porgramm zwei Buttons hinzu.
  Das Klicken auf den einen Button konvertiert Fahrenheit un Celsius.
  Fuegen Sie einen "Reset"-Button hinzu, der den Inhalt der beiden Textfelder löscht.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class TwoWayConverter extends JFrame implements ActionListener{
    JLabel heading  = new JLabel("Convert Fahrenheit to Celsius");
    JLabel inLabel  = new JLabel("Fahrenheit         ");
    JLabel outLabel = new JLabel("Celcius ");

    JTextField inFahr = new JTextField( 7 );
    JTextField outCel = new JTextField( 7 );

    JButton convertBtn = new JButton("Convert");
    JButton resetBtn = new JButton("Reset");

    int fahrTemp ;
    int celsTemp ;

    TwoWayConverter(String title){
        super(title);

        setLayout(new FlowLayout());

        convertBtn.addActionListener(this);
        convertBtn.setActionCommand("convert");

        resetBtn.addActionListener(this);
        resetBtn.setActionCommand("reset");

        outCel.setEditable( false );

        add( heading );
        add( inLabel );
        add( outLabel );
        add( inFahr );
        add( outCel );
        add(convertBtn);
        add(resetBtn);

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    // Die Applikation
    public int convert(int F){
        return ( (F-32) * 5 ) / 9;
    }

    public void actionPerformed( ActionEvent event){

        if(event.getActionCommand().equals("convert")){
            String userIn = inFahr.getText() ;
            celsTemp = Integer.parseInt(userIn) ;

            fahrTemp = convert(celsTemp) ;

            outCel.setText(fahrTemp + "");
        }else if(event.getActionCommand().equals("reset")){
            inFahr.setText("");
            outCel.setText("");
        }

    }

    public static void main (String[] args){
        TwoWayConverter win  = new TwoWayConverter("Two Way Converter") ;

        win.setSize( 200, 150 );
        win.setVisible( true );
    }

}
