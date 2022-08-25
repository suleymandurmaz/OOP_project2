package day30;

public class Personel {
    //soyadi cakıstıgı zaman lokal variable gecerlidir.cakısmayı önlemek için
    //this kullanılır.
    private String adi;
    private String soyadi;
    private int yasi;
    private double maasi;

    public void setAdi(String adi) {
        this.adi = adi;

    }

    public String getAdi() {
        return this.adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public void setSoyadi(String soyadi) {

        this.soyadi = soyadi;


    }

    public double getMaasi() {
        return maasi;
    }

    public void setMaasi(double maasi) {
        this.maasi = maasi;
    }

    public void calıs() {
        System.out.println("personel calısıyor");
    }

    public void evrakİmzala() {
        System.out.println("personel evrak imzalıyor");
    }
public void bilgileriGöster(){

    System.out.println(this.getAdi() + " " + this.getSoyadi());
    System.out.println();
    System.out.println("yası= " + this.getYasi());
    System.out.println("maası= " + this.getMaasi());
    Sguare kare1=new Sguare();
    kare1.setSideLenght(5);
}
}
