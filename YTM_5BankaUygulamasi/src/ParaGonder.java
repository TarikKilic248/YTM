public class ParaGonder {
    public void havale(Kullanici kullanici1, Kullanici kullanici2, int miktar){
        if(kullanici1.getTL() >= miktar){
            kullanici1.setTL(kullanici1.getTL() - miktar);
            kullanici2.setTL(kullanici2.getTL() + miktar);
            System.out.println("***Havale islemi basarili***");
            System.out.println(kullanici1.getIsim() + "--- "+miktar+"TL --->" + kullanici2.getIsim());
        }
        else{
            System.out.println(kullanici1.getIsim()+" kullanıcının yeterli bakiyesi yok.");
        }
    }

    public void eft(Kullanici kullanici1, Kullanici kullanici2, int miktar){
        if(kullanici1.getTL() > miktar){
            if (kullanici1.getKimlik() < 100) {
                kullanici1.setTL(kullanici1.getTL() - miktar - 20);
            }
            if (kullanici1.getKimlik() > 100) {
                kullanici1.setTL((kullanici1.getTL() - miktar) - (20 + (kullanici1.getTL()) % 5));
            }
            int Parakullanici2 = kullanici2.getTL() + miktar;
            kullanici2.setTL(Parakullanici2);
            System.out.println("***Eft islemi basarili***");
            System.out.println(kullanici1.getIsim() + "--- "+miktar+"TL --->" + kullanici2.getIsim());
        }else{
            System.out.println(kullanici1.getIsim()+" kullanıcının yeterli bakiyesi yok.");
        }
    }

    public void swift(Kullanici kullanici1, Kullanici kullanici2, int miktar){
        if(kullanici1.getKimlik() > 100){
            System.out.println("Standart kullanicilar Swift yapamaz");
        }
        else{
            if(kullanici1.getTL() > miktar + 500){
                kullanici1.setTL((kullanici1.getTL() - miktar) - 500);
                kullanici2.setTL(kullanici2.getTL() + miktar);
                System.out.println("***Swift islemi basarili***");
                System.out.println(kullanici1.getIsim() + "--- "+miktar+"TL --->" + kullanici2.getIsim());
            }
            else{
                System.out.println(kullanici1.getIsim()+" kullanıcının yeterli bakiyesi yok.");
            }

        }
    }
}
