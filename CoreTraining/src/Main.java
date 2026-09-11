import java.math.BigDecimal;

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

        // Practical 9: Create a practical to compare two variables of Wrapper class using Wrapper classes.

         {
            Integer num1 = 50;
            Integer num2 = 30;

            int result = num2.compareTo(num1);

            if (result == 0) {
                System.out.println("Both numbers are equal.");
            } else if (result > 0) {
                System.out.println("num1 is greater than num2.");
            } else {
                System.out.println("num1 is smaller than num2.");
            }
        }

        // Practical 10: Create programs of all the string methods like charAt(), concat(), equals() etc.

        {
            String str1 = "Hello Java";
            String str2 = "Hello World";
            String str3 = "hello java";

            // 1. charAt()
            System.out.println("charAt(1): " + str1.charAt(1));

            // 2. concat()
            System.out.println("concat(): " + str1.concat(" Programming"));

            // 3. equals()
            System.out.println("equals(): " + str1.equals(str3));

            // 4. equalsIgnoreCase()
            System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str3));

            // 5. length()
            System.out.println("length(): " + str1.length());

            // 6. toUpperCase()
            System.out.println("toUpperCase(): " + str1.toUpperCase());

            // 7. toLowerCase()
            System.out.println("toLowerCase(): " + str1.toLowerCase());

            // 8. substring()
            System.out.println("substring(): " + str1.substring(6));

            // 9. contains()
            System.out.println("contains(): " + str1.contains("Java"));

            // 10. startsWith()
            System.out.println("startsWith(): " + str1.startsWith("Hello"));

            // 11. endsWith()
            System.out.println("endsWith(): " + str1.endsWith("Java"));

            // 12. indexOf()
            System.out.println("indexOf(): " + str1.indexOf("Java"));

            // 13. lastIndexOf()
            System.out.println("lastIndexOf(): " + str1.lastIndexOf("a"));

            // 14. replace()
            System.out.println("replace(): " + str1.replace("Java", "World"));

            // 15. trim()
            String str4 = "   Hello Java   ";
            System.out.println("trim(): " + str4.trim());

            // 16. isEmpty()
            String str5 = "";
            System.out.println("isEmpty(): " + str5.isEmpty());

            // 17. compareTo()
            System.out.println("compareTo(): " + str2.compareTo(str1));

            // 18. split()
            String fruits = "Apple,Banana,Mango";
            String[] result1 = fruits.split(",");

            System.out.println("split():");
            for (String fruit : result1) {
                System.out.println(fruit);
            }
        }

        //Practical 10 (A): Create programs to evaluate differences between == and .equals in String, Integer, and BigDecimal?
        {
            // 1. String
            String str1 = new String("Hello");
            String str2 = new String("Hello");


            System.out.println("str1 == str2       : " + (str1 == str2));
            System.out.println("str1.equals(str2)  : " + str1.equals(str2));


            // 2. Integer
            Integer num1 = 100;
            Integer num2 = 100;


            System.out.println("num1 == num2       : " + (num1 == num2));
            System.out.println("num1.equals(num2)  : " + num1.equals(num2));


            // 3. BigDecimal
            BigDecimal value1 = new BigDecimal("10.0");
            BigDecimal value2 = new BigDecimal("10.00");


            System.out.println("value1 == value2      : " + (value1 == value2));
            System.out.println("value1.equals(value2) : " + value1.equals(value2));
            System.out.println("value1.compareTo(value2): " + value1.compareTo(value2));

        }

    }
}
