package proje;

public class Dikdortgen extends Sekıller{

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

  public Dikdortgen(double kenar){
        super(kenar);
  }




    @Override
    public double alan() {

        return uzunKenar*kisaKenar;
    }

    @Override
    public double cevre() {

        return 2*(uzunKenar+kisaKenar);
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                "Alan="+ alan() +
                "Cevre="+ cevre()+
                '}';
    }


}
