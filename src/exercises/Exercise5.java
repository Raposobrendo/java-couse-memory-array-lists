package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);;
        Scanner sc = new Scanner(System.in);

        int highestValue, positionHighest;

        System.out.print("How many numbers will you digit? ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            System.out.print("Digit a number: ");
            array[i] = sc.nextInt();
        }
        highestValue = array[0];
        positionHighest = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > highestValue){
                highestValue = array[i];
                positionHighest = i;
            }
        }

        System.out.printf("Highest value: %d\n", highestValue);
        System.out.printf("Position of highest value: %d", positionHighest);

        sc.close();
    }
}
