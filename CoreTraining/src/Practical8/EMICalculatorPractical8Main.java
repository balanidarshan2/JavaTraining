package Practical8;

import java.util.Scanner;

public class EMICalculatorPractical8Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double interestRate = sc.nextDouble();

        System.out.print("Enter Loan Tenure (months): ");
        int tenure = sc.nextInt();

        EMICalculatorPractical8 calculate = new EMICalculatorPractical8();

        calculate.principal = loanAmount;
        calculate.annualRate = interestRate;
        calculate.months = tenure;

        calculate.calculateEMI();

        sc.close();
    }
}