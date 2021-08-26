import java.text.DecimalFormat;
import java.util.Scanner;

public class WarmUp_exercise {
    public static void main(String[] args) {
        // Introduction
        System.out.println("Opvarmningsøvelse");
        System.out.println("Skriv et program i Java, som kan indlæse tal i en uendelig løkke, og vise gennemsnittet " +
                "af alle de indlæste tal efter hver indlæsning");
        System.out.print("\n");
        System.out.println("Hej med dig!");

        // Initial value
        System.out.print("Indtast et tal: ");
        Scanner input = new Scanner(System.in);
        int initialValue = input.nextInt();

        // Initializing the values
        int numberOfValues = 1;
        double sum = initialValue;

        // runAgain is true by default, until user no longer wants to run
        boolean runAgain = true;

        // While loop
        while (runAgain) {
            // The next value
            System.out.print("Indtast endnu et tal: ");
            int nextValue = input.nextInt();
            System.out.print("\n");

            // Equation
            numberOfValues++;
            sum += nextValue;
            double result = sum / numberOfValues;
            // Allowing decimals and trimming them
            DecimalFormat resultShowcase = new DecimalFormat("#.##");
            System.out.println("Det gennemsnitelige tal er: " + resultShowcase.format(result));

            // Asking the user to continue or stop (switch runAgain to false)
            System.out.print("Vil du forsætte? (y/n): ");
            // if statement
            if (input.next().equals("n")) {
                runAgain = false;
            }
        }
    }
}
