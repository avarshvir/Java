import java.util.Scanner;
class SmallNumberFunction{
    public void smallNumber(float firstNo, float secondNo, float thirdNo){
        if(firstNo < secondNo && firstNo < thirdNo){
            System.out.println("First no. is smallest with value : "+ firstNo);
        }
        else if(secondNo < firstNo && secondNo < firstNo){
            System.out.println("Second no. is smallest with value : "+ secondNo);
        }
        else{
            System.out.println("Third no. is smallest with value : "+ thirdNo);
        }

    }
    public static void main(String args[]){
        SmallNumberFunction smallnumberfunction = new SmallNumberFunction();
        float f_no,s_no,t_no;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        f_no = scanner.nextFloat();
        System.out.print("Enter second number : ");
        s_no = scanner.nextFloat();
        System.out.print("Enter third number : ");
        t_no = scanner.nextFloat();
        smallnumberfunction.smallNumber(f_no,s_no,t_no);
    }
}