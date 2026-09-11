package Practical22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Create a list
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("E");
        list.add("E");

        System.out.println("Original List:");
        System.out.println(list);

        // Remove duplicate values
        Set<String> set = new HashSet<>(list);

        System.out.println("List after removing duplicates:");
        System.out.println(set);
    }
}