import java.util.Scanner;

public class AverageNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double averageNilai = 0, totalNilai = 0;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = input.nextInt();

        System.out.print("Masukkan jumlah matkul: ");
        int jmlMatkul = input.nextInt();

        System.out.println("");

        for (int i = 1; i <= jmlMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + i + ": ");
            String namaMhs = input.nextLine();

            namaMhs = input.nextLine();

            for (int j = 1; j <= jmlMatkul; j++) {
                System.out.print("Masukkan nilai MK" + j + ": ");    
                double nilaiMatkul = input.nextDouble();
                totalNilai += nilaiMatkul;
            }

            averageNilai = totalNilai / jmlMatkul;
            totalNilai = 0;

            System.out.println("Rata rata nilai " + namaMhs + " adalah: " + averageNilai);
            
            System.out.println("");
        }

        input.close();
    }
}
