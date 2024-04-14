// Write a program that takes three integers as input representing the lengths of the sides of
// a triangle and determines whether the triangle is equilateral, isosceles, or scalene.
import java.util.Scanner;

public class exp3b {
    public static void main(String[] args) {
        System.out.println("Name: Tushar Garg");
        System.out.println("Roll No: 2210997258");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of the sides of the triangle: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
        sc.close();
    }
}
