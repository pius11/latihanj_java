import java.util.Scanner;

public class bilanganacak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukan jumlah bilangan : ");
        int jml = inp.nextInt();
        int total = 0;
        int total1 = 0;
        System.out.println("masukan bilangan : ");
        for (int i = 0; i < jml; i++) {
            int num = inp.nextInt();
            if (num % 2 == 0) {
                total += num;

            } else if (num % 2 == 1) {
                total1 += num;

            }
            System.out.println("genap " + total);
            System.out.println("ganjil " + total1);
        }
        // System.out.println("total " + total);
    }
}
