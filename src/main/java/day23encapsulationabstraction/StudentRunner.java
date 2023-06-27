package day23encapsulationabstraction;

public class StudentRunner {

     /*
                                            Encapsulation
                Encapsulation is "data hiding"
                To hide a data we make the access modifier "private"
                After "hiding data", you may need to "read" or "update" the data.
                To "read" or "update" the data we will create some methods.
                To "read" "encapsulated data" you should create "get()" methods, we name it "getters"

                To "update" "encapsulated data" you should create "set()" methods, we name it "setters"

                "get()" and "set()" methods are called "Java Beans"

                If a class is "immutable", it is impossible to change the value of the existing variable.
                If you want to make a class "immutable" do not create any "setter" method

                                ----------
               Encapsulation is "data hiding"=> Yani "data gizlemek" demektir.
              *Data'yı nicin gizlersi?
               -Data'yı dıs etkenlerden korumak icin.

              *Data'yı nasıl gizlersin?
              -Access modifier'ını "privide" yaparak gizlerim.

              *Data'yı gizledikten sonra baska classlarda okumak istersen ne yaparsın?
              - "get methodlar"(getter) olusturarak gizledigimiz dataları okunur hale getirebiliriz.

              *Data'yı gizledikten sonra baska classlarda degistirmek istersen ne yaparsın?
               - "set methodlar"(setter) olusturarak gizledigimiz dataları degistirebliriz.

               * generate => gettir or setter


       GET: "gettir" kullandıgımızda Okuma yaptıgımız icin access modifier public olur.
           -Variable'ın "data type"ı ile get methodun return taype'ı da aynı olmalı.
             Yani variable String ise getir ile aldıgımız methodun da data type'ı string olur.
           -get methodları isimlendirirken "get+ <variable name>", ancak variable'ın data type'ı "boolean" ise "is+<variable name>"
            ör:  private String stdId = "TH123"; ==>  public String getStdId() {return stdId; }
                private boolean successful = false; =>public boolean isSuccessful() {return successful; }

           set:-set methodu datayı degisiklik yapmada kullanırız
           -access modfier'ı "public" olur: baska sınıftan ulasmam icin.
           -set methodunun return type'ları "void" olur.
           -set methodların ismi hep set ile baslar, "set+ <variable name>". ör:
                public void setStdGpa(double gpa){ this.stdGpa = gpa; }
                public void setSuccessful(boolean successful) { this.successful = successful; }
           -set method parametre ile calısır.Parametre data tipinde ve isminde olur, isim aynı olmak zorunda dagil ama genel kullanım odur.
            private double stdGpa = 3.8; => "double" oldugu icin set methodunun data type da "double" olur =>   public void setStdGpa(double gpa){ this.stdGpa = gpa; }

           -Baska bi class'dan obje olusturunca :Ve objeyi kullanarak variable'ları cagırdıgımızda class icindekiler okur
              Ama olusturdugumuz obje ile variable'larda degisiklik yapmak istedigimizde asıl class'dakiler ile degil
              olusturdugumuz obje üzerinde degisiklik yapar, asıl clastaki variablelar degismez.
              Degisim classda degil objede olur.



         */


    public static void main(String[] args) {

        Student std1 = new Student();
        System.out.println(std1.name);

        System.out.println(std1.getStdId());

        std1.setDisease(null);
        System.out.println(std1.getDisease()); // Heart Disease

        std1.setStdGpa(4.0);
        System.out.println(std1.getStdGpa());


    }
}
