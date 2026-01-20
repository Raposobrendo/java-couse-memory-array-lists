package application;

import java.util.Locale;

public class ForEach {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);

        String[] names = new String[] {"Brendo", "Nicolas", "Luna"};

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("--------------------------------------");

        for(String obj : names){
            System.out.println(obj);
        }
    }
}
