package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int n, age, countLessThan16 = 0;
        double height, mediumHeight = 0, percentageUnder16;

        System.out.print("How many people will be inserted? ");
        n = sc.nextInt();
        Ex3person[] array = new Ex3person[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Data of person %d\n", i+1);
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextInt();
            System.out.print("Height: ");
            height = sc.nextDouble();
            array[i] = new Ex3person(name, age, height);
            mediumHeight += height;
            if(age < 16){
                countLessThan16++;
            }
        }

        mediumHeight = mediumHeight/array.length;
        System.out.printf("Medium Height: %.2f\n", mediumHeight);
        percentageUnder16 = (double)(countLessThan16/array.length)*100;
        System.out.printf("People with age lesser than 16: %.2f %%\n", percentageUnder16);
        for(Ex3person p : array){
            if(p.isUnder16()){
                System.out.println(p.getName());
            }
        }

        sc.close();
    }
}
