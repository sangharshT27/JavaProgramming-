
package ExceptionHandlingLabtask;


class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient funds in the account");
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful.");
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        double withdrawalAmount = 1500.0;

        try {
            account.withdraw(withdrawalAmount);
            System.out.println("New balance: $" + account.getBalance());
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Current balance: $" + account.getBalance());
        }
    }
}
