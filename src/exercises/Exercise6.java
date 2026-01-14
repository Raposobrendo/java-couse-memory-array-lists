package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you input to each of 2 arrays? ");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];
        System.out.println("Digit values of array 1: ");
        for(int i = 0; i < array1.length; i++){
            System.out.printf("Number %d: ", i+1);
            array1[i] = sc.nextInt();
        }

        System.out.println("Digit values of array 2: ");
        for(int i = 0; i < array2.length; i++){
            System.out.printf("Number %d: ", i+1);
            array2[i] = sc.nextInt();
        }
        System.out.println("Values of array 3: ");
        for(int i = 0; i < array2.length; i++){
            array3[i] = array1[i] + array2[i];
            System.out.printf("Number %d: %d\n", i+1, array3[i]);
        }

        sc.close();
    }
}
