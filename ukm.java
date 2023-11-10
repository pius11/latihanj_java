import java.util.Scanner;

/**
 * ukm
 */
public class ukm {

    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("==================================================================================");
        System.out.println("pilihan ukm");
        System.out.println("==================================================================================");
        System.out.println("1. Computer club");
        System.out.println("2. Robotic");
        System.out.println("3. Jepang");
        System.out.println("4. Kerawitan");
        System.out.println("==================================================================================");
        System.out.println("masukan no ukm");
        System.out.println("==================================================================================");

        int no_ukm = no.nextInt();
        switch (no_ukm) {
            case 1:
                System.out.println("anda memilih UKM Computer club");
                break;
            case 2:
                System.out.println("anda memilih UKM Robotic");
                break;
            case 3:
                System.out.println("anda memilih UKM Jepang");
                break;
            case 4:
                System.out.println("anda memilih UKM Kerawitan");
                break;

            default:
                System.out.println("UKM tidak ada ");
                break;
        }
    }
}