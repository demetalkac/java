package javaSlidesPDF;

public class StringManipulation01 {
    public static void main(String[] args) {

        //Example 1:
        String str = "Cat, caterpillar";
        int idx1 = str.indexOf("c");
        int idx2 = str.indexOf("cat");
        int idx3 = str.indexOf("s");
        int idx4 = str.indexOf("CAT");
        int idx5 = str.indexOf("ter");
        int idx6 = str.indexOf("pars");
        int idx7 = str.indexOf("a" , 3 );
        int idx8 = str.indexOf("at", 2);
        int idx9 = str.indexOf("at", 8);
        System.out.println(idx1); //5
        System.out.println(idx2); //5
        System.out.println(idx6); //-1
        System.out.println(idx8); //6
        System.out.println(idx9); //-1

        System.out.println("==================================");

        //Example 2:
        String st = "Cat, caterpillar";
        int id1 = st.lastIndexOf("a");
        int id2 = st.lastIndexOf("at");
        int id3 = st.lastIndexOf("s");
        int id4 = st.lastIndexOf("CAT");
        int id6 = st.lastIndexOf("pars");
        int id7 = st.lastIndexOf("a" , 3 );
        int id8 = st.lastIndexOf("a" , 5 );
        int id9 = st.lastIndexOf("at", 2);
        int idx10 = st.lastIndexOf("at", 7);

        System.out.println(id1); //14
        System.out.println(id3); //-1
        System.out.println(id6); //-1
        System.out.println(id7); //1
        System.out.println(id8); //1 ?
        System.out.println(id9); //1
        System.out.println(idx10); //6 ?


        //Example 3:
        String s = "Cat, caterpillar";
        String s1 = s.substring(0); //Cat, caterpillar
        String s2 = s.substring(3); //, caterpillar
        String s3 = s.substring(4); // caterpillar
        String s4 = s.substring(15); //r
        String s5 = s.substring(16);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        String s6= s.substring(5,8); //cat
        String s7 = s.substring(3,4); //,
        String s8 = s.substring(5,5);


        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println("=============================0");
        ////Example 4:
        String strr = "Cat, caterpillar";
        String strr1 = strr.toUpperCase();  //CAT, CATERPİLLAR
        String strr2 = strr.toLowerCase();  //cat, caterpillar
        String strr3 = strr.substring(4).toLowerCase(); //caterpillar
        String strr4 = strr.substring(3,8).toUpperCase(); //, CAT
        String strr5 = strr.toUpperCase().toLowerCase(); //cat, caterpillar

        System.out.println(strr1);
        System.out.println(strr2);
        System.out.println(strr3);
        System.out.println(strr4);
        System.out.println(strr5);

        System.out.println("=============000000000");

        String strA = "Cat ";
        String m = strA.trim();
        String strB=  " Cat";
        String l = strB.trim();
        String strC = " Cat ";
        String y = strC.trim();

        System.out.println(m); //Cat
        System.out.println(l); //Cat
        System.out.println(y); //Cat












    }
}
