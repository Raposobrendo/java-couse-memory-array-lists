package application;

import entities.ProductArray2;

import java.util.Locale;
import java.util.Scanner;

public class Array2 {
    static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int quantity;

        System.out.println("Select number of products and their prices");
        quantity = sc.nextInt();
        ProductArray2[] product = new ProductArray2[quantity];
        for(int i = 0; i < quantity; i++){
            System.out.printf("Product %d name: ", i+1);
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Product %d price : " ,i+1);
            double price = sc.nextDouble();
            product[i] = new ProductArray2(name, price);
        }

        double medium = 0.0;

        for(int i = 0; i < quantity; i++){
            medium += product[i].getPrice();
        }
        medium = medium/product.length;

        System.out.printf("Average price: %.2f", medium);





        sc.close();
    }
}
