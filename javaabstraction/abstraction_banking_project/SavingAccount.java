package abstraction_banking_project; 
class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }
}