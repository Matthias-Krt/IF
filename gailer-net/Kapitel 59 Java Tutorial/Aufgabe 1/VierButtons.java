import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VierButtons extends JFrame implements ActionListener {
  JButton rotButton;
  JButton gruenButton;
  JButton blauButton;
  JButton grauButton;

  // Konstruktor fuer ZweiButtons
  public VierButtons(String title) {

    super( title );

    rotButton = new JButton("Rot");
    gruenButton = new JButton("Gruen");
    blauButton = new JButton("Blau");
    grauButton = new JButton("Grau");

    //Befehle setzen
    rotButton.setActionCommand( "rot" );
    gruenButton.setActionCommand( "gruen" );
    blauButton.setActionCommand("blau");
    grauButton.setActionCommand("grau");

    // register the buttonDemo frame
    // as the listener for both Buttons.
    rotButton.addActionListener( this );
    gruenButton.addActionListener( this );
    blauButton.addActionListener( this );
    grauButton.addActionListener( this );

    setLayout( new FlowLayout() );
    add( rotButton );
    add( gruenButton );
    add( blauButton );
    add( grauButton );

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

  }

  public void actionPerformed( ActionEvent evt) {

    // überprüfen, welcher Befehlsstring gesendet wurde
    if ( evt.getActionCommand().equals( "rot" ) )
      getContentPane().setBackground(  Color.red  ) ;
    else if(evt.getActionCommand().equals("gruen"))
      getContentPane().setBackground( Color.green ) ;
    else if(evt.getActionCommand().equals("grau"))
      getContentPane().setBackground( Color.gray );
    else{
        getContentPane().setBackground( Color.blue);
    }

    repaint();

  }

  public static void main ( String[] args ) {
    VierButtons demo  = new VierButtons( "Klicken Sie auf einen Button" ) ;

    demo.setSize( 500, 500 );
    demo.setVisible( true );
  }
}
