
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("masukan nama : ");
        String nama = sc.nextLine();
        System.out.printf("masukan NIM : ");
        int nim = sc.nextInt();

        System.out.println("Hallo " + nama + " dengan NIM " + nim);

        System.out.println();
    }

}
