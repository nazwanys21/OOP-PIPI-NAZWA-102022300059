public class Penumpang059 {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    public Penumpang059(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
    }
}
