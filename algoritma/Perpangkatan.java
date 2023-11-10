import java.util.Scanner;

public class Perpangkatan {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // int total = 1;

        // System.out.print("Masukkan nilai yang dipangkatkan: ");
        // int nilaiPangkat = input.nextInt();

        // System.out.print("Masukkan banyak pangkatnya: ");
        // int bykPangkat = input.nextInt();

        // for (int i = 1; i <= bykPangkat; i++) {
        // total *= nilaiPangkat;
        // }

        // System.out.println(total);

        // input.close();

        Scanner inp = new Scanner(System.in);
        int bil, pangkat;
        int hasil = 1;
        System.out.println("masukan bilangan :");
        bil = inp.nextInt();
        System.out.println("masukan pangkatnya :");
        pangkat = inp.nextInt();
        System.out.println("");

        for (int i = 1; i <= pangkat; i++) {
            hasil = hasil * bil;

            System.out.println(hasil);
        }
    }
}
