package questionBank;

public class ForLoop {
    public static void main(String[] args) {

        //1) Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integers

        //1.way my
        for (int i=120; i>11; i--){
            if (i%4==0  && i%6==0){
                System.out.print(i+ " "); //120 108 96 84 72 60 48 36 24 12
            }
        }
        System.out.println("===========================");
        //
        String s = "";
        for(Integer i=120; i>10; i--){
            if(i%4==0 && i%6==0){
                s = s + i + " ";
            }
        }
        System.out.println(s);
        System.out.println("====================" );

        //2.way my

        int i= 120;
        while (i>10){
            if (i%4==0  && i%6==0){
                System.out.print(i+ " "); //120 108 96 84 72 60 48 36 24 12
            }
            i--;
        }

        System.out.println("");
        //...
        String sn = "";
        int e=120;
        while(e>10){
            if(e%4==0 && e%6==0){
                sn = sn + e + " ";
            }
            e--;
        }
        System.out.println(s);

        System.out.println("======================");

        //3.way my

        int r=120;
        do {
            if (r%4==0  && r%6==0){
                System.out.print(r+ " ");    //120 108 96 84 72 60 48 36 24 12
            }
            r--;
        }while (r>10);

        //
        String snr = "";
        int t=120;
        do{
            if(t%4==0 && t%6==0){
                s = s + t + " ";
            }
            t--;
        }while(t>10);
        System.out.println(s);





    }
}
