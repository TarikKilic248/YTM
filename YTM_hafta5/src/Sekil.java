import java.util.ArrayList;

public interface Sekil {

}

interface Alan {
    public double alanHesapla();
}

interface Cevre {
    public double cevreHesapla();
}

class Kare implements Alan, Cevre {
    private int kenar;

    public double alanHesapla() {
        return kenar * kenar;
    }

    public double cevreHesapla() {
        return 4 * kenar;
    }
}

interface Pano {
    public double hesapla(ArrayList<Alan> sekils);
}
class AlanPano implements Pano {
    public double hesapla(ArrayList<Alan> sekils) {
        double toplam = 0;
        for (Alan sekil : sekils) {
            toplam += sekil.alanHesapla();
        }
        return toplam;
    }
}

class CevrePano implements Pano {
    public double hesapla(ArrayList<Alan> sekils) {
        double toplam = 0;
        for (Alan sekil : sekils) {
            toplam += sekil.alanHesapla();
        }
        return toplam;
    }
}
