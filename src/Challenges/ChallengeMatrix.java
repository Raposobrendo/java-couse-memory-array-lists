package Challenges;

import java.util.Scanner;

public class ChallengeMatrix {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows the matrix will have? ");
        int n = sc.nextInt();
        System.out.print("How many columns the matrix will have? ");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Select a number to compare to the matrix: ");
        int chosenNumber = sc.nextInt();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == chosenNumber){
                    System.out.println("Position: " + i + ", " + j);
                    if(j > 0){
                        System.out.printf("Left: %d\n", mat[i][j-1]);
                    }
                    if(j < mat[i].length -1){
                        System.out.printf("Right: %d\n", mat[i][j+1]);
                    }
                    if(i > 0){
                        System.out.printf("Up: %d\n", mat[i-1][j]);
                    }
                    if(i < mat.length - 1){
                        System.out.printf("Down: %d\n", mat[i+1][j]);
                    }
                }
            }
        }




    }
}
