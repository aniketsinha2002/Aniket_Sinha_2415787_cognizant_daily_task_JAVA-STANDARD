// Write a method that throws a checked exception and handle it in the calling method using throws and try-catch.

class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (CustomCheckedException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    static void performOperation() throws CustomCheckedException {
        throw new CustomCheckedException("Custom checked exception occurred!");
    }
}

// Custom checked exception class
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
