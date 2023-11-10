import java.util.Scanner;

public class hitungpersegi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sisi = inp.nextInt();
        persegi(sisi);
    }

    public static int luas_persegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void persegi(int sisi) {
        int luas = luas_persegi(sisi);
        System.out.println("luas persegi = " + luas);
    }
}
