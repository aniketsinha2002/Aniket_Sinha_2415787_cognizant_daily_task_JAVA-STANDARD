// Write a program with a try, catch, and finally block to show that the finally block always executes.

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int result = 10 / 0;  
            System.out.println("This statement won't be executed.");
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: Division by zero error.");
        } finally {
            System.out.println("Inside finally block: This always executes.");
        }
        
        System.out.println("Program execution continues...");
    }
}
