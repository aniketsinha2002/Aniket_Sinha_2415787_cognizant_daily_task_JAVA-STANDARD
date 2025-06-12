// Write a program that demonstrates exception chaining by throwing one exception and wrapping it inside another.

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }

    static void throwException() throws CustomException {
        try {
            int result = 10 / 0; // Causes ArithmeticException
        } catch (ArithmeticException e) {
            throw new CustomException("Custom exception triggered", e);
        }
    }
}

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
