package friend_class;

public class Questions02 {
    public static void main(String[] args) {

  /*
  1) [0,2,3,0,12,,0] put the zeros to the end.

  int arr[] = {0,2,3,0,12,0},
  int brr[] = new int[arr.length];
  int idx= 0;
  for(int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                brr[xtr]=arr[i];
             xtr++;
             }
        }
    System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));


  string ile yapımı:
  //put the nulls to the end in a string Array container.
        String str[]={null, null, "Ahmet", null, "Hasan" };
        String btr[]= new String[str.length];
        int xtr= 0;
        for (int i=0; i<str.length; i++){
            if (str[i]!=null){
                btr[xtr]=str[i];
             xtr++;
            }
        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(btr));

  2) What is the difference between methods and constructors?
    1: Constructors do not have "return type" but methods have
    2: Constructor name must match with the class name but method name can be any name
    3: Constructors are used to create objects but methods are used to create some actions

  3)Type code to reverse a string.
   Tom Hanks==> sknaH moT

   4)swap: ben yaptım.

   5) Type code to print unique characters in a String. Hello ==> Heo.
     String s= "Hello";


    for(int i= 0 ; s.length()>i ; i++){
        char c = s.charAt(i);
        if(s.indexOf(c)==s.lastIndexOf(c)){
            System.out.print(c);
        }
    }

    System.out.println();

    for(int i= s.length()-1 ; -1<i ; i--){

        char c = s.charAt(i);
        if(s.indexOf(c)==s.lastIndexOf(c)){
            System.out.print(c);
        }
     (//Step 1. Create a string value.
      String s = "Hello";
     //Step 2. Create for loop to get every char one by one. We will use decrement because we need to start from the left.
     for(int i=0; i<s.length(); i++){
    //Step 3. Create  if statement to check if the characters of a string repeated or not.
    // We will use index of () method to reach the first occurrence of the character.
    // We will also use charAt () method to reach the specified index of the char.
    if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
        System.out.print(s.charAt(i));
    }  )

    6)Type code to print the number of occurrences of words in a sentence
      "I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1


    7)   Given String array
        reverse the String array
        print the reversed array
        NOTE: While printing the array dont use for loop
        Use Arrays.toString(your_array_name);

   */

    }
}
