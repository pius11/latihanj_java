import java.util.Scanner;

public class penjumlajan2buahmatrix {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukan baris");
        int baris = inp.nextInt();
        System.out.println("masukan kolom");
        int kolom = inp.nextInt();
        int[][] matrix1 = inpmatrik1(inp, baris, kolom);
        int[][] matrix2 = inpmatrik1(inp, baris, kolom);

        System.out.println("hasil penjumlahan matrix");
        System.out.println(jumlahMatrix(matrix1, matrix2));
        System.out.println();
        System.out.println("hasil perklaian matrix");
        System.out.println(perkalianMatrix(matrix1, matrix2));

        // System.out.println(perkalianMatrix(matrix1));

    }

    public static int[][] inpmatrik1(Scanner inp, int baris, int kolom) {
        int[][] matrix = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("baris ke " + (i + 1) + " kolom ke " + (j + 1));
                matrix[i][j] = inp.nextInt();
            }
        }

        return matrix;

    }

    // public static int[][] perkalianMatrix(int[][] matrix1) {
    // int baris = matrix1.length;
    // int kolom = matrix1[0].length;
    // int[][] hasil = new int[baris][kolom];
    // for (int i = 0; i < matrix1.length; i++) {
    // for (int j = 0; j < matrix1[i].length; j++) {

    // System.out.print(hasil[i][j] + " | ");
    // }
    // System.out.println();

    // }
    // return hasil;
    // }

    public static int[][] jumlahMatrix(int[][] matrix1, int[][] matrix2) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

                hasil[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(hasil[i][j] + " | ");
            }
            System.out.println();

        }
        return hasil;
    }

    public static int[][] perkalianMatrix(int[][] matrix1, int[][] matrix2) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {

                hasil[i][j] += matrix1[i][j] * matrix2[i][j];
                System.out.print(hasil[i][j] + " | ");
            }
            System.out.println();

        }
        return hasil;
    }
}