import java.util.Scanner;

public class repersont {
    public record recordLaptop(String name,  int ram,  int  harga) {

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        recordLaptop[] laptop = new recordLaptop[3];
        for (int i = 0; i < laptop.length; i++) {
            System.out.println("masukan nama laptop ");
            String nama = inp.next();
            
            System.out.println("masukan merk laptop ");
            String merk = inp.next();
            System.out.println("masukan harga laptop ");
            int harga = inp.nextInt();
            System.out.println("masukan ram laptop ");
            int ram = inp.nextInt();

            laptop[i] = new recordLaptop(nama, ram, harga);

        }
        for (int i = 0; i < laptop.length; i++) {
            System.out.println(laptop[i].name+" "+laptop[i].harga+" "+laptop[i].ram);
        }

    }
}
