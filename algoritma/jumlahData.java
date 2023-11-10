import java.util.Scanner;

public class jumlahData {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int jumbil = inp.nextInt();

        for (int i = 0; i < jumbil; i++) {
            System.out.println("masukan bilangan ke : " + (i + 1));
            int bil = inp.nextInt();

            if (bil > 10) {
                int total = +bil;
                System.out.println(total);
            } else {
                System.out.println(0);
            }
        }
    }
}
