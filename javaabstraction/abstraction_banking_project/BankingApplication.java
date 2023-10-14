package abstraction_banking_project;
public class BankingApplication {
    public static void main(String[] args) {
        // Example usage of the abstract banking classes
  //      SavingsAccount savingsAccount = new SavingsAccount("SA123456", "John Doe", 5000.0, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA789012", "Jane Smith", 2500.0, 1000.0);

       /* savingsAccount.displayAccountInfo();
        savingsAccount.deposit(1000.0);
        savingsAccount.calculateInterest();
        savingsAccount.displayAccountInfo();
*/
        checkingAccount.displayAccountInfo();
        checkingAccount.withdraw(3000.0);
        checkingAccount.displayAccountInfo();
    }
}