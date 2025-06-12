// Write a program with nested try-catch blocks and show how an inner block handles one exception and an outer block handles another.


public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {10, 20, 30};
        
            try {
                // Inner try block
                System.out.println("Performing division...");
                int result = 10 / 0; // This will cause ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inside inner catch block: Division by zero error.");
            }

            System.out.println("Accessing element at index 5...");
            System.out.println(numbers[5]); // This will cause ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside outer catch block: Array index out of bounds error.");
        } finally {
            System.out.println("Inside finally block: This always executes.");
        }

        System.out.println("Program execution continues...");
    }
}
