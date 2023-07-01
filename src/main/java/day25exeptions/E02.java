package day25exeptions;

public class E02 {

    public static void main(String[] args) {

        String a[] = {"A", "C", "B", "Z"};

        getElement(a,2);
        String r1 = getElement(a, 5); //ArrayIndexOutOfBoundsException: array'in lenght-1 den fazla index girilince alırız.=> Index 5 out of bounds for length 4
        System.out.println(r1);

    }

    //Create a method to get any element from a String Array(String array'den index girerek element elde eteden method olustr)
    public static String getElement(String a[], int idx){
        String s = "";

        try{
            s = a[idx];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A problem occurred in array indexes");
            System.out.println(e.getMessage());//Gives technical message about the Exception
            e.printStackTrace();//Gives detailed technical message about the Exception
        }
        return s;
    }

}
