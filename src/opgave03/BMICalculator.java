package opgave03;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // Indtast din vægt og højde
        System.out.print("Indtast din vægt:"); //Vægt
        double vægt= input.nextDouble();
        System.out.print("Indtast din højde i cm:");
        double højdecm= input.nextDouble();
        double højde=højdecm/100; // Beregner din hæjde fra cm til m

        //Formel til at bergne BMI
        double bmi=vægt/(højde*højde);

        //output
        System.out.printf("Din BMI er = %.1f%n", bmi);

        //Lir
        if (bmi<18.5) {
            System.out.println("Du er undervægtig bror");
        } else if (bmi<25) {
            System.out.println("Du er normal vægtig bror");
        } else if (bmi<30) {
            System.out.println("Du er overvægtig bror");
        }else if(bmi>30)
                System.out.println("Du er svært overvægtig bror");
            
        }
    }
