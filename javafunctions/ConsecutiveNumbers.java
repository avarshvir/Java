import java.util.Scanner;
public class ConsecutiveNumbers{
    public int isConsecutive(int a, int b, int c){
        if(b == a+1 && b == c-1){
            System.out.print("Numbers are consecutives ");
        }
        else{
            System.out.print("Numbers are not cosecutive");
        }
        return 1;
    }

    public static void main(String args[]){
        ConsecutiveNumbers c_n = new ConsecutiveNumbers();
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 1st number :");
        a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        b = sc.nextInt();
        System.out.print("Enter 3rd number :");
        c = sc.nextInt();

        c_n.isConsecutive(a,b,c);
        
    }
    
}
