import java.util.Scanner;

public class searcing {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] data = null;
        while (true) {
            System.out.println("\n1. Input Data\n2. Search Data\n3. Reset Data\n4. Exit");
            System.out.print("Choose an option: ");
            int option = inp.nextInt();
            inp.nextLine(); // consume newline left-over

            switch (option) {
                case 1:
                    data = indata(inp);
                    break;
                case 2:
                    if (data != null) {
                        searcingdata(inp, data);
                    } else {
                        System.out.println("No data available. Please input data first.");
                    }
                    break;
                case 3:
                    if (data != null) {
                        data = resetdata(data);
                    } else {
                        System.out.println("No data available to reset.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    inp.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            continue;
        }
    }


    public static int[] indata(Scanner inp) {
        System.out.println("masukan jumlah data :");
        int jumlahdata = inp.nextInt();
        int[] inputdata= new int [jumlahdata];
        for (int i = 0; i < jumlahdata; i++) {
            System.out.println("masukan data ke " + (i+1));
            inputdata[i] = inp.nextInt();
            
        }
        return inputdata;
        
        
        
    }

    public static void searcingdata(Scanner inp, int [] data) {
        System.out.println("masukan data yang ingin di cari :");
        int searc = inp.nextInt();
        boolean found  = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searc) {
                if (data[1] == 0) {
                    System.out.println("tidak memiliki data, disarankan memasukan data terlebih dahulu");
                }else{
                System.out.println("data "+ searc +"di temukan di index ke " + (i+1));
                found = true;
                break;
            } 
        }
        }
        if (!found) {
            System.out.println("data tidak ditemukan");
        }

    }

public static int[] resetdata(int[] data) {
    data = new int[0];
    System.out.println("data berhasil di reset");
    return data;
}

}
