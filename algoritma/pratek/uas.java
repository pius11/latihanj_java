package pratek;

import java.util.Scanner;

public class uas {
    // Array untuk binary search
    public static int[] array = { 1, 2, 3, 4, 5 };
    // Array untuk insertion sort descending
    public static int[] array2 = { 5, 1, 2, 3, 4 };
    // Konstanta untuk ukuran maksimal stack dan queue
    public static final int MAX_SIZE = 5;
    // Array untuk stack
    public static int[] arr = new int[MAX_SIZE];
    // Array untuk queue
    public static int[] arr2 = new int[MAX_SIZE];
    // Pointer atas (top) untuk stack
    private static int top = -1;
    // Pointer depan dan belakang untuk queue
    private static int front = -1, rear = -1;

    // nama : i wayan pius wiprajana samita
    // nim : 2315354034
    // kelas : 1B TRPL
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int choice;
        do {
            // Tampilan menu utama
            System.out.println("HOME MENU");
            System.out.println("======================================================");
            System.out.println("1. Binary search");
            System.out.println("2. Insertion sort descending");
            System.out.println("3. Stack");
            System.out.println("4. Queue");
            System.out.println("0. Exit");
            System.out.print("=> ");
            choice = inp.nextInt();
            inp.nextLine();

            switch (choice) {
                case 1:
                    // Pilihan 1: Binary Search
                    System.out.println("Masukkan nilai yang ingin dicari:");
                    System.out.print("=> ");
                    int nilaiCari = inp.nextInt();
                    int result = binarySearch(nilaiCari);
                    if (result == -1) {
                        System.out.println("Data tidak ditemukan");
                    } else {
                        System.out.println("Data ditemukan pada index ke " + result);
                    }
                    break;
                case 2:
                    // Pilihan 2: Insertion Sort Descending
                    insertiondes();
                    break;
                case 3:
                    // Pilihan 3: Stack
                    stackMenu(inp);
                    break;
                case 4:
                    // Pilihan 4: Queue
                    queueMenu(inp);
                    break;
                case 0:
                    // Pilihan 0: Keluar dari program
                    System.out.println("Terimakasih, program shutdown");
                    break;
                default:
                    System.out.println("Masukan tidak ditemukan");
                    break;
            }

        } while (choice != 0);
    }

    // Subprogram binary search
    public static int binarySearch(int nilaiCari) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == nilaiCari) {
                return mid;
            } else if (array[mid] < nilaiCari) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Subprogram insertion sort descending
    public static void insertiondes() {
        int n = array2.length;
        for (int i = 0; i < n; i++) {
            int key = array2[i];
            int j = i - 1;
            while (j >= 0 && array2[j] < key) {
                array2[j + 1] = array2[j];
                j = j - 1;
            }
            array2[j + 1] = key;
            int halo = key;
            System.out.print("Hasil Insertion Sort Descending: ");
        for (int k : array2) {
            System.out.print(k + " ");
        }
        System.out.println();
        }
        // Menampilkan hasil insertion sort
        
    }

    // Subprogram untuk menu stack
    public static void stackMenu(Scanner inp) {
        int choice;

        do {
            // Tampilan menu stack
            System.out.println("STACK MENU");
            System.out.println("============================================");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Is Full");
            System.out.println("4. Is Empty");
            System.out.println("5. Reverse");
            System.out.println("6. show data");
            System.out.println("0. Back to Home Menu");
            System.out.print("=> ");
            choice = inp.nextInt();
            inp.nextLine();

            switch (choice) {
                case 1:
                    // Pilihan 1: Push
                    System.out.println("Masukkan data:");
                    System.out.print("=>");
                    int elemen = inp.nextInt();
                    if (!isFullStack()) {
                        stackPush(elemen);
                        System.out.println(elemen + " data berhasil ditambahkan");
                    } else {
                        System.out.println("Stack penuh, tidak dapat menambahkan data lagi");
                    }
                    break;
                case 2:
                    // Pilihan 2: Pop
                    int elemenPop = stackPop();
                    if (elemenPop != -1) {
                        System.out.println("Data " + elemenPop + " telah keluar/pop dari stack");
                    } else {
                        System.out.println("Stack kosong, push data terlebih dahulu");
                    }
                    break;
                case 3:
                    // Pilihan 3: Is Full
                    if (isFullStack()) {
                        System.out.println("Data sudah penuh");
                    } else {
                        System.out.println("Data belum penuh");
                    }
                    break;
                case 4:
                    // Pilihan 4: Is Empty
                    if (isEmptyStack()) {
                        System.out.println("Data kosong");
                    } else {
                        System.out.println("Data tidak kosong");
                    }
                    break;
                case 5:
                    // Pilihan 5: Reverse Stack
                    reverseStack();
                    System.out.println("Stack berhasil di-reverse");
                    break;
                case 6:
                    showStack();
                    break;
                case 0:
                    // Pilihan 0: Kembali ke menu utama
                    System.out.println("Kembali ke home menu");
                    break;
                default:
                    System.out.println("Masukan tidak ditemukan");
                    break;
            }
        } while (choice != 0);
    }

    // Subprogram stack push
    public static void stackPush(int elemen) {

        arr[++top] = elemen;

    }

    // Subprogram stack pop
    public static int stackPop() {
        if (!isEmptyStack()) {
            return arr[top--];
        } else {
            return -1; // Jika stack kosong
        }
    }

    // Subprogram stack is empty
    public static boolean isEmptyStack() {
        return top == -1;
    }

    // Subprogram stack is full
    public static boolean isFullStack() {
        return top == MAX_SIZE - 1;
    }

    // Subprogram reverse stack
    public static void reverseStack() {
        int[] tempArray = new int[MAX_SIZE];
        int tempTop = -1;
        // Mengeluarkan elemen dari stack dan menyimpannya dalam array sementara
        while (!isEmptyStack()) {
            int elemen = stackPop();
            tempArray[++tempTop] = elemen;
        }

        System.out.println("Hasil Reverse Stack:");
        // Menambahkan kembali elemen ke stack dan menampilkan hasilnya
        while (tempTop != -1) {
            int elemen = tempArray[tempTop--];
            stackPush(elemen);
            System.out.print(elemen + " ");
        }
        System.out.println();
    }

    public static void showStack() {
        System.out.println("show data");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Subprogram untuk menu queue
    public static void queueMenu(Scanner inp) {
        int choice;

        do {
            // Tampilan menu queue
            System.out.println("QUEUE MENU");
            System.out.println("============================================");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Is Full");
            System.out.println("4. Is Empty");
            System.out.println("5. Reverse");
            System.out.println("6. show data");
            System.out.println("0. Back to Home Menu");
            System.out.print("=> ");
            choice = inp.nextInt();
            inp.nextLine();

            switch (choice) {
                case 1:
                    // Pilihan 1: Enqueue
                    System.out.println("masukan data");
                    System.out.print("=> ");
                    int elemen = inp.nextInt();
                    int queueResult = enqueue(elemen);

                    if (queueResult == 0) {
                        System.out.println(elemen + " data berhasil di tambahkan");
                    } else {
                        System.out.println("Queue penuh, tidak dapat menambahkan data lagi");
                    }
                    break;
                case 2:
                    // Pilihan 2: Dequeue
                    int elemenDequeue = dequeue();
                    if (elemenDequeue != -1) {
                        System.out.println("Data " + elemenDequeue + " telah keluar/dequeue dari queue");
                    } else {
                        System.out.println("Queue kosong, enqueue data terlebih dahulu");
                    }
                    break;
                case 3:
                    // Pilihan 3: Is Full
                    if (isFullQueue()) {
                        System.out.println("Data sudah penuh");
                    } else {
                        System.out.println("Data belum penuh");
                    }
                    break;
                case 4:
                    // Pilihan 4: Is Empty
                    if (isEmptyQueue()) {
                        System.out.println("Data kosong");
                    } else {
                        System.out.println("Data tidak kosong");
                    }
                    break;
                case 5:
                    // Pilihan 5: Reverse Queue
                    reverseQueue();
                    System.out.println("Queue berhasil di-reverse");
                    break;
                case 6:
                    // Pilihan 5: Reverse Queue
                    showQueue();
                    break;
                case 0:
                    // Pilihan 0: Kembali ke menu utama
                    System.out.println("Kembali ke home menu");
                    break;
                default:
                    System.out.println("Masukan tidak ditemukan");
                    break;
            }
        } while (choice != 0);
    }

    // Subprogram enqueue
    public static int enqueue(int elemen) {
        if (!isFullQueue()) {
            // Jika queue masih memiliki kapasitas dan front belum diatur, atur front ke
            // angka selanjutnya
            if (front == -1) {
                front = 0;
            }
            // Menentukan indeks rear untuk menambahkan elemen menggunakan operator modulus
            rear = (rear + 1) % MAX_SIZE;
            arr2[rear] = elemen;

            return 0;

        } else {

            return -1;
        }
    }

    // Subprogram dequeue
    public static int dequeue() {
        if (!isEmptyQueue()) {
            int elemen = arr2[front];
            // Memeriksa apakah front dan rear berada di elemen terakhir (queue hanya
            // memiliki satu elemen)
            if (front == rear) {
                front = rear = -1;
            } else {
                // Jika tidak, memindahkan front ke elemen selanjutnya
                front = (front + 1) % MAX_SIZE;
            }
            return elemen;
        } else {
            return -1; // Jika queue kosong
        }
    }

    // Subprogram is full queue
    public static boolean isFullQueue() {
        return (front == 0 && rear == MAX_SIZE - 1) || (front == rear + 1);
    }

    // Subprogram is empty queue
    public static boolean isEmptyQueue() {
        return front == -1;
    }

    // Subprogram untuk operasi Reverse Queue
    private static void reverseQueue() {
        int[] tempArray = new int[MAX_SIZE];
        int tempFront = front;
        int tempRear = rear;

        // Mengeluarkan data dari queue dan memasukkan ke dalam array sementara
        while (!isEmptyQueue()) {
            int element = dequeue();
            tempArray[tempRear] = element;
            // Memeriksa apakah front dan rear berada pada elemen terakhir
            if (tempFront == tempRear) {
                break;
            }
            // Memindahkan rear ke indeks sebelumnya (untuk memasukkan dari belakang ke
            // depan)
            tempRear = (tempRear - 1 + MAX_SIZE) % MAX_SIZE;
        }
        System.out.println("Queue setelah di-reverse:");
        // Memasukkan data dari array sementara ke dalam queue (dari belakang ke depan)
        for (int i = 0; i < MAX_SIZE; i++) {
            if (tempArray[i] != 0) {
                System.out.print(tempArray[i] + " ");
                enqueue(tempArray[i]); // Memasukkan kembali data ke dalam queue
            }
        }
        System.out.println();
    }

    public static void showQueue() {
        System.out.println("show data");
        // Memeriksa apakah queue kosong
        if (!isEmptyQueue()) {
            int current = front;
            // Melakukan loop untuk menampilkan data dari front hingga rear
            do {
                System.out.print(arr2[current] + " ");
                current = (current + 1) % MAX_SIZE;
            } while (current != (rear + 1) % MAX_SIZE); // Loop hingga mencapai rear+1 untuk menampilkan semua data
        } else {
            // Jika queue kosong, cetak pesan "Queue kosong"
            System.out.println("Queue kosong");
        }
        System.out.println(); // Pindah ke baris baru setelah menampilkan data queue
    }

}
