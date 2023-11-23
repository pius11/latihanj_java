import java.util.Scanner;

public class ulangan2 {
    public static void main(String[] args) {
        while (true) {

            Scanner inp = new Scanner(System.in);
            Scanner inp2 = new Scanner(System.in);

            System.out.println("masukan tipe kendaraan (mobil, sepeda motor)");
            String type = inp.nextLine();
            int totalSebelumDiskont;
            int totaldinkon;
            int totalsetelahdiskon;
            int total;

            if (type.equals("mobil")) {

                System.out.println("1. AVANZA");
                System.out.println("2. ZENIA");
                System.out.println("3. INNOVA");
                System.out.println("masukan nama kendaraan di atas");
                String noken = inp.nextLine();
                System.out.println("masukan jumlah kedaraan yang ingin di sewa");
                int jml = inp2.nextInt();
                System.out.println("masukan jam sewa");
                int jam = inp2.nextInt();
                switch (noken) {

                    case "AVANZA":
                        System.out.println("AVANSA");
                        System.out.println(" harga sewa perjam Rp.600.000");
                        System.out.println("jumlah sewa " + jml);
                        System.out.println();
                        if (jml >= 4) {
                            System.out.println("anda mendapatkan diskon 10%");
                            totalSebelumDiskont = 600000 * jam * jml;
                            totaldinkon = 10 * totalSebelumDiskont / 100;
                            totalsetelahdiskon = totalSebelumDiskont - totaldinkon;
                            System.out.println("total sewa " + totalSebelumDiskont);
                            System.out.println("potongan" + totaldinkon);
                            System.out.println("total anda membayar " + totalsetelahdiskon);
                        } else {
                            total = 600000 * jam * jml;
                            System.out.println(" total anda membayar " + total);
                        }
                        break;

                    case "ZENIA":
                        System.out.println("ZENIA");
                        System.out.println(" harga sewa perjam Rp.500.000");
                        System.out.println("jumlah sewa " + jml);
                        System.out.println();
                        if (jml >= 4) {
                            System.out.println("anda mendapatkan diskon 10%");
                            totalSebelumDiskont = 500000 * jam * jml;
                            totaldinkon = 10 * totalSebelumDiskont / 100;
                            totalsetelahdiskon = totalSebelumDiskont - totaldinkon;
                            System.out.println("total sewa " + totalSebelumDiskont);
                            System.out.println("potongan" + totaldinkon);
                            System.out.println("total anda membayar " + totalsetelahdiskon);
                        } else {
                            total = 500000 * jam * jml;
                            System.out.println(" total anda membayar " + total);
                        }
                        break;

                    case "INOVA":
                        System.out.println("INOVA");
                        System.out.println(" harga sewa perjam Rp.800.000");
                        System.out.println("jumlah sewa " + jml);
                        System.out.println();
                        if (jml >= 4) {
                            System.out.println("anda mendapatkan diskon 10%");
                            totalSebelumDiskont = 800000 * jam * jml;
                            totaldinkon = 10 * totalSebelumDiskont / 100;
                            totalsetelahdiskon = totalSebelumDiskont - totaldinkon;
                            System.out.println("total sewa " + totalSebelumDiskont);
                            System.out.println("potongan" + totaldinkon);
                            System.out.println("total anda membayar " + totalsetelahdiskon);
                        } else {
                            total = 800000 * jam * jml;
                            System.out.println(" total anda membayar " + total);
                        }
                        break;

                    default:
                        break;

                }

            } else if (type.equals("sepeda motor")) {

                System.out.println("1. VARIO");
                System.out.println("2. SUPRA");
                System.out.println("3. X125");
                System.out.println("4. FAZIO");
                System.out.println("5. SCOOPY");
                System.out.println("masukan nama kendaraan di atas");
                String noken = inp.nextLine();
                System.out.println("masukan jumlah kedaraan yang ingin di sewa");
                int jml = inp2.nextInt();
                System.out.println("masukan jam sewa");
                int jam = inp2.nextInt();

                switch (noken) {
                    case "VARIO":
                        System.out.println("VARIO");
                        System.out.println(" harga sewa perjam Rp.300.000");
                        System.out.println("jumlah sewa " + jml);
                        System.out.println();
                        if (jml >= 4) {
                            System.out.println("anda mendapatkan diskon 10%");
                            totalSebelumDiskont = 300000 * jam * jml;
                            totaldinkon = 10 * totalSebelumDiskont / 100;
                            totalsetelahdiskon = totalSebelumDiskont - totaldinkon;
                            System.out.println("total sewa " + totalSebelumDiskont);
                            System.out.println("potongan" + totaldinkon);
                            System.out.println("total anda membayar " + totalsetelahdiskon);
                        } else {
                            total = 300000 * jam * jml;
                            System.out.println(" total anda membayar " + total);
                        }
                        break;
                    case "SUPRA":
                        System.out.println("SUPRA");
                        System.out.println(" harga sewa perjam Rp.150.000");
                        System.out.println("jumlah sewa " + jml);
                        System.out.println();
                        if (jml >= 4) {
                            System.out.println("anda mendapatkan diskon 10%");
                            totalSebelumDiskont = 150000 * jam * jml;
                            totaldinkon = 10 * totalSebelumDiskont / 100;
                            totalsetelahdiskon = totalSebelumDiskont - totaldinkon;
                            System.out.println("total sewa " + totalSebelumDiskont);
                            System.out.println("potongan" + totaldinkon);
                            System.out.println("total anda membayar " + totalsetelahdiskon);
                        } else {

                            total = 1500000 * jam * jml;
                            System.out.println(" total anda membayar " + total);
                        }
                        break;
                    case "X125":
                        System.out.println("X125");
                        System.out.println(" harga sewa perjam Rp.600.000");
                        System.out.println("jumlah sewa " + jml);
                        System.out.println();
                        if (jml >= 4) {
                            System.out.println("anda mendapatkan diskon 10%");
                            totalSebelumDiskont = 600000 * jam * jml;
                            totaldinkon = 10 * totalSebelumDiskont / 100;
                            totalsetelahdiskon = totalSebelumDiskont - totaldinkon;
                            System.out.println("total sewa " + totalSebelumDiskont);
                            System.out.println("potongan" + totaldinkon);
                            System.out.println("total anda membayar " + totalsetelahdiskon);
                        } else {
                            total = 600000 * jam * jml;
                            System.out.println(" total anda membayar " + total);
                            ;
                        }
                        break;
                    case "FAZIO":
                        System.out.println("FAZIO");
                        System.out.println(" harga sewa perjam Rp.200.000");
                        System.out.println("jumlah sewa " + jml);
                        System.out.println();
                        if (jml >= 4) {
                            System.out.println("anda mendapatkan diskon 10%");
                            totalSebelumDiskont = 200000 * jam * jml;
                            totaldinkon = 10 * totalSebelumDiskont / 100;
                            totalsetelahdiskon = totalSebelumDiskont - totaldinkon;
                            System.out.println("total sewa " + totalSebelumDiskont);
                            System.out.println("potongan" + totaldinkon);
                            System.out.println("total anda membayar " + totalsetelahdiskon);
                        } else {
                            total = 200000 * jam * jml;
                            System.out.println(" total anda membayar " + total);
                        }
                        break;
                    case "SCOOPY":
                        System.out.println("SCOOPY");
                        System.out.println(" harga sewa perjam Rp.100.000");
                        System.out.println("jumlah sewa " + jml);
                        System.out.println();
                        if (jml >= 4) {
                            System.out.println("anda mendapatkan diskon 10%");
                            totalSebelumDiskont = 100000 * jam * jml;
                            totaldinkon = 10 * totalSebelumDiskont / 100;
                            totalsetelahdiskon = totalSebelumDiskont - totaldinkon;
                            System.out.println("total sewa " + totalSebelumDiskont);
                            System.out.println("potongan" + totaldinkon);
                            System.out.println("total anda membayar " + totalsetelahdiskon);
                        } else {
                            total = 100000 * jam * jml;
                            System.out.println(" total anda membayar " + total);
                        }
                        break;
                    default:
                        break;
                }

            }
            System.out.println("ingin melanjutak? y/n");
            String pilihan = inp.nextLine();
            if (pilihan.equals("y")) {
                continue;
            } else {
                break;
            }
        }
    }
}
