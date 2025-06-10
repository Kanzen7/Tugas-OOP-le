package Makanan;

public class Salad extends Makanan {
    private String dressing;
    
    public Salad(String nama, String kategori, int levelPedas, String dressing){
        super(nama,kategori,levelPedas);
        this.dressing = dressing;
    }
    
    public void setDressing(String d){
        dressing = d;
    }

    public String getDressing(){
        return dressing;
    }

    double hitungHargaDasar(){
        double harga = 10000 + biayaLevelPedas();
        switch (dressing.toLowerCase()){
            case "Thousand Island":
                harga += 3000;
                break;
            case "Caesar":
                harga += 4000;
                break;
            case "Italian":
                harga += 3500;
                break;
            case "Honey Mustard":
                harga += 4000;
                break;
            case "Ranch":
                harga += 4500;
                break;
            default:
                harga += 3000;
                break;
        }
        return harga;
    }

    void infoItem(){
        System.out.println("Menu: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Level Pedas: " + levelPedas);
        System.out.println("Dressing:" + dressing);
        System.out.println("Harga: Rp" + hitungHargaDasar());
    }
}