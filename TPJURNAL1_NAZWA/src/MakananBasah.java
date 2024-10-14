
// Don't delete any comments below!!!

public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String namabsh;
    private int jumlahbsh;
    private double hargabsh;
    private String brandbsh;
    // Todo : Create Constructor of MakananKering
    public MakananKering(String nama, int jumlah, double hargabsh, String brandbsh) {
        this.namabsh = namabsh;
        this.jumlahbsh = jumlahbsh;
        this.hargabsh = hargabsh;
        this.brandbsh = brandbsh;
    }
    // Todo : Create Getter and Setter
    public String getNamabsh (){
        return namabsh;
    }
    public void setNamabsh (String namabsh){
        this.namabsh = namabsh;
    }
    public String getJumlah (){
        return jumlahbsh;
    }
    public void setJumlah (int jumlahbsh){
        this.jumlahbsh = jumlahbsh;
    }
    public double getHargabsh (){
        return hargabsh;
    }
    public void setHargabsh (double hargabsh){
        this.hargabsh = hargabsh;
    }
    public String getBrandbsh (){
        return brandbsh;
    }
    public void setBrandbsh (String brandbsh){
        this.brandbsh = brandbsh;
    }
    // Todo : Create Method ShowData
    public void display (){
        System.out.println("Nama Makanan Basah: " + namabsh + "\n Jumlah: " + jumlahbsh + "\nHarga: " + hargabsh + "\n Nama Brand: " + brandbsh);
        }
    }


    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)

    // Todo : Create Constructor of MakananBasah

    // Todo : Create Getter and Setter

    // Todo : Create Method ShowData
