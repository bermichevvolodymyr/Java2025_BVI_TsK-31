package laba7;

public class Employee {
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return getFullName() + " | Salary = " + salary;
    }
}
