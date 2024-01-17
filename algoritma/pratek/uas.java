package pratek;

import java.util.Scanner;


public class uas {
    public static int[] array = { 1, 2, 3, 4, 5 };// untuk binarysearch
    public static int[] array2 = { 2, 1, 5, 3, 4 };// untuk insertion descending
    public static final int MAX_SIZE = 5;
    public static int[] arr = new int[MAX_SIZE];// untuk stack
    public static int[] arr2 = new int[MAX_SIZE];// untuk queue
    private static int top = -1; // Untuk stack
    private static int front = -1, rear = -1; // Untuk queue

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int choice;
        do {

            System.out.println("HOME MENU");
            System.out.println("======================================================");
            System.out.println("1. Binary search");
            System.out.println("2. Insertion sort descending");
            System.out.println("3. Stack");
            System.out.println("4. Queue");
            System.out.println("0. Exit");

            choice = inp.nextInt();
            inp.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("masuka nilai yang ingin di cari");
                    int nilaicari = inp.nextInt();
                    int result = binarySearch(nilaicari);
                    if (result == -1) {
                        System.out.println("data tidak ditemukan");
                    } else {
                        System.out.println("data di temukan pada index ke " + result);
                    }
                    break;
                case 2:
                    insertiondes();
                    break;
                case 3:
                    stackMenu(inp);
                    break;
                case 4:
                    queueMenu(inp);
                    break;
                case 0:
                    System.out.println("terimakasi, program shut down");
                    break;

                default:
                    System.out.println("masukan tidak ditemukan");
                    break;
            }

        } while (choice != 0);
    }

    // binarysearch
    public static int binarySearch(int nilaicari) {

        int low = 0;
        int hight = array.length - 1;

        while (low <= hight) {
            int mid = (low + hight) / 2;

            if (array[mid] == nilaicari) {
                return mid;
            } else if (array[mid] < nilaicari) {
                low = mid + 1;
            } else {
                hight = mid - 1;
            }
        }
        return -1;
    }

    // insertiondes
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

        }
        for (int k : array2) {
            System.out.print(k + " ");

        }
        System.out.println();
    }

    // stack menu

    public static void stackMenu(Scanner inp) {
        int choise;

        do {
            System.out.println("STACK MENU");
            System.out.println("============================================");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Is full");
            System.out.println("4. Is empty");
            System.out.println("5. Revers");
            System.out.println("0. Back to home menu");
            choise = inp.nextInt();
            inp.nextLine();

            switch (choise) {
                case 1:
                    System.out.println("masukan data");
                    int elemen = inp.nextInt();
                    stackPush(elemen);
                    System.out.println(elemen + " data berhasil di tambahkan");
                    break;
                case 2:
                    int elemenPop = stackPop();
                    if (elemenPop != -1) {
                        System.out.println("data " + elemenPop + " telah kelua/pop dari stack");
                    } else {
                        System.out.println("stack kosong, push data terlebih dahulu");
                    }
                    break;
                case 3:
                    if (isFullStack()) {
                        System.out.println("data sudah penuh");
                    } else {
                        System.out.println("data belum penuh");
                    }
                    break;
                case 4:
                    if (isEmptyStack()) {
                        System.out.println("data kosong");
                    } else {
                        System.out.println("data tidak kosong");
                    }
                    break;
                case 5:
                    reverseStack();
                    System.out.println("stack berhasil di revers");
                    break;
                case 0:
                    System.out.println(" back to home menu ");
                    break;

                default:
                    System.out.println("masukan tidak di temukan");
                    break;
            }
        } while (choise != 0);
    }

    // stack program

    // stack push

    public static void stackPush(int elemen) {

        if (!isFullStack()) {
            arr[++top] = elemen;

        } else {
            System.out.println("stack penuh, tidak dapat menambhakan data lagi");
        }

    }

    // pop

    public static int stackPop() {

        if (!isEmptyStack()) {
            return arr[top--];

        } else {
            return -1; // jika stack kosong
        }
    }

    // is empty
    public static boolean isEmptyStack() {
        return top == -1;
    }

    // is full
    public static boolean isFullStack() {
        return top == MAX_SIZE - 1;
    }

    // reverse stack

    public static void reverseStack() {
        int[] tempArray = new int[MAX_SIZE];
        int temtop = -1;

        while (!isEmptyStack()) {
            int elemen = stackPop();
            tempArray[++temtop] = elemen;
        }
        System.out.println("hasil revese: ");
        while (temtop != -1) {
            int elemen = tempArray[temtop--];
            stackPush(elemen);
            System.out.println(elemen + " ");
        }
        System.out.println();
    }

    // queue menu
    public static void queueMenu(Scanner inp) {
        int choise;

        do {
            System.out.println("QUEUE MENU");
            System.out.println("============================================");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Is full");
            System.out.println("4. Is empty");
            System.out.println("5. Revers");
            System.out.println("0. Back to home menu");
            choise = inp.nextInt();
            inp.nextLine();

            switch (choise) {
                case 1:
                    System.out.println("masukan data");
                    int elemen = inp.nextInt();
                    enqueue(elemen);
                    if (!isFullQueue()) {
                        System.out.println(elemen + " data berhasil di tambahkan");
                    } else {
                        System.out.println("queue penuh, tidak dapat menambah kan data lagi");
                    }
                    break;
                case 2:
                    int elemenDequeue = dequeue();
                    if (elemenDequeue != -1) {
                        System.out.println("data " + elemenDequeue + " telah kelua/dequeue dari queue");
                    } else {
                        System.out.println("queue kosong, push data terlebih dahulu");
                    }
                    break;
                case 3:
                    if (isFullQueue()) {
                        System.out.println("data sudah penuh");
                    } else {
                        System.out.println("data belum penuh");
                    }
                    break;
                case 4:
                    if (isEmptyQueue()) {
                        System.out.println("data kosong");
                    } else {
                        System.out.println("data tidak kosong");
                    }
                    break;
                case 5:
                    reverseQueue();
                    System.out.println("stack berhasil di revers");
                    break;
                case 0:
                    System.out.println(" back to home menu ");
                    break;

                default:
                    System.out.println("masukan tidak di temukan");
                    break;
            }
        } while (choise != 0);
    }

    // enqueue
    public static void enqueue(int elemen) {
        if (!isFullQueue()) {
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % MAX_SIZE;
            array2[rear] = elemen;
        }
    }

    // dequeue
    public static int dequeue() {
        if (!isEmptyQueue()) {
            int elemen = array2[front];

            if (front == rear) {
                front = rear = -1;

            } else {
                front = (front + 1) % MAX_SIZE;
            }
            return elemen;
        } else {

            return -1;
        }
    }

    // is full queue
    public static boolean isFullQueue() {
        return (front == 0 && rear == MAX_SIZE - 1) || (front == rear + 1);

    }

    // is empty queue

    public static boolean isEmptyQueue() {
        return front == -1;

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

        System.out.println("Queue setelah di-reverse:");
        for (int i = 0; i < MAX_SIZE; i++) {
            if (tempArray[i] != 0) {
                enqueue(tempArray[i]);
                System.out.print(tempArray[i] + " ");
            }
        }
        System.out.println();
    }

}
