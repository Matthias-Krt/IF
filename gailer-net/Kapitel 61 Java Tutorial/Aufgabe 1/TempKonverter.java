/*Kapitel 61 Aufgabe 1
  Matthias Korte

  Modifizieren Sie das Temperatur-Converter Programm, so dass es Celsius in Fahrenheit umrechnet.
  Verwenden Sie die Formel:
    fahr = celsius * 9/5 + 32
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class TempKonverter extends JFrame implements ActionListener{
  JLabel heading  = new JLabel("Convert Celcius to Fahrenheit");
  JLabel inLabel  = new JLabel("Celsius         ");
  JLabel outLabel = new JLabel("Fahrenheit ");

  JTextField inFahr = new JTextField( 7 );
  JTextField outCel = new JTextField( 7 );

  int fahrTemp ;
  int celsTemp ;

  TempKonverter(String title){
     super(title);

     setLayout(new FlowLayout());

     inFahr.addActionListener( this );
     outCel.setEditable( false );

     add( heading );
     add( inLabel );
     add( outLabel );
     add( inFahr );
     add( outCel );

     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // Die Applikation
  public int convert(int c){
    return (c * 9/5 + 32);
  }

  public void actionPerformed( ActionEvent evt){
    String userIn = inFahr.getText() ;
    celsTemp = Integer.parseInt(userIn) ;

    fahrTemp = convert(celsTemp) ;

    outCel.setText(fahrTemp + "");
    repaint();

  }

  public static void main (String[] args){
    TempKonverter fahr  = new TempKonverter("C to F") ;

    fahr.setSize( 200, 150 );
    fahr.setVisible( true );
  }

}
