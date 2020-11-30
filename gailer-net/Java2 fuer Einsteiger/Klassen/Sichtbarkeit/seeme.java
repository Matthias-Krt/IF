public class seeme{

    public void sichtbar(){
        System.out.println("Dies ist eine public Methode!");
    }

    private void unsichtbar(){
        System.out.println("Dies ist eine private Methode!");
    }

    protected void usePrivate(){
        this.unsichtbar();
    }
}
