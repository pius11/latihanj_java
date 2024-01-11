import java.util.Scanner;

public class InsertionShort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] myArray = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        scanner.close();

        insertionSort(myArray);

        System.out.println("Sorted array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
