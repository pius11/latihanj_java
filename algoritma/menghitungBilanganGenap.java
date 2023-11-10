
import java.util.Scanner;

public class menghitungBilanganGenap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int N = scanner.nextInt();
        int total = 0;
        System.out.println("Masukkan bilangan:");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                total += num;
            }
        }
        System.out.println("Total nilai bilangan genap adalah: " + total);
    }
}
