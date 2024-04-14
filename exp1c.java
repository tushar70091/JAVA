// Implement the factorial calculation using recursion instead of loops. Compare the performance and resource usage with the loop-based version.

import java.util.*;

public class exp1c {
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Name: Tushar Garg");
		System.out.println("Roll No: 2210997258");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of " + num + " is: " + factorial(num));
		sc.close();
	}
}