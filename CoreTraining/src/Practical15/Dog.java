package Practical15;

public class Dog extends Animal implements Guard, Pet {

    public void bark() {
        System.out.println("Dog Barks");
    }

    public void guard() {
        System.out.println("Dog Guards");
    }

    public void play() {
        System.out.println("Dog Plays");
    }
}
