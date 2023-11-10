public class forLoop {
    public static void main(String[] args) {
        String a = "*";
        int rows = 5;
        // for (int j = 0; j < rows; j++) {
        // for (int i = 0; i <= rows; i++) {
        // System.out.println();
        // }
        // System.out.print("*");
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.printf(a);
        // }

        // int rows = 10;
        // for (int i = 0; i < rows; i++) {
        // for (int j = rows - 1; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k <= i; k++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
