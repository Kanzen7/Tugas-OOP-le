package Makanan;

public abstract class ItemMenu {
    protected String nama,kategori;
    
    public ItemMenu (String nama,String kategori){
        this.nama = nama;
        this.kategori = kategori;
    }
    
    public void setNama(String n){
        nama = n;
    }
    public void setKategori(String k){
        kategori = k;
    }
    
    public String getNama(){
        return nama;
    }
    public String getKategori(){
        return kategori;
    }
    
    abstract double hitungHargaDasar();
    
    void infoItem(){
        System.out.println("Nama\t = " + nama);
        System.out.println("Kategori\t = " + kategori);
    }
}
