import java.util.Scanner;

public class bubbleSorting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("masukan jumlah data yang ingin di input (max 20)");
        int jum = inp.nextInt();

        int arr[] = new int[jum];

        for (int i = 0; i < jum; i++) {
            System.out.println("masukan bilangan " + (i + 1));
            int bill = inp.nextInt();
            arr[i] = bill;
        }

        System.out.println("Array Sebelum Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array Setelah Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}