import java.util.Scanner;


public class menuBacaFile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data mahasiswa");
            System.out.println("2. Display data mahasiswa");
            System.out.println("3. Exit");
            System.out.print("pilih menu : ");

            int pilihan = inp.nextInt();
            inp.nextLine();

            switch (pilihan) {
                case 1:
                    latihannyimpandatabentukfile.main(null);
                    break;
                case 2:
                    bacafile.main(null);
                    break;
                case 3:
                
                    exit = true;
                    break;

                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        }
    }
}
