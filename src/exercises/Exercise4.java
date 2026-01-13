package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers will you digit? ");
        n = sc.nextInt();
        int[] array = new int[n];
        int evenCount = 0;
        for(int i = 0; i < array.length; i++){
            System.out.print("Digit a new number: ");
            int aux =  sc.nextInt();
            array[i] = aux;
            if(array[i]%2 == 0){
                evenCount++;
            }
        }

        System.out.print("Even numbers: ");
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.printf("%d  ", j);
            }
        }

        System.out.println();
        System.out.printf("Quantity of even numbers: %d", evenCount);

        sc.close();
    }
}
