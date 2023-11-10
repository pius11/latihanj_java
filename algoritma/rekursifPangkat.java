import java.util.Scanner;

public class rekursifPangkat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int bil = inp.nextInt();
        int pangkat = inp.nextInt();
        System.out.println(pangkath(bil, pangkat));
    }

    public static int pangkath(int bil, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else if (pangkat > 0) {
            return bil * pangkath(bil, pangkat - 1);
        } else {
            return 1;
        }
    }

    public static int pangkatBiasa(int bil, int pangkat) {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil = hasil * bil;

            System.out.println(hasil);
        }
        return hasil;
    }
}
