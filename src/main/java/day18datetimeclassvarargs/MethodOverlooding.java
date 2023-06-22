package day18datetimeclassvarargs;

public class MethodOverlooding {

    /*
    overlooding = asırı yükleme

    Bir method aynı isim ile farklı parametrelere sahip birden fazla method olusturmaktır.
     Method Overlooding nasıl yapılır?

     1-Method isimleri aynı olmalıdır
     2- Method parametreleri aynı olmalıdır
        i- Parametre sayıları degistirilebilir
        ii- Parametrelerin data tiplerini degistirilebilir
        iii-Parametrelerin yerlerini degistirilebilir ancak data tipleri farklı ise.
     3-Method ismi+ Parametreler = Method Signnature
     not:Method Signnature dısında ne degistirirseniz degistirin Java o methodları farklı kabul etmez.
     */


    public static void main(String[] args) {

        add(3,5);
        add(3, 5.0);


    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }



    public static void add(int a, double b){
        System.out.println(a);
    }
}
