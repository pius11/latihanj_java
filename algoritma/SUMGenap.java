import java.util.Scanner;

public class SUMGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int SUMGenap = 0;

        System.out.print("Masukkan jumlah buah bilangan: ");
        int jmlBuahBilangan = input.nextInt();

        for (int i = 1; i <= jmlBuahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");    
            int nilai = input.nextInt();

            if(nilai % 2 == 0) {
                SUMGenap += nilai;
            }
        }
        
        System.out.print("Hasil penjumlahan bilangan genap: " + SUMGenap);

        input.close();
    }
}
