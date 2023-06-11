import java.util.Scanner;
public class Pallidrome {
    public static void main(String[] args) {
        int number, reverseNumber = 0, remainder;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = scanner.nextInt();
        int originalNumber = number;
        while (number != 0) {
            remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        if (originalNumber == reverseNumber)
            System.out.println(originalNumber + " is a pallidrome.");
        else
            System.out.println(originalNumber + " is not a pallidrome.");
    }
}