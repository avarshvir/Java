import java.util.Scanner;
class AddAmount{
    int initialAmount = 50;
    // constructor without parameters ---------------------------(1)
    AddAmount(){
        System.out.println("--------------------------------------------------");
        System.out.println("No money will be added to the piggy bank");
    }
    // constructor with parameter ---------------------------------(2)
    AddAmount(int addedAmount){
        int finalAmount = initialAmount + addedAmount;
        System.out.println("Final Amount : "+ finalAmount);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // calling constructor without parameter -------------------(1)
        AddAmount addAmount = new AddAmount();
        int n;
        do{
            System.out.println("Enter Ammount to add : ");
            n = sc.nextInt();
            if(n > 0){
                // calling constructor with parameter ------------------------(2)
                AddAmount addAmount2 = new AddAmount(n);
            }
            else{
                System.out.println("You entered 0 or negative value");
            }
        }while(n > 0);
        
        
        
    }
}