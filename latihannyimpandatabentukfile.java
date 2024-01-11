import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class latihannyimpandatabentukfile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // input data
        System.out.print("masukan NIM : ");
        int nim = inp.nextInt();

        inp.nextLine();
        System.out.print("masukan nama mahasiswa : ");
        String namaMhs = inp.nextLine();

        System.out.print("masukan umur : ");
        int umur = inp.nextInt();

        System.out.print("masukan nilai uts : ");
        int nilaiUts = inp.nextInt();

        System.out.print("masukan nilai Uas : ");
        int nilaiUas = inp.nextInt();

        // menampilkan data yang di simpan
        System.out.println("\n data yang akan di simpan : ");
        System.out.println("NIM : " + nim);
        System.out.println("nama mahasiswa : " + namaMhs);
        System.out.println("umur : " + umur);
        System.out.println("nilai uts : " + nilaiUts);
        System.out.println("nilai uas : " + nilaiUas);
        // meminta konfirmasi
        System.out.println("\n apakah anda ingin menyimpan data? (y/n)");
        char konfirmasi = inp.next().charAt(0);
        if (konfirmasi == 'y' || konfirmasi == 'Y') {
            tulisDataKEfile("data_mahasiswa.txt", nim, namaMhs, umur, nilaiUts, nilaiUas);
            System.out.println("data telah di simpan");
        } else {
            System.out.println("data gagal di simpan");

        }

    }

    public static void tulisDataKEfile(String namaFile, int nim, String namaMhs, int umur, int nilaiUts, int nilaiUas) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile, true))) {
            // menulis data ke file

            writer.println(nim + "\t" + namaMhs + "\t" + umur + "\t" + nilaiUts + "\t" + nilaiUas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
