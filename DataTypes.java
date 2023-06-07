import java.util.Scanner;
class DataTypes{
    public static void main(String arg[]){
        int a;
        float b;
        double c;
        char d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Integer Value : ");
        a=scanner.nextInt();
        System.out.println("Value of int a : "+ a);

        System.out.println("Enter Float Value : ");
        b=scanner.nextFloat();
        System.out.println("Value of float b : " + b);

        System.out.println("Enter Double Value : ");
        c=scanner.nextDouble();
        System.out.println("value of double c : "+ c);

        System.out.println("Enter Character Value : ");
        d=scanner.next().charAt(0);
        System.out.println("Character d : "+ d);
      }
} 