package pratek;

import java.util.Scanner;

public class pratek1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pilihan;
        int jumlah = 0;
        do {
            System.out.println("pilih menu : ");
            System.out.println("1. input data mahasiswa");
            System.out.println("2. input data dosen");
            System.out.println("3. exit");
            System.out.println("pilih no pada menu di atas");
            pilihan = inp.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("masukan data mahasiswa ");
                    dataMahasiswa(inp, jumlah);
                    break;
                case 2:
                    System.out.println("masukan data dosen");
                    dataDosen(inp, jumlah);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        } while (pilihan != 3);
    }

    // progran untuk menginput dan menampilkan data mahasiswa
    public static void dataMahasiswa(Scanner inp, int jumlah) {
        String lanjut = "y";
        while (lanjut.equalsIgnoreCase("y")) {

            System.out.println("masukan jumlah data ");
            jumlah = inp.nextInt();
            inp.nextLine();
            String[][] mahasiswa = new String[jumlah][3];
            for (int i = 0; i < jumlah; i++) {
                System.out.println("mahasiswa ke " + (i + 1));

                System.out.print("masukan nama mahasiswa : ");
                mahasiswa[i][0] = inp.nextLine();

                System.out.print("masukan NIM mahasiswa : ");
                mahasiswa[i][1] = inp.nextLine();

                System.out.print("masukan jurusan mahasiswa : ");
                mahasiswa[i][2] = inp.nextLine();

            }
            // code untuk menampilkan data
            System.out.println("\nData Mahasiswa:");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("| No. | Nama                 | NIM              | JURUSAN              |");
            System.out.println("------------------------------------------------------------------------");
            for (int i = 0; i < jumlah; i++) {
                System.out.printf("| %-3d | %-20s | %-16s | %-21s |\n", (i + 1), mahasiswa[i][0], mahasiswa[i][1],
                        mahasiswa[i][2]);
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.println("ingin melanjutkan ? y/n");
            lanjut = inp.nextLine();
        }
    }

    // function unt menginput dan menampilkan data dosen
    public static void dataDosen(Scanner inp, int jumlah) {
        String lanjut = "y";
        while (lanjut.equalsIgnoreCase("y")) {
            System.out.println("masukan jumlah data ");
            jumlah = inp.nextInt();
            inp.nextLine();
            String[][] dosen = new String[jumlah][3];
            for (int i = 0; i < jumlah; i++) {
                System.out.println("dosen ke " + (i + 1));

                System.out.print("masukan nama dosen : ");
                dosen[i][0] = inp.nextLine();

                System.out.print("masukan NIP dosen : ");
                dosen[i][1] = inp.nextLine();

                System.out.print("masukan mata kulia dosen : ");
                dosen[i][2] = inp.nextLine();
            }
            // code untuk menampilkan data
            System.out.println("\nData dosen:");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("| No. | Nama                 | NIP              | MATAKULIAH       |");
            System.out.println("--------------------------------------------------------------------");
            for (int i = 0; i < jumlah; i++) {
                System.out.printf("| %-3d | %-20s | %-16s | %-16s |\n", (i + 1), dosen[i][0], dosen[i][1], dosen[i][2]);
            }
            System.out.println("---------------------------------------------------------------------");
            System.out.println("ingin melanjutkan ? y/n");
            lanjut = inp.nextLine();
        }
    }
}
