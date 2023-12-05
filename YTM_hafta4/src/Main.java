public class Main {
    public static void main(String[] args) {
        Kare kare1 = new Kare(5);
        Ucgen ucgen1 = new Ucgen(5, 6);
        Dikdortgen dikdortgen1 = new Dikdortgen(7, 6);
        AlanHesapla alanHesapla1 = new AlanHesapla();

        alanHesapla1.yazdir(kare1);
        alanHesapla1.yazdir(dikdortgen1);
        alanHesapla1.yazdir(ucgen1);


    }
}