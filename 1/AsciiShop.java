import java.util.Scanner;

public class AsciiShop {
    public static void main(String[] args) {
       
    	scanner sc= new Scanner(System.in);
        
    	int Zeile= 0;
        int Spalte= 0;    // deffiniere 2 Variablen der Art int
       
       
        boolean inputIscorrect= true;  // lasse mir True ausgeben
       
        while (sc.hasNextLine()){     // hier startet die Schleife, welche dann das eingetippte verarbeitet
            String input= sc.nextLine();
           
            if (Zeile== 0) {
                Zeile= input.length();
            }
            else if (input.length()!= Zeile){
                inputIscorrect= false;
                Spalte= Spalte +1;    // erhöhe Splate um eins
            }
        }
        if (!inputIscorrect){
            system.out.println("INPUT MISMATCH");   // Fehlermeldung wenn falsch
        }
        else{
            System.out.println(Zeile + " " + Spalte);  //Ausgabe wenn true
        }
    }
}
