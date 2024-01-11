import java.util.Stack;

public class StackReverseExample {

    public static void main(String[] args) {
        // Membuat objek stack
        Stack<Integer> stack = new Stack<>();

        // Menambah elemen-elemen ke dalam stack
        stack.push(2);
        stack.push(6);
        stack.push(9);
        stack.push(1);
        stack.push(4);
        stack.push(8);

        // Menampilkan elemen-elemen dalam stack sebelum pembalikan
        System.out.println("Elemen-elemen dalam stack sebelum pembalikan: " + stack);

        // Memanggil metode untuk membalikkan stack
        reverseStack(stack);

        // Menampilkan elemen-elemen dalam stack setelah pembalikan
        System.out.println("Elemen-elemen dalam stack setelah pembalikan: " + stack);
    }

    // Metode untuk membalikkan elemen-elemen dalam stack tanpa menggunakan stack sementara
    private static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack kosong. Tidak dapat melakukan pembalikan.");
            return;
        }

        // Menggunakan rekursi untuk membalikkan elemen-elemen dalam stack
        int elemen = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, elemen);
    }

    // Metode untuk memasukkan elemen di bagian bawah stack
    private static void insertAtBottom(Stack<Integer> stack, int elemen) {
        if (stack.isEmpty()) {
            stack.push(elemen);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, elemen);
            stack.push(temp);
        }
    }
}
