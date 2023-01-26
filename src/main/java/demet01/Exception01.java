package demet01;

public class Exception01 {
    public static void main(String[] args) {

     divide(6,0);




    }

public static void divide(int a, int b){
        try {
            System.out.println(a/ b + "was saved");
        }catch (ArithmeticException e){
            System.out.println("do not division");
        }finally {
            System.out.println("cut the");
        }
}





}
