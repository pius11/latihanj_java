import java.util.Scanner;

public class kalkulato2 {
    public static void main(String[] args) {
        Scanner nip = new Scanner(System.in);
        String oprt;
        int angka1;
        int angka2;
        int hasil;
        System.out.println("masukan operator : ");
        oprt = nip.nextLine();
        System.out.println("masukan angka : ");
        angka1 = nip.nextInt();
        angka2 = nip.nextInt();
        if (oprt.equals("+")) {
            hasil = angka1 + angka2;
            System.out.println(hasil);
        } else if (oprt.equals("-")) {
            hasil = angka1 - angka2;
            System.out.println(hasil);
        } else if (oprt.equals("/")) {
            hasil = angka1 / angka2;
            System.out.println(hasil);
        } else if (oprt.equals("*")) {
            hasil = angka1 * angka2;
            System.out.println(hasil);
        } else {
            System.out.println("error");
        }
    }
}
