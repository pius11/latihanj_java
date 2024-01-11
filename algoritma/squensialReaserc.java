import java.util.Scanner;

public class squensialReaserc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] arr = {
                20, 25, 30, 35, 40, 45, 38
        };

        System.out.println("nilai berapa yang ingin di cari");

        int nilaicari = inp.nextInt();
        liniersearch(nilaicari, arr);
        binarysearch(nilaicari, arr);
    }

    public static void liniersearch(int nilaicari, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + " input user " + nilaicari + " dicocokan dengan " + arr[i]);

            if (nilaicari == arr[i]) {
                System.out.println("nilai di temukan pada index ke " + i);
                break;
            }
        }
    }

    public static void binarysearch(int nilaicari, int[] arr) {
        int low = 0;
        int hight = arr.length;

        do {
            int mid = (low + hight) / 2;
            System.out.println("low " + low);
            System.out.println("hight " + hight);
            System.out.println("mid " + mid);

            if (arr[mid] == nilaicari) {
                System.out.println(" nilai di temukan ");
                break;

            } else if (arr[mid] > nilaicari) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        } while (hight >= low);
    }
}
