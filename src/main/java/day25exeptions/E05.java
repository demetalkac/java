package day25exeptions;

public class E05 {

    public static void main(String[] args) {

        char r1 = getCharFromString("Java", 2);
        System.out.println(r1); //v

        char r2 = getCharFromString("Java", 9);
        System.out.println(r2);//StringIndexOutOfBoundsException: If you use non-existing index for a String, you will get StringIndexOutOfBoundsException

    }

    //Create a method to get any character from a String
    public static char getCharFromString(String str, int idx){
        char ch = 'x'; // char'a herhangi bir deger verebiliriz burda , asagıda yazdıgımız kod buraya yazdıgımızı zaten degistirecek.

        try{
            ch = str.charAt(idx);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("A problem occurred - " + e.getMessage());
        }
        return ch;
    }


}
