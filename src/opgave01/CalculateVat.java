package opgave01;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {

        //Angiver hvilke variabler der er, og hvilke de værdier de har
        double Købsbeløb=1000; // Skriv hvad du køber for
        double Moms=Købsbeløb*0.20; // Tager variablen Købsbeløb og ganger med 0,20 (moms)

        // Outputtet på Moms af dit køb
        System.out.print("Hvis dit indkøb er "+Købsbeløb);
        System.out.println(" så er moms af købet "+ Moms);
    }
}
