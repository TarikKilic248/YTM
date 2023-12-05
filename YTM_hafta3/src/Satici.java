public class Satici extends Kullanici{

    private int vkn;
    public Satici(String isim, int yas, String mail, int vkn) {
        super(isim, yas, mail);
        setVkn(vkn);
        System.out.println("satici olusturuldu");
    }

    public void urunListele(){
        System.out.println("Urunler listelendi");
    }

    public int getVkn() {
        return vkn;
    }

    public void setVkn(int vkn) {
        this.vkn = vkn;
    }
}
