package questionBank;

public class TypeCasting {
    public static void main(String[] args) {

        //1.) Create a short variable and convert it to an int variable.
        short age= 12;
        int newAge=age;
        System.out.println(newAge);

        //2) Create a long variable and convert it to an int variable.
        long m=14;
        int newM=(int)m;

        //3)Create a double variable and convert it to a float variable
        double price=2.34;
        float newPrice=(float)price;


        //4)Create a double variable and convert it to a short variable, then print the value of the short
        //variable on the console. Be careful about the output, it will not be a decimal value
        double priceShirt=1.2;
        short newPriceShirt=(short)priceShirt;
        System.out.println(newPriceShirt); //1

        //5) Create a byte variable and convert it to a double variable, then print the value of the double
        //variable on the console. Be careful about the output, it will be a decimal number.
        byte n=23;
        double k=n;
        System.out.println(k); //23.0





    }
}
