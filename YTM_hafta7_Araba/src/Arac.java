public abstract class Arac {
    private double hiz = 0;
    private double hizlanma = 10;

    public double getHiz() {
        return hiz;
    }

    public void setHiz(double hiz) {
        this.hiz = hiz;
    }

    public double getHizlanma() {
        return hizlanma;
    }

    public void setHizlanma(double hizlanma) {
        this.hizlanma = hizlanma;
    }

    public abstract void calistir();
}

interface Turbo{
    public void turboCalistir();
}

interface Klima{
    public void klimaCalistir();
}


class Ferrari extends Arac implements Turbo, Klima{

    @Override
    public void setHizlanma(double hizlanma) {
        super.setHiz(hizlanma + getHiz());
    }

    @Override
    public void calistir() {
        System.out.println("Ferrari calisiyor. Hiz: "+ getHiz());
        setHiz(getHizlanma() + getHiz());
    }

    @Override
    public void turboCalistir() {
        setHiz(getHiz() * 2);
        System.out.println("Ferrari turbo acti. Hiz: "+ getHiz());
    }

    @Override
    public void klimaCalistir() {
        setHiz(getHiz()-(getHiz()/10));
        System.out.println("Ferrari klima acti. Hiz: "+ getHiz());

    }
}

class Mercedes extends Arac{

    @Override
    public void setHizlanma(double hizlanma) {
        super.setHiz(hizlanma + getHiz());
    }

    @Override
    public void calistir() {
        System.out.println("Ferrari calisiyor. Hiz: "+ getHiz());
        setHiz(getHizlanma() + getHiz());
    }
}

class BMW extends Arac{

    @Override
    public void setHizlanma(double hizlanma) {
        super.setHiz(hizlanma + getHiz());
    }

    @Override
    public void calistir() {
        System.out.println("Ferrari calisiyor. Hiz: "+ getHiz());
        setHiz(getHizlanma() + getHiz());
    }
}
