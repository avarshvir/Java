import java.util.Scanner;
class AdditionOfThreeVariable
{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in); 
        float a,b,c;

        //taking input of a
        System.out.println("Enter the Float Value of a : ");
        a = scanner.nextFloat();
 
        //taking input of b
        System.out.println("Enter the Float Value of b : ");
        b = scanner.nextFloat();

        //taking input of c
        System.out.println("Enter the Float Value of c : ");
        c = scanner.nextFloat();

        //Output in integer form
        int d = (int)(a+b+c);
        System.out.println("Value of 'd' in form of integer : " +d);

        //Output in double form
        float e = a+b+c;
        System.out.println("Value of 'e' in form of double : " +e);

        

    }
}