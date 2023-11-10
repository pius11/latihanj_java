import java.util.Scanner;

public class hitungPangkat3 {
    public static Integer hitungPangkat(int angka, int hasil) {
        for (int i = 1; i < 3; i++) {
            hasil = hasil * angka;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int angka = inp.nextInt();

        System.out.println(hitungPangkat(angka, angka));
    }
}
