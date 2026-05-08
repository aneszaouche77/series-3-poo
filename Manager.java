package Anes;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Bonus: " + bonus
                + ", Total Salary: " + getTotalSalary();
    }
}
