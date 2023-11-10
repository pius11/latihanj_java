import java.util.Scanner;

public class HitungPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai pangkat: ");
        int nilaiPangkat = input.nextInt();

        System.out.print("Masukkan jumlah pangkat: ");
        int jumlahPangkat = input.nextInt();

        System.out.println(pangkat(nilaiPangkat, jumlahPangkat));

        input.close();
    }

    public static int pangkat(double x, int n) {
        // if(n < 0) {
        //     return 0;
        // }

        int total = 1;

        for(int i = 1; i <= n; i++) {
            total *= x;
        }

        return total;
    }
}
