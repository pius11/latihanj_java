import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input angka: ");
        int angka = input.nextInt();

        String result = genap(angka) ? angka + " adalah bilangan genap" : angka + " adalah bilangan ganjil";

        System.out.println(result);

        input.close();
    }

    public static boolean genap(int angka) {
        boolean result = angka % 2 == 0 ? true : false;

        return result;
    }
}
