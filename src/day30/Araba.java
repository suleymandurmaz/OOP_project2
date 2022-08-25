package day30;

public class Araba {
    private String renk;
    private String marka;
    private String model;
    private double silindirHacmi;
    private int modelYılı;


    public int getModelYılı() {
        return this.modelYılı;
    }

    public void setModelYılı(int modelYılı) {
        if (modelYılı > 0)
            this.modelYılı = modelYılı;


    }

    }