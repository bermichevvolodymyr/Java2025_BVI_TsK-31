package laba7;

import java.util.ArrayList;
import java.util.List;

public class Firm {
    private String name;
    private Employee director;
    private List<Department> departments;

    public Firm(String name, Employee director) {
        this.name = name;
        this.director = director;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public Employee getDirector() { return director; }

    public List<Department> getDepartments() { return departments; }
}
