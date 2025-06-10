package Makanan;
public abstract class Makanan extends ItemMenu {
    protected int levelPedas;
    
    public Makanan(String nama,String kategori, int levelPedas){
        super(nama,kategori);
        this.levelPedas = levelPedas;
    }
    
    public void setLevelPedas(int lp){
        levelPedas = lp;
    }
    
    public int getLevelPedas(){
        return levelPedas;
    }
    
    double biayaLevelPedas(){
        return levelPedas * 2000;
    }

}
