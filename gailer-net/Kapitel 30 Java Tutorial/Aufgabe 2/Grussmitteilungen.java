/*Kapitel 30 Aufgabe 2
Matthias Korte 

Ändern Sie das Programm aus Aufgabe 1,
so dass die Klasse HalloObjekt(Hier GrussObjekt) zwei Grußmitteilungen ausgibt:
einen Morgengruß (Guten Morgen Welt!)
und einen Abendgruß. (Guten Abend Welt!)
Für die Ausgabe wird es zwei Methoden geben, eine für jede Grußmitteilung.*/

class Grussmitteilungen{

    public static void main(String[] args){

        GrussObjekt obj = new GrussObjekt();

        obj.Morgengruß();
        obj.Abendgruß();

    }
}

class GrussObjekt{

    void Morgengruß() {
        System.out.println("Guten Morgen Welt!");
    }

    void Abendgruß() {
        System.out.println("Guten Abend Welt!");
    }
}
