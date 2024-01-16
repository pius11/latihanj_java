import java.util.Scanner;

public class referensiuas {

    private static final int MAX_SIZE = 10;
    private static int[] array = new int[MAX_SIZE];
    private static int top = -1; // Untuk stack
    private static int front = -1, rear = -1; // Untuk queue

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu Program:");
            System.out.println("1. Binary Search");
            System.out.println("2. Insertion Sort Descending");
            System.out.println("3. Push (Stack)");
            System.out.println("4. Pop (Stack)");
            System.out.println("5. Is Empty (Stack)");
            System.out.println("6. Is Full (Stack)");
            System.out.println("7. Reverse Stack");
            System.out.println("8. Enqueue (Queue)");
            System.out.println("9. Dequeue (Queue)");
            System.out.println("10. Is Empty (Queue)");
            System.out.println("11. Is Full (Queue)");
            System.out.println("12. Reverse Queue");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu (0-12): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Operasi Binary Search
                    System.out.print("Masukkan elemen yang dicari: ");
                    int key = scanner.nextInt();
                    int result = binarySearch(array, key);
                    if (result == -1) {
                        System.out.println("Elemen tidak ditemukan.");
                    } else {
                        System.out.println("Elemen ditemukan pada indeks: " + result);
                    }
                    break;

                case 2:
                    // Operasi Insertion Sort Descending
                    insertionSortDescending(array);
                    System.out.println("Array setelah diurutkan secara descending: ");
                    printArray(array);
                    break;

                case 3:
                    // Operasi Push (Stack)
                    System.out.print("Masukkan elemen yang akan di-push: ");
                    int elemenPush = scanner.nextInt();
                    push(elemenPush);
                    System.out.println("Elemen " + elemenPush + " telah di-push ke dalam stack.");
                    break;

                case 4:
                    // Operasi Pop (Stack)
                    int elemenPop = pop();
                    if (elemenPop != -1) {
                        System.out.println("Elemen " + elemenPop + " telah di-pop dari stack.");
                    } else {
                        System.out.println("Stack kosong. Tidak dapat melakukan pop.");
                    }
                    break;

                case 5:
                    // Operasi Is Empty (Stack)
                    if (isEmptyStack()) {
                        System.out.println("Stack kosong.");
                    } else {
                        System.out.println("Stack tidak kosong.");
                    }
                    break;

                case 6:
                    // Operasi Is Full (Stack)
                    if (isFullStack()) {
                        System.out.println("Stack penuh.");
                    } else {
                        System.out.println("Stack tidak penuh.");
                    }
                    break;

                case 7:
                    // Operasi Reverse Stack
                    reverseStack();
                    System.out.println("Stack berhasil di-reverse.");
                    break;

                case 8:
                    // Operasi Enqueue (Queue)
                    System.out.print("Masukkan elemen yang akan di-enqueue: ");
                    int elemenEnqueue = scanner.nextInt();
                    enqueue(elemenEnqueue);
                    System.out.println("Elemen " + elemenEnqueue + " telah di-enqueue ke dalam queue.");
                    break;

                case 9:
                    // Operasi Dequeue (Queue)
                    int elemenDequeue = dequeue();
                    if (elemenDequeue != -1) {
                        System.out.println("Elemen " + elemenDequeue + " telah di-dequeue dari queue.");
                    } else {
                        System.out.println("Queue kosong. Tidak dapat melakukan dequeue.");
                    }
                    break;

                case 10:
                    // Operasi Is Empty (Queue)
                    if (isEmptyQueue()) {
                        System.out.println("Queue kosong.");
                    } else {
                        System.out.println("Queue tidak kosong.");
                    }
                    break;

                case 11:
                    // Operasi Is Full (Queue)
                    if (isFullQueue()) {
                        System.out.println("Queue penuh.");
                    } else {
                        System.out.println("Queue tidak penuh.");
                    }
                    break;

                case 12:
                    // Operasi Reverse Queue
                    reverseQueue();
                    System.out.println("Queue berhasil di-reverse.");
                    break;

                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }

        } while (choice != 0);

        scanner.close();
    }

    // Metode untuk operasi Binary Search
    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Jika elemen tidak ditemukan
    }

    // Metode untuk operasi Insertion Sort Descending
    private static void insertionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Metode untuk menampilkan array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Metode untuk operasi Push (Stack)
    private static void push(int element) {
        if (!isFullStack()) {
            array[++top] = element;
        } else {
            System.out.println("Stack penuh. Tidak dapat melakukan push.");
        }
    }

    // Metode untuk operasi Pop (Stack)
    private static int pop() {
        if (!isEmptyStack()) {
            return array[top--];
        } else {
            return -1; // Jika stack kosong
        }
    }

    // Metode untuk operasi Is Empty (Stack)
    private static boolean isEmptyStack() {
        return top == -1;
    }

    // Metode untuk operasi Is Full (Stack)
    private static boolean isFullStack() {
        return top == MAX_SIZE - 1;
    }

    // Metode untuk operasi Reverse Stack
    private static void reverseStack() {
        int[] tempArray = new int[MAX_SIZE];
        int tempTop = -1;

        while (!isEmptyStack()) {
            int element = pop();
            tempArray[++tempTop] = element;
        }

        while (tempTop != -1) {
            int element = tempArray[tempTop--];
            push(element);
        }
    }

    // Metode untuk operasi Enqueue (Queue)
    private static void enqueue(int element) {
        if (!isFullQueue()) {

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % MAX_SIZE;
            array[rear] = element;
        } else {
            System.out.println("Queue penuh. Tidak dapat melakukan enqueue.");
        }
    }

    // Metode untuk operasi Dequeue (Queue)
    private static int dequeue() {
        if (!isEmptyQueue()) {
            int element = array[front];

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % MAX_SIZE;
            }

            return element;
        } else {
            return -1; // Jika queue kosong
        }
    }

    // Metode untuk operasi Is Empty (Queue)
    private static boolean isEmptyQueue() {
        return front == -1;
    }

    // Metode untuk operasi Is Full (Queue)
    private static boolean isFullQueue() {
        return (front == 0 && rear == MAX_SIZE - 1) || (front == rear + 1);
    }

    // Metode untuk operasi Reverse Queue
    private static void reverseQueue() {
        int[] tempArray = new int[MAX_SIZE];
        int tempFront = front;
        int tempRear = rear;

        while (!isEmptyQueue()) {
            int element = dequeue();
            tempArray[tempRear] = element;

            if (tempFront == tempRear) {
                break;
            }

            tempRear = (tempRear - 1 + MAX_SIZE) % MAX_SIZE;
        }

        front = tempFront;
        rear = tempRear;

        for (int i = 0; i < MAX_SIZE; i++) {
            if (tempArray[i] != 0) {
                enqueue(tempArray[i]);

                System.out.println(tempArray[i]+" ");
            }

        }
        System.out.println();
    }

}
