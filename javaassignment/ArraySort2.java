// sorting of array using our own methods
//using bubble sort algorithm
import java.util.Scanner;
class ArraySort2{
    //Ascending order
    public void SortAscending(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //Descending order
    public void SortDescending(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        ArraySort2 arraySort2 = new ArraySort2();
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
          System.out.println("Enter the order in which you want to sort the array :  ");
          System.out.println("\n 1> Ascending Order \n 2> Descending Order");
        int sortOption = scanner.nextInt();

         // Sort the array
        if (sortOption == 1) {
            arraySort2.SortAscending(arr, n); // Ascending order
        } else if (sortOption == 2) {
            arraySort2.SortDescending(arr, n); // Descending order
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