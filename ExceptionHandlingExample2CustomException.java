class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


public class ExceptionHandlingExample2CustomException {
    public static void main(String[] args) {
        try {
            withdraw(500, 300);
            withdraw(500, 600);
        } catch (InsufficientFundsException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }


    public static void withdraw(int balance, int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
        }
        System.out.println("Withdrawal successful!");

    }
}
