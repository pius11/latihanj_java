import java.util.Scanner;

public class hitungPersegiPanjang {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("masukan panjang = ");
        int panjang = inp.nextInt();
        System.out.println("masukan lebar = ");
        int lebar = inp.nextInt();

        persegi_panjang(panjang, lebar);
    }

    public static int luas_persegiPanjang(int panjang, int lebar) {

        int luas = panjang * lebar;
        return luas;

    }

    public static int keliling(int panjang, int lebar) {
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }

    public static void persegi_panjang(int panjang, int lebar) {
        int luas = luas_persegiPanjang(panjang, lebar);
        int keliling = keliling(panjang, lebar);
        System.out.println("luas persegi panjang = " + luas);
        System.out.println("keliling persegi panjang = " + keliling);
    }

}
