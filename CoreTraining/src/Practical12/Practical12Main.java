package Practical12;

public class Practical12Main {

    // Static variable
    static int number = 10;

    // Static block
    static {
        System.out.println("Static block executed.");
        number = 20;
    }

    // Static method
    static void display() {
        System.out.println("Static method executed.");
        System.out.println("Number = " + number);
    }

    public static void main(String[] args) {

        System.out.println("Main method executed.");
        // Calling static method
        display();
    }
}
