import java.util.Scanner;

public class inputUser {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String nama, nim;
        float uas, uts;
        float hasil;
        System.out.printf("masukan nama : ");
        nama = ip.nextLine();
        System.out.printf("masukan NIM : ");
        nim = ip.nextLine();
        System.out.printf("masukan nilai UAS : ");
        uas = ip.nextFloat();
        System.out.printf("masukan nilai UTS : ");
        uts = ip.nextFloat();
        hasil = (40 * uts / 100) + (60 * uas / 100);
        // 0.4f= 40/100(40%)
        System.out.println("=============================================================================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Hasil : " + hasil);
    }
}
