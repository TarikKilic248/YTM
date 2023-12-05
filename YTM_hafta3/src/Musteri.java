public class Musteri extends Kullanici{
    private int tc;

    public Musteri(String isim, int yas, String mail, int tc) {
        super(isim, yas, mail);
        setTc(tc);
        System.out.println("Musteri olusturuldu");
    }

    public void urunGoruntule(){
        System.out.println("Urunler goruntulendi");
    }

    public double getTc(){
        return tc;
    }

    public void setTc(int tc){
        this.tc = tc;
    }
}
