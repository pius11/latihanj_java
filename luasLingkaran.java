import java.util.Scanner;

public class luasLingkaran {
    public static void main(String[] args) {
        int jari;
        double luas;
        Scanner ip = new Scanner(System.in);
        System.out.printf("masukan jari-jari : ");
        jari = ip.nextInt();
        luas = (Double) (3.14 * jari);
        System.out.println("Hasli " + luas);

    }
}
