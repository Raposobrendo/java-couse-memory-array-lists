package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;

        System.out.print("How many numbers you will input? ");
        n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Input number %d: ", i+1);
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(array[i] < 0){
                System.out.println(array[i]);
            }
        }

        sc.close();
    }
}
