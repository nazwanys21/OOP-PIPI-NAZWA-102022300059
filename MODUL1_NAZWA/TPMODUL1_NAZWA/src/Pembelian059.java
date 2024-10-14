\import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian059 {
    public static void main(String[] args) {
        ArrayList<Penerbangan059> daftarPenerbangan = new ArrayList<>();
        daftarPenerbangan.add(new Penerbangan059("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000.0f));
        daftarPenerbangan.add(new Penerbangan059("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000.0f));

        Scanner scanner = new Scanner(System.in);
        int menu;
        Penumpang059 penumpang = null;
        Penerbangan059 pilihanPenerbangan = null;
        
        do {
            System.out.println("\n======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.println((i + 1) + ". ");
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                    }
                    break;
                case 2:
                    System.out.println("Silakan isi data diri anda terlebih dahulu!");
                    System.out.print("Masukan NIK: ");
                    String nik = scanner.next();
                    System.out.print("Masukan Nama Depan: ");
                    String namaDepan = scanner.next();
                    System.out.print("Masukan Nama Belakang: ");
                    String namaBelakang = scanner.next();
                    penumpang = new Penumpang059(nik, namaDepan, namaBelakang);

                    System.out.println("\nSilakan Pilih Tiket Penerbangan Yang Tersedia");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.println((i + 1) + ". ");
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                    }
                    System.out.print("\nPilih nomor penerbangan (ex: 1): ");
                    int nomorPenerbangan = scanner.nextInt();
                    pilihanPenerbangan = daftarPenerbangan.get(nomorPenerbangan - 1);
                    System.out.println("\nPemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
                    break;
                case 3:
                    if (penumpang != null && pilihanPenerbangan != null) {
                        System.out.println("======= Detail Tiket Penerbangan =======");
                        penumpang.tampilDaftarPenumpang();
                        pilihanPenerbangan.tampilDaftarPenerbangan();
                    } else {
                        System.out.println("Pembelian Tiket Tidak Ada");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia. Silahkan pilih menu lainnya.");
            }
        } while (menu != 4);
        
        scanner.close();
    }
}
