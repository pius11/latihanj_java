import java.util.Scanner;

public class ifTanpaElse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("masukan nilai : ");
        int nilai = inp.nextInt();

        if (nilai == 100) {
            System.out.println("nilai yang di input sama dengan 100");
        }
    }
}
