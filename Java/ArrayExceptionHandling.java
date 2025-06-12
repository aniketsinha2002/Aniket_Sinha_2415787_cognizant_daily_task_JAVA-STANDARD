// Write a program that accepts an array and prints an element at a specific index, handling ArrayIndexOutOfBoundsException.

import java.util.Scanner;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking array input
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Taking index input
            System.out.print("Enter index to retrieve element: ");
            int index = scanner.nextInt();

            // Accessing element
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds! Please enter a valid index.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}
