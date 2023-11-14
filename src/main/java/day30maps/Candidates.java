package day30maps;

public class Candidates {

    public int age;
    public String email;

    public Candidates(int age, String email) {
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "[" +
                "age=" + age +
                ", email='" + email + '\'' +
                ']';
    }
}
