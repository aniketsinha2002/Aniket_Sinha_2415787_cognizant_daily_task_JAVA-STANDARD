// Create a Java program that simulates a bank withdrawal process and throws an exception if the balance is insufficient.


import java.util.Scanner;

// Custom exception class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds! Your balance is only " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Main program
public class BankTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.00);  // Initial balance set to 1000

        try {
            System.out.println("Current balance: " + account.getBalance());
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            // Attempting withdrawal
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
