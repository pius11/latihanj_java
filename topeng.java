public class topeng {
    public static void main(String[] args) {
        int rows = 5; // Tinggi topeng
        for (int i = 1; i <= rows; i++) {
            // Cetak spasi di setiap baris
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Cetak setengah bagian atas topeng
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            // Cetak spasi di setiap baris
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Cetak setengah bagian bawah topeng
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
