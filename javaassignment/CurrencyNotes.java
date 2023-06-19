import java.util.Scanner;
public class CurrencyNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of currency denominations : ");
        int size = scanner.nextInt();
        int[] denominations = new int[size];

        System.out.println("Enter the currency denominations:");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.println("Enter the amount you want to pay:");
        int amount = scanner.nextInt();

        // Sort the denominations
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (denominations[j] > denominations[j + 1]) {
                    int temp = denominations[j];
                    denominations[j] = denominations[j + 1];
                    denominations[j + 1] = temp;
                }
            }
        }

        int[] notesCount = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            if (amount >= denominations[i]) {
                notesCount[i] = amount / denominations[i];
                amount %= denominations[i];
            }
        }

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");

        for (int i = size - 1; i >= 0; i--) {
            if (notesCount[i] > 0) {
                System.out.println(denominations[i] + " : " + notesCount[i]);
            }
        }
    }
}
