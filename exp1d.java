// Write a Java program to find and print the prime factors of a given number.

import java.util.*;

public class exp1d {
    public static void main(String[] args) {
        System.out.println("Name: Tushar Garg");
        System.out.println("Roll No: 2210997258");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Prime factors of " + num + " are: ");
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        sc.close();
    }
}