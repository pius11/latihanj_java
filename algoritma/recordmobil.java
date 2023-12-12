public class recordmobil {
    public record mobilan(String nama,
            String merk,
            String warna,
            int harga) {

    };

    public static void main(String[] args) {
        mobilan mobil1 = new mobilan("avansa", "honda", "pink", 1000000000);
        mobilan mobil2 = new mobilan("toyota", "honda", "pink", 1000000000);
        mobilan mobil3 = new mobilan("kijang", "honda", "pink", 1000000000);
    System.out.println(mobil1);
    }


}
