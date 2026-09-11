package Practical21;
import java.util.HashSet;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println("Set values:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Darshan");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        System.out.println("\nMap values:");

        for (Integer key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}