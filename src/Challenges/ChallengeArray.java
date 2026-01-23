package Challenges;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeArray {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, room;
        String name, email;

        ChallengeArrayEntity[] rooms = new ChallengeArrayEntity[10];
        System.out.print("How many rooms will be rented? (ten rooms available, 0 to 9): ");
        n = sc.nextInt();
        while(n < 1 || n > 10){
            System.out.print("Please, select a number from 1 to 10");
            n = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.printf("Rent #%d\n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();
            rooms[room] = new ChallengeArrayEntity(name, email, room);
        }

        for (ChallengeArrayEntity challengeEntity : rooms) {
            if (challengeEntity != null)
                System.out.println(challengeEntity);
        }

        sc.close();
    }
}
