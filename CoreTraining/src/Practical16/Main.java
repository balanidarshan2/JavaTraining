package Practical16;

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum of two numbers: " + c.add(2,3));
        System.out.println("Sum of three numbers: " + c.add(+ 2,3,4));

        Animal animal = new Dog();
        animal.sound();
    }
}
