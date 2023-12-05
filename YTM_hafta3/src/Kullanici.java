public class Kullanici{
    private String isim;
    private int yas;

    public Kullanici(String isim, int yas, String mail){
        setIsim(isim);
        setYas(yas);
        System.out.println(getIsim() + getYas() + " adlı kullanıcı oluşturuldu.");
    }

    public void giris(){
        System.out.println("giris yapildi");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}