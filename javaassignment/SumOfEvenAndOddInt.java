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