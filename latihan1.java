import java.util.Scanner;

/**
 * latihan1
 */
// buatlah program menggunakan program java, untuk menghitung jumlah seluruh
// data yang di inputkan oleh user melalui keyboard.
// banyaknya item data diinput sesuai dengan keperluan user kemudian lakukan
// penentuan nilai data yang terbesar dari data yang di inputkan dan tampilkan
// indeks data tersebut contoh input dan output dapat dilihat di bawah ini
public class latihan1 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("ketik stop untuk berhenti memasukan angka ");

        int sum = 0;
        int maxIndeks = -1;
        int indeks = +1;
        int maxNuber = Integer.MIN_VALUE;

        while (true) {
            String input = inp.nextLine();
            if (input.toLowerCase().equals("stop")) {
                break;
            }
            try {
                int angkan = Integer.parseInt(input);
                sum += angkan;
                if (angkan > maxNuber) {
                    maxNuber = angkan;
                    maxIndeks = indeks;
                }
                indeks++;

            } catch (NumberFormatException e) {
                System.out.println("nomor tidak valid");
            }

        }
        System.out.println("jumlah seluruh data = " + sum);
        System.out.println("angka terbesar = " + maxNuber);
        System.out.println("indeks data = " + maxIndeks);
    }
}