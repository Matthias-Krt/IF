class TriangleCalc{
  int Triangle( int N )
  {
    if ( N == 1 )
      return 1;
    else
      return N + Triangle( N-1 );
  }
}

class TriangleTester
{
  public static void main ( String[] args)
  {
    TriangleCalc tri = new TriangleCalc();
    int result = tri.Triangle( 4 );
    System.out.println("Triangle(4) is " + result );
  }
}
