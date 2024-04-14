// Write a Java program to print Pascal's Triangle of n rows.Use nested loops to calculate the values.
public class exp1b {
    public static void main(String[] args) {
        System.out.println("Name: Tushar Garg");
        System.out.println("Roll No: 2210997258");
        int n = 5;
        for(int i = 0; i < n; i++) {
            int num = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}