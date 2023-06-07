import java.util.Scanner;
class SplitFloatNumber
{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        float a;
        System.out.println("Enter the Float Number");
        a = scanner.nextFloat();
        System.out.println("Value of Float Number : "+ a); //+ a= concatination

        int b = (int)a;
        System.out.println("Integer Value : "+ b);

        float c = a-b;
        System.out.println("Decimal Value : "+c);

    }
}