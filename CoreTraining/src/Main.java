//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    int a, b;

    // Default constructor
    Main() {
        a = 10;
        b = 20;
    }

    // Parameterized constructor
    Main(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        // Practical 1: Write a program to print “Hello world”.
        System.out.println("Hello World");


        // Practical 2: Write a program to demonstrate the use of if / else statements. (E.g Define an 'age' variable and check your age).
        int age = 21;

        if (age >= 18){
            System.out.println("You are an adult");
        } else {
            System.out.println("You're not an adult");
        }


        // Practical 3: Write a program to find the current month name from the given number of the switch case.
        int month = 9;

        switch (month) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }


        // Practical 4: Print 1 to 10 number using while loop and do while loop

        // While loop
        System.out.println("Using while loop:");

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Do-while loop
        System.out.println("Using do-while loop:");

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);


        // Practical 5: Star pattern

        for (int k = 1; k <=5; k++){
            for(int l = 1; l <= k; l++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Practical 6: Write a program to demonstrate the example of a break/Continue statement (E.g. Use the loop for 10 numbers and stop the execution after 7 numbers and skip any number).

        for (int m = 1; m <= 10; m++) {

            // Skip number 5
            if (m == 5) {
                continue;
            }

            // Stop execution after 7
            if (m == 8) {
                break;
            }

            System.out.println(m);
        }


        // Practical 7: Write a program to demonstrate the example of constructor and Parameterized constructor (E.g. Pass two integer parameters and apply any mathematical formula).

        // Using default constructor
        Main obj1 = new Main();
        obj1.display();

        // Using parameterized constructor
        Main obj2 = new Main(30, 40);
        obj2.display();


    }
}


