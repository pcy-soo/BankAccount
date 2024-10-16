class Checking extends BankAccount {

    public Checking(double initialBalance) {
        super(initialBalance);
    }

    // Writes a check, which includes a $1 service fee
    public void writeACheck(double amount) {
        withdraw(amount + 1);
    }

    // Implement the display method to show account type and balance
    @Override
    public void display() {
        System.out.printf("Checking account balance = $%.2f%n", balance);
    }
}
