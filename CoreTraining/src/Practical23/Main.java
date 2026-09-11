package Practical23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Comparable: Sort students by marks
    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

// Comparator: Sort students by name
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 75));
        students.add(new Student(2, "Amit", 90));
        students.add(new Student(3, "Darshan", 80));

        // Using Comparable
        System.out.println("Sorting using Comparable (Marks):");
        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }

        // Using Comparator
        System.out.println("\nSorting using Comparator (Name):");
        students.sort(new NameComparator());

        for (Student s : students) {
            System.out.println(s);
        }
    }
}