interface Yazdirabilir {
    void yazdir();
}

interface Taraabilir {
    void tara();
}

class Yazici1 implements Yazdirabilir, Taraabilir {
    public void yazdir() {
        System.out.println("Yazici1 Yazdir");
    }

    public void tara() {
        System.out.println("Yazici1 Tara");
    }
}

class Yazici2 implements Yazdirabilir {
    public void yazdir() {
        System.out.println("Yazici2 Yazdir");
    }
}

class YaziciProcess {
    Yazdirabilir yazdirabilir;
    Taraabilir taraabilir; // Yazıcılar arasında tara özelliğini kullanmak isteyen sınıflar için

    public YaziciProcess(Yazdirabilir yazdirabilir) {
        this.yazdirabilir = yazdirabilir;
    }

    public YaziciProcess(Taraabilir taraabilir) {
        this.taraabilir = taraabilir;
    }

    public void yazdir() {
        yazdirabilir.yazdir();
    }

    public void tara() {
        if (taraabilir != null) {
            taraabilir.tara();
        } else {
            System.out.println("Bu yazıcı tarama özelliğine sahip değil.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Yazici1 yazici1 = new Yazici1();
        Yazici2 yazici2 = new Yazici2();

        YaziciProcess process2 = new YaziciProcess(yazici2);


        process2.yazdir();
        process2.tara();
    }
}