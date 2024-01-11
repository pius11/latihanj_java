import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//nama : i wayan pius wiprajana samita
//nim : 2315354034
//kelas : 1B TRPL

public class praktek4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("pilih menu");
            System.out.println("1. menulis file");
            System.out.println("2. membaca file");
            System.out.println("3. exit");
            pilihan = inp.nextInt();
            inp.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("masukan kode produk");
                    String kodebarang = inp.nextLine();

                    System.out.println("masukan nama produk ");
                    String namabarang = inp.nextLine();

                    System.out.println("masukan jumlah barang");
                    int jmlproduk = inp.nextInt();

                    System.out.println("masukan harga satuan ");
                    int hargasatuan = inp.nextInt();

                    simpanDataKeFile("barang.txt", kodebarang, namabarang, jmlproduk, hargasatuan);
                    break;
                case 2:
                    bacafile();
                    break;
                case 3:
                    System.out.println("trimakasih telah menggunakan program ini");
                    break;

                default:
                    System.out.println("inputan tidak falid");
                    break;
            }
        } while (pilihan != 3);
    }

    private static void simpanDataKeFile(String namaFile, String kodeproduk, String namaproduk, int jmlproduk,
            int hargasatuan) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile, true))) {
            // menulis data ke file

            writer.println(kodeproduk + "\t" + namaproduk + "\t" + jmlproduk + "\t" + hargasatuan);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bacafile() {

        String[] kodeprodukarr;
        String[] namaprodukarr;
        int[] jmlprodukarr;
        int[] hargasatuanarr;
        try {
            // hitung baris jumlah baris dalam file untuk menentukan ukuran array

            int jumalhbaris = hitungJumlahBaris("barang.txt");

            // inisialisasi array
            kodeprodukarr = new String[jumalhbaris];
            namaprodukarr = new String[jumalhbaris];
            jmlprodukarr = new int[jumalhbaris];
            hargasatuanarr = new int[jumalhbaris];

            // baca file dan isi array
            lihatfile("barang.txt", kodeprodukarr, namaprodukarr, jmlprodukarr, hargasatuanarr);
            int totalsemua = 0;
            int totaljml = 0;
            // tampilkan hasil pembacaan
            System.out.println("data mahasiswa dari file: ");

            for (int i = 0; i < hargasatuanarr.length; i++) {
                System.out.println("  " + kodeprodukarr[i] +
                        "  " + namaprodukarr[i] +
                        "  " + jmlprodukarr[i] +
                        "  " + hargasatuanarr[i]);

            }
            for (int i = 0; i < jmlprodukarr.length; i++) {
                int jml = jmlprodukarr[i];
                int harg = hargasatuanarr[i];
                int total = jml * harg;
                totalsemua += total;
                totaljml += jml;

            }
            System.out.println("total jumlah barang " + totaljml);
            System.out.println("total jumlah barang * harga satuan " + totalsemua);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int hitungJumlahBaris(String namaFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            int jumlahBaris = 0;
            while (reader.readLine() != null) {
                jumlahBaris++;
            }
            return jumlahBaris;
        }
    }

    private static void lihatfile(String namaFile, String[] kodeprodukarr, String[] namaprodukarr, int[] jmlprodukarr,
            int[] hargasatuanarr) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            int index = 0;
            // baca setiap baris dan isi array
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");

                kodeprodukarr[index] = data[0];
                namaprodukarr[index] = data[1];
                jmlprodukarr[index] = Integer.parseInt(data[2]);
                hargasatuanarr[index] = Integer.parseInt(data[3]);

                index++;

            }
        }

    }

}
