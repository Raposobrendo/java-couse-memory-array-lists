package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ArrayList1 {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);

        List<String> list = new ArrayList<>();

        list.add("Brendo");
        list.add("Nicolas");
        list.add("Luna");
        list.add("Ana");

        System.out.println(list);

        for(String i : list){
            System.out.println(i);
        }



    }
}
