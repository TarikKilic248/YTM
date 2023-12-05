public class StandartKullanici extends Kullanici implements IDoviz{

    public StandartKullanici(String isim, int kimlik, int TL) {
        super(isim, kimlik, TL);
    }

    @Override
    public void TLgoster() {
        System.out.println(getIsim()+" TL= "+ getTL());
    }
}
