package practice_day23_session;

public class Q03_CalculateVolumeOfCube {

    // Create a method to calculate volue of cube, square prism and rectangular prism.

    public double volumeOfCube(double a){  //a*a*a ==> gives you the required outred outcome.
         return a*a*a;                                  //Only one edge length is enough to calculate
    }

    public static double volumeOfSquarePrism(double a,double b){
        return a*a*b;
    }

    public static double volumeOfRectangularPrism(double a,double b, double c){
        return a*b*c;
    }

    public static double totalPrice(double a, double...prices){
        return a;
    }
}
