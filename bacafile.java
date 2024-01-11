import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class bacafile {
    public static void main(String[] args) {
        String[] nimArray;
        String[] namaMhsarray;
        int [] umurArray;
        int [] nilaiUtsArray;
        int [] nilaiUasArray;

        try {
            //hitung baris jumlah baris dalam file untuk menentukan ukuran array

            int jumalhbaris = hitungJumlahBaris("data_mahasiswa.txt");
            
            //inisialisasi array
            nimArray = new String[jumalhbaris];
            namaMhsarray = new String[jumalhbaris];
            umurArray = new int[jumalhbaris];
            nilaiUtsArray = new int[jumalhbaris];
            nilaiUasArray = new int[jumalhbaris];

            //baca file dan isi array
            bacaFile("data_mahasiswa.txt", nimArray, namaMhsarray, umurArray, nilaiUtsArray, nilaiUasArray);
        
        //tampilkan hasil pembacaan
        System.out.println("data mahasiswa dari file: ");

        for (int i = 0; i < nilaiUasArray.length; i++) {
            System.out.println("nim: "+ nimArray[i]+
            ",nama: "+ namaMhsarray[i]+
            ",umur: "+ umurArray[i]+
            ",nilai uts: "+ nilaiUtsArray[i]+
            ",nilai uas: "+ nilaiUasArray[i]);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static int  hitungJumlahBaris(String namaFile) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(namaFile))){
            int jumlahBaris = 0;
            while (reader.readLine()!=null) {
                jumlahBaris++;
            }
            return jumlahBaris;
        }
    }

    private static void bacaFile(String namaFile, String[] nimArray, String[] namaMhsArray, int[] umurArray, int[] nilaiUtsArray, int[] nilaiUasArray) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))){
            String line ;
            int index = 0;
            //baca setiap baris dan isi array
            while ((line = reader.readLine())!= null) {
                String[] data = line.split("\t");

                nimArray[index] = data[0];
                namaMhsArray[index] = data[1];
                umurArray[index] = Integer.parseInt(data[2]);
                nilaiUtsArray[index] = Integer.parseInt(data[3]);
                nilaiUasArray[index] = Integer.parseInt(data[4]);
                
                
                index++;
                
            }
        }
    }
}
