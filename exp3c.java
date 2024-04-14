// Write a program that converts an amount in one currency to another based on the user's choice. The program should prompt the user to enter the amount, the source currency, and the target currency (e.g., USD to EUR). Use a switch-case statement to handle different currency conversions.

import java.util.*;

public class exp3c {

    public static double convertCurrency(double amount, String source, String target) {
        double convertedAmount = 0.0;
        switch (source) {
            case "USD":
                switch (target) {
                    case "EUR":
                        convertedAmount = amount * 0.8;
                        break;
                    case "GBP":
                        convertedAmount = amount * 0.7;
                        break;
                    case "INR":
                        convertedAmount = amount * 73.52;
                        break;
                    default:
                        System.out.println("Invalid target currency.");
                        break;
                }
                break;
            case "EUR":
                switch (target) {
                    case "USD":
                        convertedAmount = amount * 1.2;
                        break;
                    case "GBP":
                        convertedAmount = amount * 0.9;
                        break;
                    case "INR":
                        convertedAmount = amount * 81.52;
                        break;
                    default:
                        System.out.println("Invalid target currency.");
                        break;
                }
                break;
            case "GBP":
                switch (target) {
                    case "USD":
                        convertedAmount = amount * 1.4;
                        break;
                    case "EUR":
                        convertedAmount = amount * 1.1;
                        break;
                    case "INR":
                        convertedAmount = amount * 87.52;
                        break;
                    default:
                        System.out.println("Invalid target currency.");
                        break;
                }
                break;
            case "INR":
                switch (target) {
                    case "USD":
                        convertedAmount = amount * 0.013;
                        break;
                    case "EUR":
                        convertedAmount = amount * 0.012;
                        break;
                    case "GBP":
                        convertedAmount = amount * 0.011;
                        break;
                    default:
                        System.out.println("Invalid target currency.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid source currency.");
                break;
        }
        return convertedAmount;
    }

    public static void main(String[] args) {
        System.out.println("Name: Tushar Garg");
        System.out.println("Roll No: 2210997258");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the source currency: ");
        String source = scanner.next();
        System.out.print("Enter the target currency: ");
        String target = scanner.next();

        double convertedAmount = convertCurrency(amount, source, target);
        System.out.println("Converted amount: " + convertedAmount);
        scanner.close();
    }
}
