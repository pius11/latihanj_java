import java.util.Scanner;

public class gnapGjil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukan bilangan : ");
        int bil = inp.nextInt();
        if (genapGanjil(bil)) {
            System.out.println(bil + " adalah bilangan genap");

        } else {
            System.out.println(bil + " adalah bilangan ganjil");
        }

    }

    public static boolean genapGanjil(int bil) {

        return bil % 2 == 0;
    }
}
