import java.util.Scanner;

public class ifElseInString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("apakah kamu menyukai ku? ");
        String jawaban = inp.nextLine();

        if (jawaban.equals("ya"))  {
            System.out.println("yes maan cewek");
        } else {
            System.out.println("menjomblo lagi");
        }

    }
}
