package Practical18;

public class Main {

    // Method using throws
    static void checkAge(int age) throws Exception {

        // Using throw
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {

        try {
            // Calling method that may throw an exception
            checkAge(15);
        }
        catch (Exception e) {
            // Handling exception
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            // Always executes
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
