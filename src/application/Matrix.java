package application;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        int negativeNumbers = 0;

        System.out.print("Select the order of a matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] < 0){
                    negativeNumbers++;
                }
            }
        }

        System.out.println("Matrix: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        System.out.println("Main diagonal numbers: ");
        for(int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][i] + "  ");
        }

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Negative numbers: " + negativeNumbers);


    }
}
