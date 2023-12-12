import java.util.Scanner;

// nama : i wayan pius wiprajana samita
// nim : 2315354034
//kelas : 1b TRPL
public class praktek3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        while (true) {

            System.out.println("masukan jumlah data");
            int jumlahdata = inp2.nextInt();

            for (int i = 0; i < jumlahdata; i++) {
                // variable
                String[] nama = new String[jumlahdata];
                String[] jabatan = new String[jumlahdata];
                int[] jumlahHariKerja = new int[jumlahdata];
                int[] upahPerHari = new int[jumlahdata];
                double[] gajiPokok = new double[jumlahdata];
                // input user
                System.out.println("masukan nama");
                String name = inp.nextLine();
                nama[i] = name;
                System.out.println("masukan jabatan");
                String myjabatan = inp.nextLine();
                jabatan[i] = myjabatan;
                System.out.println("masukan hari");
                int myjumlahHariKerja = inp2.nextInt();
                jumlahHariKerja[i] = myjumlahHariKerja;
                System.out.println("masukan upah per hari");
                int myupahPerHari = inp2.nextInt();
                upahPerHari[i] = myupahPerHari;
                System.out.println("masukan gaji pokok");
                double mygajiPokok = inp2.nextDouble();
                gajiPokok[i] = mygajiPokok;

                // memanggil class tampil data dan take home pay untuk menampilkan
                System.out.println("=========================================");
                System.out.println(
                        tampilkan_data(name, myjabatan, myjumlahHariKerja, myupahPerHari, mygajiPokok, jumlahdata));
                System.out.println("=========================================");

            }
            // untuk mengulang pengimputan dari awal
            System.out.println("ingin melanjukan y/n");
            String pilihan = inp.nextLine();
            if (pilihan.equals("y")) {
                continue;
            } else {
                break;
            }

        }
    }

    // function take home pay
    public static double take_home_pay(String jabatan, int upahPerHari, double gajiPokok, int jumlahHariKerja) {
        double gajibersih = 0.0;
        if (jabatan.equals("manager")) {
            gajibersih = 200000 + gajiPokok + (jumlahHariKerja * upahPerHari);
            // System.out.println("bonus jabatan 200000");
            // System.out.println(gajibersih);
        } else if (jabatan.equals("supervisor")) {
            gajibersih = 50000 + gajiPokok + (jumlahHariKerja * upahPerHari);
            // System.out.println("bonus jabatan 50000");
            // System.out.println(gajibersih);
        } else if (jabatan.equals("staf")) {
            gajibersih = 20000 + gajiPokok + (jumlahHariKerja * upahPerHari);
            // System.out.println("bonus jabatan 20000");
            // System.out.println(gajibersih);
        }

        return gajibersih;

    }

    // function tampil data
    public static String tampilkan_data(String nama, String jabatan, int jumlahHariKerja, int upahPerHari,
            double gajiPokok, int jumlahdat) {

        // System.out.println("nama " + nama);
        // System.out.println("jabatan " + jabatan);
        // System.out.println("jumlah hari kerja " + jumlahHariKerja);
        // System.out.println("upah per hari " + upahPerHari);
        // System.out.println("gaji pokok " + gajiPokok);
        // System.out.print("gaji bersih ");
        // take_home_pay(jabatan, upahPerHari, gajiPokok, jumlahHariKerja);
        return "nama " + nama + "\n" + "jabatan " + jabatan + "\n" + "jumlah hari kerja " + jumlahHariKerja + "\n"
                + "upah per hari " + upahPerHari + "\n" + "gaji pokok " + gajiPokok + "\n" + "gaji bersih "
                + take_home_pay(jabatan, upahPerHari, gajiPokok, jumlahHariKerja);

    }

}
