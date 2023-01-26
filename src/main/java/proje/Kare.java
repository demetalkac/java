package proje;

public class Kare extends Dikdortgen{

    public Kare(double kenar){

        super(kenar);
    }

    @Override
    public double alan() {

        return kenar*kenar;
    }

    @Override
    public double cevre() {

        return 4*kenar;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + kenar +
                "Alan="+ alan() +
                "Cevre="+ cevre()+
                '}';
    }
}
