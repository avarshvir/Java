/* Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
Test case
How many numbers you want to enter - 5
Enter number at 1 position - 2
Enter number at 2 position - 3
Enter number at 3 position - 1
Enter number at 4 position - 4
Enter number at 5 position - 8
Sum of even number is 14
Sum of odd number is 4*/
import java.util.Scanner;
class SumOfEvenAndOddInt{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("How many numbers you want to enter - ");
        int input = scanner.nextInt();

        for(int i = 1; i <= input; i++){
            System.out.print("Enter number at" + i + " position - ");
            int number = scanner.nextInt();

            if(number%2 == 0){
                evenSum = evenSum + number;
            }
            else{
                oddSum = oddSum + number;
            }

        }
        
            System.out.println("Sum of Even Number - " + evenSum);
            System.out.println("Sum of Odd Number - " + oddSum);
            
    }
}