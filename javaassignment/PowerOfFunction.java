/*Write a function to calculate the power of a functions
Test Case
Enter the base number 2
Enter the exponent number 3
Result is 8
Test Case 2
Enter base number 3
Enter the exponent number 5
Result is 243*/
import java.util.Scanner;
class PowerOfFunction{

    public int powerFunction(int base, int exp){
        int result = 1;
        for(int i = 1; i <= exp; i++){
            result = result * base;
        }
        System.out.println(base + "^" + exp + " = " + result); 
        return 1;
    }


    public static void main(String args[]){
        int base;
        int exp;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter base Value : ");
        base = scanner.nextInt();
        
        System.out.println("Enter Exponetial Value or Power : ");
        exp = scanner.nextInt();

        PowerOfFunction p_f = new PowerOfFunction();

        p_f.powerFunction(base, exp);

}
}
