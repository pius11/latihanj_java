import java.util.Scanner;

public class rekursifFibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println("Deret Fibonacci:");
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else {
            return 1;
        }
    }
}
