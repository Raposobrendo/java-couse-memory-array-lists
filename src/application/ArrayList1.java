package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ArrayList1 {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);

        List<String> list = new ArrayList<>();

        list.add("Brendo");
        list.add("Nicolas");
        list.add("Luna");
        list.add("Ana");
        list.add("Crisélido");
        list.add("Astolfo");
        list.add("Bruno");
        list.add("Ahrmajinejad");
        list.add(2, "Juau");
        for(String i : list){
            System.out.println(i);
        }

        System.out.println("------------------------------");
        list.remove(5);
        list.removeIf(x -> x.charAt(0) == 'C');
        for(String i : list){
            System.out.println(i);
        }

        System.out.println("------------------------------");
        System.out.println("Index of Nicolas: " + list.indexOf("Nicolas"));
        System.out.println("Index of Claudenirson: " + list.indexOf("Claudenirson")); //In case of index not found, result will be -1

        System.out.println("------------------------------");
        List<String> filterInitialA = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        // or = list.stream().filter(x -> x.charAt(0).collection(Collectors.toList());
        for(String i : filterInitialA){
            System.out.println(i);
        }

        System.out.println("------------------------------");
        String firstA = list.stream().filter( x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("First name in list beginning with 'A': " + firstA);

    }
}
