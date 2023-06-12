import java.util.Scanner;
class ArrayPrint{
    public static void main(String args[]){
        int n;
        System.out.print("Enter the size of array : ");
        
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        int [] a = new int[n];
    
        System.out.println("Enter the Value :-");
        
        for(int i = 0; i < n; i++){
            System.out.print("Enter value of a["+ i +"] : " );
            a[i] = scanner.nextInt();

        }

        System.out.println("---------------------------------------------");
        for(int j = 0; j < n; j++){
            System.out.println("Entered Values at position "+ (j+1 )+" is " +a[j]);
        }

        
    }
}