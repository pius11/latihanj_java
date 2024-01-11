import java.util.Scanner;

public class selectionsort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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

        selectionSort(myArray);

        System.out.println("Sorted array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
