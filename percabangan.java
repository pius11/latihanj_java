
import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("input nilai : ");
        int nilai = input.nextInt();

        // if (nilai > 70) {
        // System.out.println("selamat");

        // } else if (nilai == 70) {
        // System.out.println("cukup bagus");

        // } else {
        // System.out.println("coba lagi");
        // }
        Scanner inp = new Scanner(System.in);
        System.out.println("masukan password ");
        String jawaban = inp.nextLine();

        if (jawaban.equals("pppp") != (nilai == 100)) {
            System.out.println("password benar");
        } else {
            System.out.println("password salah");
        }

    }

}
