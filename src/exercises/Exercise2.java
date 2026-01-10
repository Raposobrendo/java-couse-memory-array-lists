package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        double sum = 0, medium;

        System.out.print("How many numbers will you enter? ");
        n = sc.nextInt();
        Double[] array = new Double[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter a number: ");
            array[i] = sc.nextDouble();
            sum += array[i];
        }

        System.out.print("Values: ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.2f  ", array[i]);
        }
        System.out.printf("\nSum: %.2f\n", sum);
        medium = sum/ array.length;
        System.out.printf("Medium: %.2f", medium);


        sc.close();
    }
}
