package opgave01;

import java.util.Scanner;

public class Opgave1medscanner {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Indtast beløb i hele kroner:  ");
        int beløb = input.nextInt(); //Forbrugeren indtaster beløbet
        double moms=beløb*0.20; // Formel for at beregne momsen

        System.out.println("Moms af " +beløb + "kr. er " + moms + "kr. "); // Outputtet
    }
}
