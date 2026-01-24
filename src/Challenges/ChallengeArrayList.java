package Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ChallengeArrayList {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id;
        boolean idTaken;

        System.out.print("How many employees will be registered? ");
        int employeesQuantity = sc.nextInt();

        List<ArrayListEmployees> employees = new ArrayList<>();

        for(int i = 0; i < employeesQuantity; i++){
            System.out.printf("Employee #%d\n", i+1);
            do {
                System.out.print("ID: ");
                id = sc.nextInt();
                idTaken = false;

                for (ArrayListEmployees n : employees) {
                    if (id == n.getId()) {
                        System.out.println("ID already exists, select another one.");
                        idTaken = true;
                        break;
                    }
                }
            } while (idTaken);
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
            System.out.println();
        }

        boolean idExists = false;
        System.out.println();
        System.out.print("Enter the employee ID that will have salary increase:  ");
        int idIncreaseSalary = sc.nextInt();
        for(ArrayListEmployees n : employees){
            if(idIncreaseSalary == n.getId()){
                System.out.print("Enter percentage: ");
                n.increaseSalary(sc.nextDouble());
                idExists = true;
                break;
            }
        }

        if (!idExists){
            System.out.println("This ID does no exist!");
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(ArrayListEmployees n : employees){
            System.out.println(n);
        }

        sc.close();
    }
}
