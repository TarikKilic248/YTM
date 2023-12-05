public class Main {
    public static void main(String[] args) {
        Kullanici kullanici1 = new Kullanici("Ahmet", 21, "ahmet21@sirket.com");
        Satici satici1 = new Satici("Mert", 20, "mert20@sirket.com", 2526);
        Musteri musteri1 = new Musteri("Volkan", 44, "volkan44@gmail.com", 5549521);
        musteri1.urunGoruntule();
        musteri1.giris();
        satici1.urunListele();
        satici1.giris();
    }
}