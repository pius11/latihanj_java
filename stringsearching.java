import java.util.Scanner;

public class stringsearching {
    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;  // Mengembalikan indeks elemen jika ditemukan
            }
        }
        return -1;  // Mengembalikan -1 jika elemen tidak ditemukan
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consumes the newline character left by nextInt()

        String[] myArray = new String[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextLine();
        }

        System.out.print("Enter the element to search: ");
        String key = scanner.nextLine();

        scanner.close();

        int result = linearSearch(myArray, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
