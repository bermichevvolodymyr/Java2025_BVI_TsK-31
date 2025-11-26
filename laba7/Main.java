package laba7;

public class Main {
    public static void main(String[] args) {

        Employee director = new Employee("Ivan", "Petrov", 20000);

        Firm firm = new Firm("TechCorp", director);

        Department d1 = new Department("IT", new Employee("Oleh", "Sydorenko", 15000));
        d1.addEmployee(new Employee("Maksym", "Ivanov", 12000));
        d1.addEmployee(new Employee("Taras", "Bondar", 16000));  // отримує більше начальника

        Department d2 = new Department("HR", new Employee("Olena", "Koval", 11000));
        d2.addEmployee(new Employee("Irina", "Poliak", 9000));

        firm.addDepartment(d1);
        firm.addDepartment(d2);

        System.out.println("Максимальна зарплата: " + Zavd1.findMaxSalary(firm));

        Department problem = Zavd2.findDepartment(firm);
        System.out.println("Відділ, де працівник отримує більше начальника: " +
                (problem != null ? problem.getName() : "нет"));

        System.out.println("Список всіх працівників:");
        for (Employee e : Zavd3.listAll(firm)) {
            System.out.println(e);
        }
    }
}
