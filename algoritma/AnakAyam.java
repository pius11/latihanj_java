import java.util.Scanner;

public class AnakAyam {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah anak ayam: ");
        int jmlAnakAyam = input.nextInt();

        System.out.println("Anak Ayam Turun " + jmlAnakAyam);

        while(jmlAnakAyam >= 1) {
            if(jmlAnakAyam == 1) {
                System.out.println("Anak ayam turun 1, mati satu tinggal induknya");
                break;
            }

            System.out.println("Anak ayam turun " + jmlAnakAyam + ", mati satu tinggal " + (jmlAnakAyam - 1));
            jmlAnakAyam--;
        }

        input.close();
    }
}
