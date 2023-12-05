import java.util.ArrayList;

interface Sekil extends Alan, Cevre{

}

interface Alan {
    public double alanHesapla();
}

interface Cevre {
    public double cevreHesapla();
}

class Kare implements Alan, Cevre, Sekil {
    public Kare(int kenar) {
        this.kenar = kenar;
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    private int kenar;

    public double alanHesapla() {
        return kenar * kenar;
    }

    public double cevreHesapla() {
        return 4 * kenar;
    }
}

class Dikdortgen implements Alan, Cevre, Sekil  {
    public Dikdortgen(int ukenar, int kkenar) {
        Ukenar = ukenar;
        Kkenar = kkenar;
    }

    public int getUkenar() {
        return Ukenar;
    }

    public void setUkenar(int ukenar) {
        Ukenar = ukenar;
    }

    public int getKkenar() {
        return Kkenar;
    }

    public void setKkenar(int kkenar) {
        Kkenar = kkenar;
    }

    private int Ukenar;
    private int Kkenar;

    public double alanHesapla() {
        return Ukenar * Kkenar;
    }

    public double cevreHesapla() {
        return 2*(Kkenar + Ukenar);
    }
}

class Cember implements Cevre, Sekil {
    public Cember(int cevre, int yarimAci) {
        this.cevre = cevre;
        this.yarimAci = yarimAci;
    }

    public int getCevre() {
        return cevre;
    }

    public void setCevre(int cevre) {
        this.cevre = cevre;
    }

    public int getYarimAci() {
        return yarimAci;
    }

    public void setYarimAci(int yarimAci) {
        this.yarimAci = yarimAci;
    }

    private int cevre;
    private int yarimAci;

    public double cevreHesapla() {
        return 2 * Math.PI * yarimAci;
    }

    @Override
    public double alanHesapla() {
        return 0;
    }
}

class Daire  implements Alan, Cevre, Sekil  {
    private int cevre;

    public int getCevre() {
        return cevre;
    }

    public void setCevre(int cevre) {
        this.cevre = cevre;
    }

    public int getYarimAci() {
        return yarimAci;
    }

    public void setYarimAci(int yarimAci) {
        this.yarimAci = yarimAci;
    }

    public Daire(int cevre, int yarimAci) {
        this.cevre = cevre;
        this.yarimAci = yarimAci;
    }

    private int yarimAci;

    public double alanHesapla() {
        return Math.PI * yarimAci * yarimAci;
    }

    public double cevreHesapla() {
        return 2 * Math.PI * yarimAci;
    }
}

interface Pano {
    public double hesapla(ArrayList<Sekil> sekils);
}

class AlanPano implements Pano {
    public double hesapla(ArrayList<Sekil> sekils) {
        double toplam = 0;
        for (Sekil sekil : sekils) {
            toplam += sekil.alanHesapla();
        }
        return toplam;
    }
}

class CevrePano implements Pano {
    public double hesapla(ArrayList<Sekil> sekils) {
        double toplam = 0;
        for (Sekil sekil : sekils) {
            toplam += sekil.cevreHesapla();
        }
        return toplam;
    }
}



public class Main {
    public static void main(String[] args) {
        Daire daire = new Daire(10, 2);
        Dikdortgen dikdortgen = new Dikdortgen(10, 5);
        Kare kare = new Kare(4);

        ArrayList<Sekil> arrayList = new ArrayList<>();
        arrayList.add(daire);
        arrayList.add(dikdortgen);
        arrayList.add(kare);

        AlanPano alanPano = new AlanPano();
        CevrePano cevrePano = new CevrePano();

        double result = alanPano.hesapla(arrayList);
        System.out.println(result);

        double result2 = cevrePano.hesapla(arrayList);
        System.out.println(result2);


    }
}