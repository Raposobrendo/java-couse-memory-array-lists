package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will you input? ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];
        for(int i = 0; i < names.length; i++){
            System.out.printf("Data of person %d: \n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
        }

        int oldestAge = ages[0];
        String oldestName = names[0];

        for(int i = 0; i < names.length; i++){
            if(ages[i] > oldestAge){
                oldestName = names[i];
            }
        }

        System.out.println("Oldest person: " + oldestName);

        sc.close();
    }
}
