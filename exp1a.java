// Write a Java program that prints all the prime numbers between 1 and 100.
// Implement this using both for and while loops.

public class exp1a {
    public static void main(String[] args) {
        System.out.println("Name: Tushar Garg");
        System.out.println("Roll No: 2210997258");
        System.out.println("Prime numbers between 1 and 100 (using for loop): ");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
        System.out.println("Prime numbers between 1 and 100 (using while loop): ");
        int a = 2;
        while (a <= 100) {
            boolean isPrime = true;
            int j = 2;
            while (j < a) {
                if (a % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) {
                System.out.println(a);
            }
            a++;
        }
    }
}
