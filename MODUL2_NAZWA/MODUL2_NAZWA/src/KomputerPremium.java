public class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void informasi() {
        super.informasi();
        boolean ruangPrivat = true;
            while (ruangPrivat){
                System.out.println("Status: Member VIP");
                System.out.println("Benefit Member VIP");
                System.out.println("-Diskon 10% untuk bermain di atas 3 jam");
                System.out.println("-Gratis minuman setiap 4 jam bermain");
                System.out.println("-Prioritas booking komputer gaming");
            }
            ruangPrivat = false;
                System.out.println("Benefit Member VIP: jng ngarep benefit, maav:");
            }
    public void Pesan(int nomorKomputer){
        System.out.println("Memesan komputer nomor: " + nomorKomputer);
    }
    public void TambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan: " + makanan);
    }
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan: " + makanan + " dan " + "minuman: " + minuman);
    }
}
