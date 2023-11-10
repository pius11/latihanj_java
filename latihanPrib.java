import java.util.Scanner;

public class latihanPrib {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukan nama nama mahasiswa : ");
        while (true) {
            String nama = inp.nextLine();
            if (nama.toLowerCase().equals("stop")) {
                System.out.println("apakah ingin memasukan nama lagi?(y/n)");
                String input = inp.nextLine();
                if (input.equals("y")) {
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}
