class ArrayOps
{                          // the parameter x refers to the data
  int findMax( int[] x )   //  this method is called with.
  {
    int max = x[0];

    for ( int index=0; index <x.length; index++ )
      if ( x[index] > max )
        max = x[index] ;

    return max ;
  }
}

class ArrayDemo
{
  public static void main ( String[] args )
  {
    int[] ar1 =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;

    ArrayOps operate = new ArrayOps();     // create an ArrayOps object
    int biggest = operate.findMax( ar1 );  // call the findMax() method with the array
    System.out.println("The maximum is: " + biggest );
  }

} 
