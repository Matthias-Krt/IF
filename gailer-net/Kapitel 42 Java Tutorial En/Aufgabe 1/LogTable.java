/*Kapitel 42 Aufgabe 1
  Matthias Korte
  Modifizieren Sie das Programm so das es die Tabelle von x und ln(x) formatiert ausgibt.
  Formatiere die Tabelle mithilfe von HTML um das zu erreichen "print" zuerst:
    <html>
    <body>
    <table>
    <tr><th>x</th><th>ln(x)</th></tr>
  Danach, berechne fuer jede Reihe x und logx und "print" die Reihe so aus:
    System.out.println("<tr><td>" + x + "</td><td>" + logx + "</td></tr>");
  Abschließend "print":
    </table>
    </body>
    </html>
  Fuehre das Programm aus leite die Ausgabe auf eine Datei um (Kapitel 21).
    C:\java LogTable > myLogs.html
  Sie haben jetzt die Moeglichkeit die Ausgabe in einem Webbrowser anzusehen.
*/

class LogTable{

    public static void main(String args[]){

        int x;
        double logx;

        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<table>");
        System.out.println("<tr><th>x</th><th>ln(x)</th></tr>");

        for(x = 1; x <= 25; x++){
            logx = Math.log(x);
            System.out.println("<tr><td>" + x + "</td><td>" + logx + "</td></tr>");
        }

        System.out.println("</table>");
        System.out.println("</body>");
        System.out.println("</html>");

    }
}
