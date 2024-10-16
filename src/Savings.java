class Savings extends BankAccount {
    private double intRate;

    public Savings(double initialBalance, double interestRate) {
        super(initialBalance);
        intRate = interestRate;
    }

    // Add interest to the balance
    public void addInterest() {
        balance += balance * intRate;
    }

    @Override
    public void display() {
        System.out.printf("Savings account balance = $%.2f%n", balance);
    }
}
