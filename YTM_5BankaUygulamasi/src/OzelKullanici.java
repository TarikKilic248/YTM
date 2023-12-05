public class OzelKullanici extends Kullanici implements IDoviz{
    private int dolar = 0;
    public OzelKullanici(String isim, int kimlik, int TL, int dolar) {
        super(isim, kimlik, TL);
        setDolar(dolar);
        int toplamTL = getTL() + (getDolar()*10);
        setTL(toplamTL);
    }

    public int getDolar() {
        return dolar;
    }

    public void setDolar(int dolar) {
        this.dolar = dolar;
    }


    @Override
    public void TLgoster() {
        System.out.println(getIsim()+"Toplam TL = "+ getTL()+", Dolar = "+ getDolar() + "("+getDolar()*10+")TL");
    }

}
