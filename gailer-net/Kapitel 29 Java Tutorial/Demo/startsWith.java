class PraefixTest
{
  public static void main ( String args[] )
  {
     String entflammt = "Meine Liebe ist wie eine rote, rote Rose.";

     if ( entflammt.startsWith( "Meine Liebe" ) )
       System.out.println( "Praefix 1 stimmt ueberein." );
     else
       System.out.println( "Praefix 1 stimmt nicht ueberein." );

     if ( entflammt.startsWith( "meine Liebe" ) )
       System.out.println( "Praefix 2 stimmt ueberein." );
     else
       System.out.println( "Praefix 2 stimmt nicht ueberein." );

     if ( entflammt.startsWith( "  Meine Liebe" ) )
       System.out.println( "Praefix 3 stimmt ueberein." );
     else
       System.out.println( "Praefix 3 stimmt nicht ueberein." );

     if ( entflammt.startsWith( "  Meine Liebe".trim() ) )
       System.out.println( "Praefix 4 stimmt ueberein." );
     else
       System.out.println( "Praefix 4 stimmt nicht ueberein." );
  }
}
