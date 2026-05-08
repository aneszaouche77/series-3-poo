package Anes;

public class TestStudent {

    public static void main(String[] args) {

        Student s = new Student("Sara", 20, 14);

        System.out.println(s);

        if (s.isPassed()) {
            System.out.println("Student passed.");
        } else {
            System.out.println("Student failed.");
        }
    }
}
