import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Selamat datang di Animal House!");
            System.out.println("1. Kucing");
            System.out.println("2. Burung");
            System.out.println("3. Exit");
            System.out.println("Silahkan pilih hewan: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: 
                    Kucing kucing = new Kucing("Molly", 5, "Persia");
                    System.out.println("Ini adalah Molly!");
                    kucing.suara();
                    kucing.makan();
                    kucing.makan("Tuna");
                    kucing.infoHewan();
                    break;
                
                case 2:
                    Burung burung = new Burung("Semar", 1, "Hijau");
                    System.out.println("Ini adalah Semar!");
                    burung.suara();
                    burung.makan();
                    burung.makan("biji-bijian");
                    burung.infoHewan();
                    break;
                case 3: 
                    exit = true;
                    System.out.println("Terima kasih sudah memilih hewan!");
                    break;
                default:
                    System.out.println("Pilihan hewan tidak ada di menu");
            }

        }
        scanner.close();
    }
}