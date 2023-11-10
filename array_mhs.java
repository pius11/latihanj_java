import java.util.Scanner;

public class array_mhs {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);

        String[] nama = new String[9];
        int[] umur = new int[9];
        int i = 0;
        String MyName;
        int MyUmur;
        while (i <= 8) {
            System.out.println("masukan nama mahasiswa ke " + (i + 1) + " ");
            MyName = inp1.nextLine();
            nama[i] = MyName;
            System.out.println("masukan umur mahasiswa ke " + (i + 1) + " ");
            MyUmur = inp2.nextInt();
            umur[i] = MyUmur;
            System.out.println();
            i++;
        }
        System.out.println("data yang sudah dimasukan adalah : ");
        i = 0;
        while (i <= 8) {
            System.out.println(" ");
            System.out.println("nama mahasiswa ke " + (i + 1) + " " + nama[i]);
            System.out.println("umur mahasiswa ke " + (i + 1) + " " + umur[i]);
            i++;
        }
    }
}