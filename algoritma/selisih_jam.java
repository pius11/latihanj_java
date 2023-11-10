import java.text.Format;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class selisih_jam {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("masukan jam J1 (Format HH:mm:ss) : ");
        LocalTime J1 = LocalTime.parse(inp.nextLine());

        System.out.println("masukan jam J2 (Format HH:mm:ss) :");
        LocalTime J2 = LocalTime.parse(inp.nextLine());

        hitungSelisih(J1, J2);
    }
    // proses selisih

    static void hitungSelisih(LocalTime J1, LocalTime J2) {
        Duration durasi = Duration.between(J1, J2);
        long jam = durasi.toHours();
        long menit = durasi.toMinutes() % 60;
        long detik = durasi.toSeconds() % 60;
        System.out.println(String.format("%02d:%02d:%02d", jam, menit, detik));
    }
}
