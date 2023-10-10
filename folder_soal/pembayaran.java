package folder_soal;

import java.util.Scanner;

// buat lah program dalam bahasa java untuk menghitung jumlah bayar pembeli.
//
public class pembayaran {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner inps = new Scanner(System.in);

        System.out.println("=========================================================================");
        System.out.printf("input kuantiti : ");
        int qty = inp.nextInt();
        System.out.printf("intput harga : Rp.");
        int harga = inp.nextInt();
        System.out.printf("input tipe custumer : ");
        String typePem = inps.nextLine();
        int total = qty * harga;
        int totalBayar;
        int discount;

        // memakai if else
        // System.out.println("==========================================================================");
        // if (typePem.equals("umum")) {
        // System.out.println("total bayar : Rp." + total);
        // } else if (typePem.equals("member")) {
        // discount = 10 / 100 * total;
        // totalBayar = total - discount;
        // System.out.println("total bayar : Rp." + totalBayar);
        // System.out.println("total pembeyaran sebelum dicount Rp." + total);
        // System.out.println("anda mendapatkan potongan sebesar Rp." + discount);
        // } else if (typePem.equals("owner")) {
        // discount = 20 / 100 * total;
        // totalBayar = total - discount;
        // System.out.println("total bayar : Rp." + totalBayar);
        // System.out.println("total pembeyaran sebelum dicount Rp." + total);
        // System.out.println("anda mendapatkan potongan sebesar Rp." + discount);
        // } else {
        // System.out.println("member tidak ada");
        // }

        // menggunakan switch case
        System.out.println("==================================================================");
        switch (typePem) {
            case "umum":
                System.out.println("total membayar " + total);
                break;
            case "member":
                discount = total * 10 / 100;
                totalBayar = total - discount;
                System.out.println("total bayar : Rp." + totalBayar);
                System.out.println("total pembeyaran sebelum dicount Rp." + total);
                System.out.println("anda mendapatkan potongan sebesar Rp." + discount);

                break;
            case "owner":
                discount = total * 20 / 100;
                totalBayar = total - discount;
                System.out.println("total bayar : Rp." + totalBayar);
                System.out.println("total pembeyaran sebelum dicount Rp." + total);
                System.out.println("anda mendapatkan potongan sebesar Rp." + discount);
                break;

            default:
                System.out.println("tipe pembeli " + typePem + " tidak ditemukan");
                break;
        }
    }
}
