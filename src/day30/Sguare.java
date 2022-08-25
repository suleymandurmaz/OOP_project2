package day30;

public class Sguare {
    private int sideLenght;

    public int getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(int sideLenght) {
        this.sideLenght = sideLenght;
    }
    public int countPerimeter(){
        return 4*sideLenght;

    }
    public int countArea(){
        return sideLenght*sideLenght;

    }
    public void showİnfos(){
        System.out.println("alan= "+this.countArea());
        System.out.println("cevre= "+this.countPerimeter());


    }
}
