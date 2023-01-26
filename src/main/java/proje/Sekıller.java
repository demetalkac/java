package proje;
/* 1-asagidaki hiyarasiye gore class creat ediniz...
     sekil <--Cember
     sekil <--Dikdortgen<--Kare
    2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik ekleyiniz.
    3- Runner class'da obj'lerin  alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
*/
public class Sekıller {

    public double uzunKenar;
    public double kisaKenar;
    public double kenar;
    public double pi =3.14;
    public double yaricap;
    public int etkisiz=1;

   public Sekıller (double uzunKenar,double kisaKenar){
       this.uzunKenar=uzunKenar;
       this.kisaKenar=kisaKenar;
   }

   public Sekıller(double kenar){

       this.kenar=kenar;
   }
   public Sekıller(double pi,double yaricap,int etkisiz){
       this.pi=pi;
       this.yaricap=yaricap;
       this.etkisiz=etkisiz;
   }



    public double alan(){
       return 0;
   }

    public double cevre(){
        return 0;
    }

    @Override
    public String toString() {
        return "Sekıller{" +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                ", kenar=" + kenar +
                ", pi=" + pi +
                ", yaricap=" + yaricap +
                ", etkisiz=" + etkisiz +
                '}';
    }
}
