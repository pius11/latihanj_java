import java.util.Scanner;

public class kondisiSwitct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("masukan angka : ");
        int angka = input.nextInt();
        System.out.println("=============================================================================");
        switch (angka) {
            case 1:
                System.out.println("senin");
                break;
            case 2:
                System.out.println("selasa");
                break;
            case 3:
                System.out.println("rabu");
                break;
            case 4:
                System.out.println("kamis");
                break;
            case 5:
                System.out.println("jumat");
                break;
            case 6:
                System.out.println("sabtu");
                break;
            case 7:
                System.out.println("minggu");
                break;
            default:
                System.out.println("hari tidak ada");
                break;
        }
    }

}
