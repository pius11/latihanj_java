import java.util.Scanner;

public class ganapGanjil {
    public ganapGanjil() {
        Scanner inp = new Scanner(System.in);
        System.out.println("input bilangan ");
        int bilangan = inp.nextInt();
        int hasil = bilangan % 2;
        if (hasil == 0) {
            System.out.println("bilangan genap");
        } else {
            System.out.println("bilangan ganjil");
        }
    }
}
