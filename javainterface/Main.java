import java.util.Scanner;

interface ArithmeticCalculator {
    public int calculate(int a, int b);
}

class Adder implements ArithmeticCalculator {
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Subtractor implements ArithmeticCalculator {
    public int calculate(int a, int b) {
        return a - b;  
    }
}

class Multiplier implements ArithmeticCalculator {
    public int calculate(int a, int b) {
        return a * b;
    }
}

class Divider implements ArithmeticCalculator {
    public int calculate(int a, int b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder(); 
        ArithmeticCalculator subtractor = new Subtractor();
        ArithmeticCalculator multiplier = new Multiplier(); 
        ArithmeticCalculator divider = new Divider();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + adder.calculate(a, b)); 
        System.out.println("Subtraction = " + subtractor.calculate(a, b));
        System.out.println("Multiplication = " + multiplier.calculate(a, b));
        System.out.println("Division = " + divider.calculate(a, b));
        
        sc.close();
    }
}