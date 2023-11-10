import java.util.Scanner;

public class studi1 {
    /*
     * dekalarasi
     * string merek
     * string type
     * string warna
     * int harga
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukan merek hp ");
        String merek = inp.nextLine();
        System.out.println("masukan tipe hp ");
        String type = inp.nextLine();
        System.out.println("masukan warna hp ");
        String warna = inp.nextLine();
        System.out.println(" masukan harga hp ");
        String harga = inp.nextLine();
        System.out.println("masukan discount ");
        System.out.println("note jika tidak ada discount ketik 0");
        String discount = inp.nextLine();
        int hargaDisc;
        int hargaSetDisc;
        int discounthp = Integer.parseInt(discount);
        int hargaHp = Integer.parseInt(harga);
        if (discounthp == 0) {

            System.out.println("===============================================================================");
            System.out.println("merek hp " + merek);
            System.out.println("tipe hp " + type);
            System.out.println("warna hp " + warna);
            System.out.println("harga hp " + hargaHp);
        } else {
            hargaDisc = hargaHp * discounthp / 100;
            hargaSetDisc = hargaHp - hargaDisc;

            System.out.println("===============================================================================");
            System.out.println("merek hp " + merek);
            System.out.println("tipe hp " + type);
            System.out.println("warna hp " + warna);
            System.out.println("harga hp " + hargaHp);
            System.out.println("mendapatkan potongan " + hargaDisc);
            System.out.println("harga setelah dincount  " + hargaSetDisc);
        }

    }
}
