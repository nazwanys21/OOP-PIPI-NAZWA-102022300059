public class KomputerVIP extends Komputer {
    protected boolean vipCard;
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public void informasi(){
        super.informasi();
        boolean vipCard = true;
            while (vipCard){
                System.out.println("Status: Member VIP");
                System.out.println("Benefit Member VIP");
                System.out.println("-Diskon 10% untuk bermain di atas 3 jam");
                System.out.println("-Gratis minuman setiap 4 jam bermain");
                System.out.println("-Prioritas booking komputer gaming");
            }
            vipCard = false;
                System.out.println("Benefit Member VIP: jng ngarep benefit, maav:");
            }
    
    public void Login(String Username){
        System.out.println("Login dengan username: " + Username);
    }
    public void Bermain(int jam) {
        System.out.println("Bermain selama" + jam + " jam");
    }
    public void Bermain(int jam, int menitTambahan){
        System.out.println("Nambah billing selama" + jam + " jam" + menitTambahan + " menit");
    }
}

