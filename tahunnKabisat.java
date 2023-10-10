import java.util.Scanner;

/**
 * tahunnKabisat
 */
public class tahunnKabisat {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("intput tahun : ");
        int tahunin = inp.nextInt();
        int tahun;
        tahun = tahunin % 4;
        if (tahun == 0) {
            System.out.println(tahunin + " tahun kabisat");
        } else {
            System.out.println(tahunin + " tidak kabisat");
        }

    }
}