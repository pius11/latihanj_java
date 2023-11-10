
import java.util.Scanner;

public class menghitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= N; i += 2) {
            if ((i / 2) % 2 == 0) {
                sum += 1.0 / i;
            } else {
                sum -= 1.0 / i;
            }
        }
        System.out.println("Jumlah deret adalah: " + sum);
    }
}
