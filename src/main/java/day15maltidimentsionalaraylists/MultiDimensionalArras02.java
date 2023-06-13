package day15maltidimentsionalaraylists;

public class MultiDimensionalArras02 {
    public static void main(String[] args) {
//   multidimensional array olusturmanın kısa yolu: String arr[][] =  { {"learn", "java", "it"}, {"is", "easy"} };
//   bu bize ic deki array'e farklı sayıda element ekleyebiliriz.

  //Example 2: Print the elements which have “a” from a 2 dimensional String array.
  // { {“learn”, “java”, “it”}, {“is”, “easy”} }
        String arr[][] =  { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w : arr){  // w ==> {"learn", "java", "it"}, {"is", "easy"} kısmını alır, yani icteki arrayleri alır

            for (String u : w){  // u ==> "learn", "java", "it", "is", "easy"  kısmını alır, yanı arraylerin icindekini alır

                if (u.contains("a")){
                    System.out.print(u + " "); //learn java easy
                }
            }
        }

        System.out.println("====================");

        // Example 2: Create an integer multidimensional array then find the sum of the elements
        int brr[][] = { {12, 54}, {3, 2, 7}, {21} };

        int sum=0;
        for (int[] w: brr){
            for (int u : w){
                sum=sum+u;
            }
        }
        System.out.println(sum); //99



    }
}
