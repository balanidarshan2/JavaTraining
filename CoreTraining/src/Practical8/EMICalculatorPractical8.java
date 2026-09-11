package Practical8;

class EMICalculatorPractical8 {

    // Practical 8: Apply EMI Calculator in Java - Java program to calculate EMI using Class, Object, Variables, Operators, and Datatypes.

    // Variables
    double principal;
    double annualRate;
    int months;

    // Method to calculate EMI
    void calculateEMI() {

        // Convert annual interest rate to monthly rate
        double monthlyRate = annualRate / 12 / 100;

        // EMI formula
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Monthly EMI = ₹" + emi);
    }
}