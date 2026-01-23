package application;

import java.util.Locale;
import java.util.Scanner;

public class Array1{
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        double height = 0.0;

        System.out.println("Select how many people to het their height: ");
        n = sc.nextInt();
        double[] array = new double[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            height += array[i];
        }
        height = height /array.length;

        System.out.printf("Average heigth: %.2f\n", height);

        sc.close();
    }

}
