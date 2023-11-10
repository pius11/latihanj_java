import java.util.Scanner;

public class kasirVer1 {

    // NAMA : I WAYAN PIUS WIPRAJANA SAMITA
    // NIM : 2315354034
    // KELAS : 1B TRPL

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner ang = new Scanner(System.in);

        while (true) {
            System.out.println("================== SELAMAT DATANG ======================");
            System.out.println("                   KASIR VERSI 1                        ");
            System.err.println("========================================================");
            System.out.printf("Kode Produk: ");
            String kodProduct = inp.nextLine();
            System.out.printf("Type Produk: ");
            String type = inp.nextLine();
            System.out.printf("Harga Produk: ");
            int harga = ang.nextInt();
            System.out.printf("Jumlah Produk: ");
            int jum = ang.nextInt();
            int totalHarga;
            int totalDisc;
            int totalSetDis;
            String lanjut;

            if (type.equals("A")) {
                totalHarga = harga * jum;
                totalDisc = totalHarga * 10 / 100;
                totalSetDis = totalHarga - totalDisc;
            } else if (type.equals("B")) {
                totalHarga = harga * jum;
                totalDisc = totalHarga * 20 / 100;
                totalSetDis = totalHarga - totalDisc;
            } else if (type.equals("C")) {
                totalHarga = harga * jum;
                totalDisc = totalHarga * 25 / 100;
                totalSetDis = totalHarga - totalDisc;
            } else {
                System.out.println(" type produk salah");
                totalHarga = harga * jum;
                totalDisc = 0;
                totalSetDis = 0;
            }

            System.out.println("Total harga: " + totalHarga);
            System.out.println("Total Discount: " + totalDisc);
            System.out.println("Total Setelah Discount " + totalSetDis);
            System.out.println("ingin melanjukan, Y/N");
            String lanju = inp.nextLine();
            if (lanju.equals("Y")) {
                continue;
            } else {
                System.out.println("trimakasih");
                break;
            }

        }
    }
}
