package abstraction_banking_project;
public abstract class BankAccount{
    private String accountNumber;
    private String accountHolder;
    protected double balance;
    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void calculateInterest();

    public void displayAccountInfo(){
        System.out.println("account Number "+ accountNumber);
        System.out.println("account Holder "+ accountHolder);
        System.out.println("balance "+ balance);
        }
}