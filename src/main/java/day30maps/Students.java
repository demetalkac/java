package day30maps;

public class Students {

    public String email;
    public int age;
    public int grade;
    public String nationality;

    public Students(String email, int age, int grade, String nationality) {
        this.email = email;
        this.age = age;
        this.grade = grade;
        this.nationality = nationality;
    }


    //right button of the mouse ==> generate ==> toString ==> it will convert the references to String, so it will be readable
    //toString() method will print Student information==> We can choose the values that we want to use
    //If we put toString() method inside the class instead of putting it in Hashtable after each method, it will work for each object.
    @Override
    public String toString() {
        return "[" +
                "email='" + email + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", nationality='" + nationality + '\'' +
                ']';
    }



}
