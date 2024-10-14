import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        Scanner scanner = new Scanner(System.in);
        int menu;
        while (true);
            System.out.println ("=====Menu Inventaris Makanan EAD=====");
            System.out.println ("1. Tambah Makanan Kering");
            System.out.println ("2. Tambah Makanan Basah");
            System.out.println ("3. Tambah Makanan Basah");
            System.out.println ("4. Keluar");
            System.out.println ("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();
        switch (menu) {
                case 1:
                    System.out.println("Masukkan Nama Makanan: ");
                    String name = scanner.nextLine();
                    System.out.println("Masukkan Jumlah Makana: ");
                    int jumlah = scanner.nextInt();
                    System.out.println("Masukkan Harga Makanan: ");
                    int harga = scanner.nextInt();
                    System.out.println("Masukkan Brand Makanan: ");
                    String brand = scanner.nextLine();
                    System.out.println("=======================");
                    System.out.println("Makanan Kering berhasil ditambahkan!");
        
                //case 2: 
                //case 3:
                case 4:
                System.out.println("Keluar dari program");
                break
        }
             

    }
}
