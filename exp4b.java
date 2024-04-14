// // Write a program that takes an array of integers as input and removes duplicate elements, returning an array with only unique elements.

import java.util.Arrays;
import java.util.Scanner;

public class exp4b {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);

        int uniqueCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueCount++;
            }
        }

        uniqueCount++;

        int[] uniqueArr = new int[uniqueCount];
        uniqueArr[0] = arr[0];
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArr[index] = arr[i];
                index++;
            }
        }

        return uniqueArr;
    }

    public static void main(String[] args) {
        System.out.println("Name: Tushar Garg");
        System.out.println("Roll No: 2210997258");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        int[] uniqueArr = removeDuplicates(array);
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArr));
    }
}
