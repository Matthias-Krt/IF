class HalloObjekt
{
  // Methodendefinition
  void sprich()
  {
    System.out.println("Hallo von einem Objekt!");
  }
}

class HalloTester
{
  public static void main ( String[] args )
  {
    HalloObjekt einObjekt = new HalloObjekt();

    einObjekt.sprich();
  }
}
