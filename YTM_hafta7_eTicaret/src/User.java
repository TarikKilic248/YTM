import java.util.ArrayList;

public abstract class User {
    private Sepet sepet;
    public User(){
        sepet=new Sepet();
    }

    public Sepet getSepet() {
        return sepet;
    }
    public void setSepet(Sepet sepet) {
        this.sepet = sepet;
    }
    public abstract double indirimHesapla(double fiyat);
}

class Standart extends User{
    public  double indirimHesapla(double fiyat){
        return  fiyat;
    }
}
class Premium extends User{
    @Override
    public  double indirimHesapla(double fiyat){
        return fiyat*0.9;
    }
}
class Urun{
    private String isim;
    private double fiyat;

    public Urun(String isim, double fiyat) {
        setIsim(isim);
        setFiyat(fiyat);
    }

    public String getIsim() {
        return isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
class Sepet{
    private ArrayList<Urun> urunler;
    public Sepet(){
        urunler=new ArrayList<>();
    }
    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
    public void urunCikar(Urun urun){
        urunler.remove(urun);
    }

    public ArrayList<Urun> getUrunler() {
        return urunler;
    }
}

class Odeme{
    public void odemeYap(User user){
        double toplamTutar=0;
        for (Urun urun: user.getSepet().getUrunler()){
            toplamTutar+= urun.getFiyat();
        }
        toplamTutar=user.indirimHesapla(toplamTutar);
        System.out.println(toplamTutar);
    }
}