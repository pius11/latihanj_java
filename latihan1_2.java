import java.util.Scanner;

public class latihan1_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukan jumlah inputan");
        inp.nextLine();
        int jumlahData = inp.nextInt();
        int sum = 0;
        int maxnumber = Integer.MIN_VALUE;
        int maxIndeks = -1;
        int indeks = +1;

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("masukan data ke " + (i + 1) + " : ");
            String input = inp.nextLine();
            try {
                int number = Integer.parseInt(input);
                sum += number;
                if (number > maxnumber) {
                    maxnumber = number;
                    maxIndeks = i;
                }
            } catch (NumberFormatException e) {
                System.out.println("data tidak valid");
                i--;

            }
            System.out.println(sum);
            System.out.println(maxnumber);
            System.out.println(maxIndeks);
        }

    }
}
