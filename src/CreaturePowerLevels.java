import java.util.Scanner;

public class CreaturePowerLevels {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] powerLevels = new int[10];

        // Input the power levels
        System.out.println("Enter 10 power levels of creatures:");
        for (int i = 0; i < 10; i++) {
            powerLevels[i] = scanner.nextInt();
        }

        // Bubble sort implementation (ascending order)
        bubbleSort(powerLevels);
        System.out.println("\nBubble Sort (Ascending):");
        displayArray(powerLevels);

        // Selection sort implementation (descending order)
        selectionSort(powerLevels);
        System.out.println("\nSelection Sort (Descending):");
        displayArray(powerLevels);

        // Calculate and display analysis
        analyzePowerLevels(powerLevels);
    }

    // Bubble sort method
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    
}