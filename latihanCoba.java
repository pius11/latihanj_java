import java.util.Scanner;

public class latihanCoba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data (ketik 'stop' untuk berhenti):");

        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = -1;
        int index = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("stop")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;

                if (number > maxNumber) {
                    maxNumber = number;
                    maxIndex = index;
                }

                index++;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka atau 'stop'.");
            }
        }

        System.out.println("Jumlah seluruh data: " + sum);
        System.out.println("Nilai data terbesar: " + maxNumber);
        System.out.println("Indeks data terbesar: " + index);
    }
}
