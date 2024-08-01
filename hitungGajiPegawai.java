import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class hitungGajiPegawai {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner inp1 = new Scanner(System.in);
        while (true) {

            System.out.println("masukan gaji pokok");
            int gajiPok = inp.nextInt();
            System.out.println("masukan jumlah hari kerja");
            int jumalaHar = inp.nextInt();
            System.out.println("masukan jumlah anak");
            int jumalahAnk = inp.nextInt();
            System.out.println("masukan uang makan per hari");
            int uangmak = inp.nextInt();

            int totalUangMakan = uangmak * jumalaHar;
            int tunjanganAnak;
            if (jumalahAnk <= 3) {
                tunjanganAnak = 10 * gajiPok / 100 * jumalahAnk;
            } else {
                tunjanganAnak = 10 * gajiPok / 100 * 3;
            }

            int gajiPegawai = gajiPok + totalUangMakan + tunjanganAnak;
            System.out.println("============================================================================");
            System.out.println("gaji pokok per hari: " + gajiPok);
            System.out.println("total uang makan: " + totalUangMakan);
            System.out.println("total tunjangan anak: " + tunjanganAnak);
            System.out.println("total gaji pegawai: " + gajiPegawai);

            System.out.println("ingin memasukan data lagi? Y/N");
            String masukan = inp1.nextLine();

            if (masukan.equals("Y")) {
                inp.nextLine();
                continue;
            } else {

                break;
            }

        }

    }
}
