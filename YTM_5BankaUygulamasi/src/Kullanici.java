public class Kullanici {
    private String isim;
    private int kimlik;
    private int TL;

    public Kullanici(String isim, int kimlik, int TL) {
        setIsim(isim);
        setKimlik(kimlik);
        setTL(TL);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKimlik() {
        return kimlik;
    }

    public void setKimlik(int kimlik) {
        this.kimlik = kimlik;
    }

    public int getTL() {
        return TL;
    }

    public void setTL(int TL) {
        this.TL = TL;
    }
}
