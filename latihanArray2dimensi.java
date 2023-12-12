import java.util.Scanner;

/**
 * latihanArray2dimensi
 */
public class latihanArray2dimensi {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukan baris");
        int baris = inp.nextInt();
        System.out.println("masukan kolom ");
        int kolom = inp.nextInt();
        inp.nextLine();
        System.out.println("input matrix");

        int[][] matriks = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("baris ke " + (i + 1) + " kolom ke " + (j + 1));
                matriks[i][j] = inp.nextInt();
            }
        }
        // System.out.println("===========");
        // for (int i = 0; i < baris; i++) {
        //     for (int j = 0; j < kolom; j++) {

        //         System.out.print(matriks[i][j] + " | ");

        //     }
        //     System.out.println();
        //     System.out.println("===========");
        // }
        System.out.println("===========");
        for (int [] m:matriks) {
            for (int m2 : m) {

                System.out.print(m2 + " | ");

            }
            System.out.println();
            System.out.println("===========");
        }
    }
}