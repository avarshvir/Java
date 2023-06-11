import java.util.Scanner;
class ReverseNumberAndAverage{
    public void reverseNumber(int number){
        int reverse = 0;
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reverse of is "  + reverse);
    }
    public double findAverage(int number) {
        int sum = 0;
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            count++;
            number /= 10;
        }
        double average = (double) sum / count;
        
        return average;
    }
    
    public static void main(String args[]){
        ReverseNumberAndAverage rna = new ReverseNumberAndAverage();
       // ReverseNumberAndAverage fa = new ReverseNumberAndAverage();        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse : ");
        int number;
        number = sc.nextInt();
        
        rna.reverseNumber(number);
        double average = rna.findAverage(number);

        System.out.println("Average of Reversed Number: " + average);

    }
}

/*
I see. There are a few issues with the code you provided. First, the `reverseNumber` and `findAverage` methods are not static, so you cannot call them from the main method without creating an instance of the `ReverseNumberAndAverage` class. Second, you are calling the non-static methods as if they were static methods. Finally, you are not calling the methods that you have defined in your class.

Here is a corrected version of your code:

```java*//*
import java.util.Scanner;

public class ReverseNumberAndAverage {
    public void reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reverse of " + number + " is " + reverse);
    }

    public double findAverage(int number) {
        int sum = 0;
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            count++;
            number /= 10;
        }
        double average = (double) sum / count;

        return average;
    }

    public static void main(String args[]) {
        ReverseNumberAndAverage rna = new ReverseNumberAndAverage();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse : ");
        int number = sc.nextInt();

        rna.reverseNumber(number);
        double average = rna.findAverage(number);

        System.out.println("Average of Reversed Number: " + average);
    }
}*/
/*

I hope this helps! Let me know if you have any other questions.

Source: Conversation with Bing, 10/6/2023(1) Java Program - Reverse a Number - Tutorial Kart. https://www.tutorialkart.com/java/java-reverse-number/ Accessed 10/6/2023.
(2) Java Program to Reverse a Number and find the Sum of its Digits Using .... https://www.geeksforgeeks.org/java-program-to-reverse-a-number-and-find-the-sum-of-its-digits-using-do-while-loop/ Accessed 10/6/2023.
(3) Reverse a Number in Java | Baeldung. https://www.baeldung.com/java-reverse-number Accessed 10/6/2023.
(4) why does my code not giving me reverse number accurately. https://stackoverflow.com/questions/63877049/why-does-my-code-not-giving-me-reverse-number-accurately Accessed 10/6/2023.
(5) How to Reverse a Number in Java - Javatpoint. https://www.javatpoint.com/how-to-reverse-a-number-in-java Accessed 10/6/2023.*/