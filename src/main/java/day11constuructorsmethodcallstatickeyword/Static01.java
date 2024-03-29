package day11constuructorsmethodcallstatickeyword;

public class Static01 {
  /*
     1)"static" class members (variables and methods) are common for all objects created from the class
     2)When you do any update on "static" class members, all objects will see the updates on it
     3)If you want every object informed about every update on a class member make it static.

     -Variable'lar static ise class'a baglanır, stadik degilse objeye baglanır.
     -Static de yapılan her degisiklik objeler tarafından görülür ama "object"de yapılan degisiklik sadece objeyi etkiler.
     - STATİC VARİABLE'LARA OBJELERİ KULLANARAK ULASMAK MUMKUN AMA TAVSİYE EDİLMEZ
     - STATİC VARİABLE'LARA CLASS ISMI KULLANILARAK ULASILMALIDIR.

   */

    //How to create "static" variable
    //To make a variable "static", put "static" keyword between "access modifier" and "data type"
    public static int staticCounter  = 0;
    public int nonStaticCounter = 0;

    public Static01(){
        staticCounter++;
        nonStaticCounter++;
   }




}
