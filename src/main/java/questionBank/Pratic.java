package questionBank;

import java.util.Scanner;

public class Pratic {
    public static void main(String[] args) {
        long Etekprice= 23786;
        String Etekprice2= "ASDER";
        long Etekprice3= 236L;
        System.out.println(Etekprice+Etekprice2+Etekprice3);

        boolean w=true;
        boolean h=false;
        System.out.print(w+" "+h);

        float book =32, notebook=45, laptop=543;
        System.out.println((book*2)+"- "+(notebook*4)+" -"+(laptop*3));

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter two number to swap");
        double s1=scanner.nextDouble();
        double s2=scanner.nextDouble();
        System.out.println("swap öncesi: " +s1+"- "+s2);

        double temp= s1;
        s1=s2;
        s2=temp;
        System.out.println("swap sonrasi: " +s1+"- "+s2);

        s1=s1+s2;
        s2=s1-s2;
        s1=s1-s2;
        System.out.println("swap sonrasi: " +s1+"- "+s2);
        
        short tem=234;
        int newtem=tem;

        long tryı=5678;
        int newtryı=(int) tryı;
        
        double gft= 7860.8;
        float newgft=(float)gft;
        
        double jhg=654.9;
        short newjhg=(short) jhg;
        System.out.println("newjhg = " + newjhg);
        
        byte gfto=54;
        double newgfto=gfto;
        System.out.println("newgfto = " + newgfto);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String d="103";
        byte wd=Byte.valueOf("103");
        String k="2351";
        short nk=Short.valueOf("2351");
        System.out.println(wd-nk);
        
    }
}
