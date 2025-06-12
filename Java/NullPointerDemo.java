// Create a Java program to handle NullPointerException when trying to access the length of a null string.

public class NullPointerDemo {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("Length of the string: " + str.length()); // Causes NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Trying to access length of a null string.");
        }
    }
}
