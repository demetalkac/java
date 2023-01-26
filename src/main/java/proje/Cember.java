package proje;

public class Cember extends Sekıller{

    public Cember(double pi,double yarıcap,int etkisiz){

        super(pi,yarıcap,etkisiz);
    }

    @Override
    public double alan() {
        return pi*(yaricap*yaricap);
    }

    @Override
    public double cevre() {
        return 2*pi*yaricap;
    }

    @Override
    public String toString() {
        return "Cember{" +
                "pi=" + pi +
                ", yaricap=" + yaricap +
                ", etkisiz=" + etkisiz +
                "Alan="+ alan() +
                "Cevre="+ cevre()+
                '}';
    }
}
