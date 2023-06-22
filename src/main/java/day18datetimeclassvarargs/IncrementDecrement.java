package day18datetimeclassvarargs;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 12;
        int b = a++; //Post Increment => variable'ı aldıktan sonra artırma yapar
        System.out.println(b); //12 => java önce "a"ı gördi ve aldı "b"nın icine koydu sonrada ++ isaretini gördü ve "a"ı alıp 1 artırdı.
        System.out.println(a); //13


        int x=15;
        int y=x--; //Post Decrement
        System.out.println(x); //14
        System.out.println(y);//15



        int m = 21;
        int n= ++m; // Pre Icrement => java önce "m"i artırdı sonra "n"nin icine koydu.
        System.out.println(m); //22
        System.out.println(n); //22


        int t = 32;
        int u = --t; //Pre Decrement
        System.out.println(t); //31
        System.out.println(u); //31





    }
}
