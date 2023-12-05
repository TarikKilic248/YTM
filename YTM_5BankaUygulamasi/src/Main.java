public class Main {
    public static void main(String[] args) {
        ParaGonder paraGonder = new ParaGonder();

        OzelKullanici ozelKullanici1 = new OzelKullanici("Onur", 50, 500, 20);
        ozelKullanici1.TLgoster();

        StandartKullanici standartKullanici1 = new StandartKullanici("Muhammet", 149, 300);
        standartKullanici1.TLgoster();

        paraGonder.havale(standartKullanici1, ozelKullanici1, 100);
        standartKullanici1.TLgoster();
        ozelKullanici1.TLgoster();

        paraGonder.havale(standartKullanici1, ozelKullanici1, 200);
        standartKullanici1.TLgoster();
        ozelKullanici1.TLgoster();

        paraGonder.eft(ozelKullanici1, standartKullanici1, 500);
        standartKullanici1.TLgoster();
        ozelKullanici1.TLgoster();

        ozelKullanici1.setTL(1000);

        paraGonder.swift(ozelKullanici1, standartKullanici1, 200);
        standartKullanici1.TLgoster();
        ozelKullanici1.TLgoster();


    }
}