package Makanan;

public class MakananMain {
    public static void main(String[] args) {
        ItemMenu[] daftar = new ItemMenu[5];

        daftar[0] = new NasiGoreng("Nasi Goreng Spesial", "Makanan Utama", 3, true);
        daftar[1] = new NasiGoreng("Nasi Goreng Biasa", "Makanan Utama", 2, false);
        daftar[2] = new NasiGoreng("Nasi Goreng Seafood", "Makanan Utama", 4, true);
        daftar[3] = new Pizza("Pizza Mozarella Cheese", "Makanan Utama", 2,"big");
        daftar[4] = new Salad("Salad Buah", "Makanan Utama", 2,"Thousand Island");
        
        
        for (ItemMenu item : daftar) {
            item.infoItem();
            System.out.println();
        }
    }
}