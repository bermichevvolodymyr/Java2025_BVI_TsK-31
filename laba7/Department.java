package laba7;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Employee boss;
    private List<Employee> employees;

    public Department(String name, Employee boss) {
        this.name = name;
        this.boss = boss;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public String getName() { return name; }

    public Employee getBoss() { return boss; }

    public List<Employee> getEmployees() { return employees; }
}
