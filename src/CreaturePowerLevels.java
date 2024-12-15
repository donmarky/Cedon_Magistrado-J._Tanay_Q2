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
        int[] bubbleSortedArray = powerLevels.clone();
        bubbleSort(bubbleSortedArray);
        System.out.println("\nBubble Sort (Ascending):");
         displayArray(bubbleSortedArray);


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

    // Selection sort method
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the maximum element in the unsorted array
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
       // Swap the found maximum element with the first element
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
    // Method to display the array
    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    // Method to analyze power levels
    public static void analyzePowerLevels(int[] array) {
        int sumEven = 0;
        int sumOdd = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : array) {
            // Calculate sum of even and odd numbers
            if (value % 2 == 0) {
                sumEven += value;
            } else {
                sumOdd += value;
            }
            // Find minimum and maximum power levels
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        // Display analysis results
        System.out.println("\nAnalysis:");
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Minimum Power Level: " + min);
        System.out.println("Maximum Power Level: " + max);
        System.out.println("");
    }
}
