import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZweiButtons extends JFrame implements ActionListener
{
  JButton rotButton ;
  JButton gruenButton ;
  JButton blauButton;

  // Konstruktor für ZweiButtons
  public ZweiButtons(String title)
  {
    super( title );

    rotButton = new JButton("Rot");
    gruenButton = new JButton("Grün");
    blauButton = new JButton("Blau");
    rotButton.setActionCommand( "rot" );   // Befehl setzen
    gruenButton.setActionCommand( "gruen" ); // Befehl setzen
    blauButton.setActionCommand("blau");

    // register the buttonDemo frame
    // as the listener for both Buttons.
    rotButton.addActionListener( this );
    gruenButton.addActionListener( this );
    blauButton.addActionListener( this );

    setLayout( new FlowLayout() );
    add( rotButton );
    add( gruenButton );
    add( blauButton );

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public void actionPerformed( ActionEvent evt)
  {
    // überprüfen, welcher Befehlsstring gesendet wurde
    if ( evt.getActionCommand().equals( "rot" ) )
      getContentPane().setBackground(  Color.red  ) ;
    else if(evt.getActionCommand().equals("gruen"))
      getContentPane().setBackground( Color.green ) ;
    else{
        getContentPane().setBackground( Color.blue);
    }

    repaint();
  }

  public static void main ( String[] args )
  {
    ZweiButtons demo  = new ZweiButtons( "Klicken Sie auf einen Button" ) ;

    demo.setSize( 300, 150 );
    demo.setVisible( true );
  }
}
