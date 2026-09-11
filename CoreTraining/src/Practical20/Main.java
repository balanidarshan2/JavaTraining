package Practical20;

import java.util.ArrayList;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Add String values
        list.add("Hello");
        list.add("World");
        list.add("Darshan");

        //Using for Each
        System.out.println();
        System.out.println("Using For Each: ");
        list.forEach(System.out::println);


        //Using Iterator
        System.out.println();
        System.out.println("Using Iterator: ");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        //Using For loop
        System.out.println();
        System.out.println("Using for loop: ");
        for(String item : list){
            System.out.println(item);
        }
    }
}