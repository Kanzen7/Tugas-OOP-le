package Makanan;

public class Pizza extends Makanan {
    private String ukuran;
    
    public Pizza(String nama, String kategori, int levelPedas,String ukuran){
        super(nama,kategori,levelPedas);
        this.ukuran = ukuran;
    }

    public void setUkuran(String u){
        ukuran = u;
    }
    public String getUkuran(){
        return ukuran;
    }
    
    double hitungHargaDasar(){
        double harga = biayaLevelPedas();
        switch (ukuran.toLowerCase()){
            case "small":
                harga += 25000;
                break;
            case "medium":
                harga += 35000;
                break;
            case "big":
                harga += 40000;
                break;
            default:
                harga += 25000;
                break;
        }
        return harga;
    }

    void infoItem(){
        System.out.println("Menu: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Level Pedas: " + levelPedas);
        System.out.println("Ukuran:" + ukuran);
        System.out.println("Harga: Rp" + hitungHargaDasar());
    }
}