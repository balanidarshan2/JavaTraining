package Practical11;

public class Practical11Child extends Practical11Parent {

    int number = 100;

    void display() {

        System.out.println("This is parent class number: " + super.number);
        System.out.println("This is child class number: " + this.number);

        this.show();
        super.display();
    }

    void show() {
        System.out.println("Child class method");
    }
}
