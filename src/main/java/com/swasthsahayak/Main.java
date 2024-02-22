package com.swasthsahayak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        int choice;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to calculate its square root: ");
                    number = scanner.nextDouble();
                    System.out.println("Square root of " + number + " is: " + calculateSquareRoot(number));
                    break;
                case 2:
                    System.out.print("Enter a number to calculate its factorial: ");
                    number = scanner.nextDouble();
                    System.out.println("Factorial of " + (int) number + " is: " + calculateFactorial((int) number));
                    break;
                case 3:
                    System.out.print("Enter a number to calculate its natural logarithm: ");
                    number = scanner.nextDouble();
                    System.out.println("Natural logarithm of " + number + " is: " + calculateNaturalLog(number));
                    break;
                case 4:
                    System.out.print("Enter the base number: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power of " + exponent + " is: " + calculatePower(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
    }

    public static double calculateSquareRoot(double n) {
        return Math.sqrt(n);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static double calculateNaturalLog(double n) {
        return Math.log(n);
    }

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
