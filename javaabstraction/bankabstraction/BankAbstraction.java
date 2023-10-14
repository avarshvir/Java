package bankabstraction;
abstract class Bank{
    abstract double calculateInterest();
    abstract void displayInterestRate();

}
class SavingAccounts extends Bank{
    private double balance;
    private double interestRate;
    SavingAccounts(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }
    double calculateInterest(){
        return balance*(interestRate/100);
    }
    void displayInterestRate(){
        System.out.println("Interest is : "+ interestRate +"%");
    }
}
class FixedDeposit extends Bank{
    private double principal;
    private double interestRate;
    FixedDeposit(double principal, double interestRate){
        this.principal = principal;
        this.interestRate = interestRate;
    }
    double calculateInterest(){
        return principal*(interestRate/100);
    }
    void displayInterestRate(){
        System.out.println("Fixed Deposit interest rate is "+ interestRate + "%");
    }
}
class BankAbstraction{
    public static void main(String args[]){

    SavingAccounts savingAccounts = new SavingAccounts(1000,7);
    savingAccounts.displayInterestRate();
    System.out.println("Interest Earned in saving account is "+ savingAccounts.calculateInterest());
    
    FixedDeposit fixedDeposit = new FixedDeposit(5000,7);
    fixedDeposit.displayInterestRate();
    System.out.println("Interest Earned in fixed Deposit is "+ fixedDeposit.calculateInterest());
    }   
}