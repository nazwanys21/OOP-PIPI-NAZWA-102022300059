public class Burung extends Hewan{
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void suara() {
        System.out.println(getNama() + " berkicau.");
    }
    public void infoHewan() {
        System.out.println("===== Biodata Hewan Burung =====");
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur() + " tahun");
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
