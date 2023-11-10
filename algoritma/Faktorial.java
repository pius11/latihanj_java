import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 1;

        System.out.print("Masukkan jumlah faktorial: ");
        int faktorial = input.nextInt();

        if (faktorial != 0) {
            for (int i = 1; i <= faktorial; i++) {
                total *= i;
            }

            System.out.println("Faktorial dari " + faktorial + "! = " + total);
        } else {
            System.out.println("Faktorial dari 0 = 1");
        }
        
        input.close();
    }
}
