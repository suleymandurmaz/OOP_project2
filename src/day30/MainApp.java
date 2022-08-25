package day30;

public class MainApp {
    public static void main(String[] args) {
        Araba araba1 = new Araba();


        araba1.setModelYılı(2017);

        System.out.println("model yılı= " + araba1.getModelYılı());

        Personel p1 = new Personel();
        p1.setAdi("ahmet");
        p1.setSoyadi("dursun");
        p1.setYasi(40);
        p1.setMaasi(5000);

        p1.calıs();
        p1.evrakİmzala();
        p1.bilgileriGöster();
        System.out.println();


        Personel p2=new Personel();
        p2.setAdi("seba");
        p2.setSoyadi("gitsin");
        p2.setMaasi(6000);
        p2.setYasi(45);
        p2.bilgileriGöster();
        Sguare kare1=new Sguare();
        kare1.setSideLenght(5);

        kare1.showİnfos();
    }

}

