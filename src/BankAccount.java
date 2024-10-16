abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            balance = 0;
        } else {
            balance = initialBalance;
        }
    }

    // To add amount to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    //Subtract amount from the balance
    public void withdraw(double amount) {
        if (amount > balance) {
            balance = 0;
        } else {
            balance -= amount;
        }
    }

    public abstract void display();
}
