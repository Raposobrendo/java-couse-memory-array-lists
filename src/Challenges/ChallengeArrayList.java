package Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ChallengeArrayList {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int employeesQuantity = sc.nextInt();

        List<ArrayListEmployees> employees = new ArrayList<>();

        for(int i = 0; i < employeesQuantity; i++){
            System.out.printf("Employee #%d\n", i+1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            for(ArrayListEmployees n : employees){
                while(id == n.getId()){
                    System.out.println("ID already exists, select another one: ");
                    id = sc.nextInt();
                }
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new ArrayListEmployees(id, name, salary));

        }




        sc.close();
    }
}
