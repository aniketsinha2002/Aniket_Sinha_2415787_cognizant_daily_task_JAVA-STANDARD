// Activity: Create a base class Payment with method payAmount(). Extend it into CreditCardPayment, UPIPayment, and CashPayment. Override payAmount() to show different messages. Call the method using a Payment reference.


// Base class
class Payment {
    void payAmount() {
        System.out.println("Processing payment...");
    }
}

// Derived classes
class CreditCardPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Payment made via Credit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Payment made via UPI.");
    }
}

class CashPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Payment made in Cash.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Payment reference
        Payment payment;

        payment = new CreditCardPayment();
        payment.payAmount();

        payment = new UPIPayment();
        payment.payAmount();

        payment = new CashPayment();
        payment.payAmount();
    }
}
