package Anes;

class Student extends Person {
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    
    public double getGrade() {
        return grade;
    }

   
    public void setGrade(double grade) {
        this.grade = grade;
    }

    
    public boolean isPassed() {
        return grade >= 10;
    }

    
    public String toString() {
        return super.toString() +
               ", Grade = " + grade;
    }
}