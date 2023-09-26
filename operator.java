
import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char operator;
        int a, b;
        float c;
        // System.out.printf("pilih operator : ");
        // operator = sc.next().charAt(0);
        System.out.printf("nilai a = ");
        a = sc.nextInt();
        System.out.printf("nilai b = ");
        b = sc.nextInt();
        c = (float) a / b;
        System.out.println("hasil pembagian : " + a + " / " + b + " = " + c);

        sc.close();
    }

}