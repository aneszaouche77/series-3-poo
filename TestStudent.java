package Anes;

public class TestStudent {
    public static void main(String[] args) {

        Student student = new Student("Sara", 20, 14.5);

        System.out.println(student);

        if (student.isPassed()) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed.");
        }
    }
}
