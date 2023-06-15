import java.util.Scanner;
class Array2DSumModified{
    public static void main(String args[]){
        int row1,column1;
        int row2,column2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Row of 1st matrix : ");
        row1 = scanner.nextInt();
        System.out.print("Enter Column of 1st matrix : ");
        column1 = scanner.nextInt();
        
        System.out.print("Enter Row of 2nd matrix : ");
        row2 = scanner.nextInt();
        System.out.print("Enter Column of 2nd matrix : ");
        column2 = scanner.nextInt();

        int [][]matrix1 = new int[row1][column1];
        int [][]matrix2 = new int[row2][column2];

        if(row1 != row2 || column1 != column2){
            System.out.print("Addition of matrix not possible ");
        }
        else {
            //1st Matrix
            System.out.println("Enter 1st Matrix :");
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < column1; j++){
                    matrix1[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Your 1st Matrix :");
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < column1; j++){
                    System.out.print(matrix1[i][j] +" ");
                }
                System.out.println();
            }
            
            //2nd Matrix
            System.out.println("Enter 2nd Matrix :");
            for(int i = 0; i < row2; i++){
                for(int j = 0; j < column2; j++){
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Your 2nd Matrix :");
            for(int i = 0; i < row2; i++){
                for(int j = 0; j < column2; j++){
                    System.out.print(matrix2[i][j] +" ");
                }
                System.out.println();
            }

            //Sum
            System.out.println("Sum is ");
            int [][] sum = new int[row1][column1];
            for(int i = 0; i < row1 || i < row2; i++){
                for(int j = 0; j < column1 || j < column2; j++){
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                    System.out.print(sum[i][j] +" "); 
                }
                System.out.println();
            
            }
        }
    }
}