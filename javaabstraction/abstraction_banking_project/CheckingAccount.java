package abstraction_banking_project;
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public void calculateInterest() {
        // Checking accounts typically don't earn interest, so this method can be left empty.
    }
}