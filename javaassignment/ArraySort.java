// sorting of array using inbuilt classes and objects
import java.util.Scanner;
import java.util.Arrays;
class ArraySort{
    public static void main(String args[]){
        int n;
        System.out.print("Enter the size of array : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        // array input
        for(int i = 0; i < n; i++){
            System.out.print("Enter "+ (i+1) + " element : ");
            arr[i] = scanner.nextInt();
        }
        // array unsorted output
        System.out.println("Unsorted array ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
            System.out.println(" ");
          System.out.println("Enter the order in which you want to sort the array ");
          System.out.println("\n 1> Ascending Order \n 2> Descending Order");
        int sortOption = scanner.nextInt();

        // Sort the array
        if (sortOption == 1) {
            Arrays.sort(arr); // Ascending order
        } else if (sortOption == 2) {
            Arrays.sort(arr); // Ascending order
            // Reverse the array to get descending order
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
        } else {
            System.out.println("Invalid sorting option. Please choose 1 for ascending or 2 for descending.");
            return;
        }

        // Print the sorted array
        System.out.print("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}