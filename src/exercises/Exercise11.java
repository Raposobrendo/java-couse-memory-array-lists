package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double highest, lowest, mediumWoman = 0;
        int quantityMan = 0, quantityWoman= 0;

        System.out.print("How many people will be inserted? ");
        int n = sc.nextInt();
        double[] height = new double[n];
        char[] gender = new char[n];
        for(int i = 0; i < height.length; i++){
            System.out.printf("Height of person %d: ", i+1);
            height[i] = sc.nextDouble();
            System.out.printf("Gender of person %d: ", i+1);
            gender[i] = sc.next().charAt(0);
        }
        highest = height[0];
        lowest = height[0];

        for(double i : height){
            if(i > highest){
                highest = i;
            }
            if(i < lowest){
                lowest = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (gender[i] == 'm' || gender[i] == 'M') {
                quantityMan++;
            } else if (gender[i] == 'f' || gender[i] == 'F') {
                mediumWoman += height[i];
                quantityWoman++;
            }
        }

        mediumWoman = mediumWoman / quantityWoman;

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Medium height of woman: " + mediumWoman);
        System.out.println("Quantity of man: " + quantityMan);

        sc.close();
    }
}
