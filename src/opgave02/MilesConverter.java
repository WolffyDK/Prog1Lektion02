package opgave02;

import java.util.Scanner;

public class MilesConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Scanner til at indtaste mil fra brugeren
        System.out.print("Indtast antal mil:");
        double mil=input.nextDouble();

        //Konvetering fra mil til km
        double kilometer=mil*1.6;

        //Output fra programmet
        System.out.printf("%.1f mil er %.1f km.%n", mil, kilometer);
    }
}
