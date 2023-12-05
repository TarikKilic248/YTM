class Kullanici{
    private String isim;
    private String mail;
    private int ip;
    private int telNo;

    public Kullanici(String isim, String mail, int ip, int telNo) {
        this.isim = isim;
        this.mail = mail;
        this.ip = ip;
        this.telNo = telNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getTelNo() {
        return telNo;
    }

    public void setTelNo(int telNo) {
        this.telNo = telNo;
    }
}

interface bilgiGonder{
    public void bilgiGonder(Kullanici kullanici1);
}

class SMSile implements bilgiGonder {

    @Override
    public void bilgiGonder(Kullanici kullanici1) {
        System.out.println(kullanici1.getIsim()+" adlı kullaniciya bilgiler gönderildi.");
    }
}

class Mailile implements bilgiGonder {

    @Override
    public void bilgiGonder(Kullanici kullanici1) {
        System.out.println(kullanici1.getIsim()+" adlı kullaniciya bilgiler gönderildi.");
    }
}

class IPile implements bilgiGonder {

    @Override
    public void bilgiGonder(Kullanici kullanici1) {
        System.out.println(kullanici1.getIsim()+" adlı kullaniciya bilgiler gönderildi.");
    }
}

public class Main {
    public static void main(String[] args) {
        Kullanici tarik = new Kullanici("Tarik", "abc@gmail.com", 3214335, 552772884);
        Mailile mailile = new Mailile();
        mailile.bilgiGonder(tarik);


    }
}
