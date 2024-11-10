public class Kucing extends Hewan{
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }
    @Override
    public void suara() {
        System.out.println(getNama() + " mengeong.");
    }
    public void infoHewan() {
        System.out.println("===== Biodata Hewan Kucing =====");
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur() + " tahun" );
        System.out.println("Ras : " + ras);
    }
}