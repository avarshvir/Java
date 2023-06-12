import java.util.Scanner;
class Array2D{

    public static void main(String args[]){
        int row,column;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of row : ");
        row = scanner.nextInt();

        System.out.print("Enter the size of column : ");
        column = scanner.nextInt();

        int [][] a = new int[row][column];
        int [][] b = new int[row][column];
        
        // 1st Matrix
        System.out.println("Enter 1st Matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your 1st Matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println(" ");
        }

        // 2nd Matrix
        System.out.println("Enter 2nd Matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                b[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your 2nd Matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println(" ");
        }

        //Sum
        System.out.println("Sum of Matrix is : ");
        int [][] sum = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        }

        }
}