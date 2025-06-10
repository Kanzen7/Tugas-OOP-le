package Makanan;

public class NasiGoreng extends Makanan{
    private boolean ekstraTelur;
    
    public NasiGoreng(String nama, String kategori,int levelPedas, boolean ekstraTelur){
        super(nama,kategori,levelPedas);
        this.ekstraTelur = ekstraTelur;
    }

    public void setEkstraTelur(boolean et){
        ekstraTelur = et;
    }

    public boolean getEkstraTelur(){
        return ekstraTelur;
    }
    
    public double hitungHargaDasar(){
        double harga = 15000 + biayaLevelPedas();
        if (ekstraTelur){
            harga += 4000;
        }
        return harga;
    }

    void infoItem(){
        System.out.println("Menu: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Level Pedas: " + levelPedas);
        System.out.println("Ekstra Telur: " + (ekstraTelur ? "Ya" : "Tidak"));
        System.out.println("Harga: Rp" + hitungHargaDasar());
    }
}
