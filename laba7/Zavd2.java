package laba7;

public class Zavd2 {
    public static Department findDepartment(Firm firm) {
        for (Department d : firm.getDepartments()) {   // for-each
            double bossSalary = d.getBoss().getSalary();
            for (Employee e : d.getEmployees()) {      // for-each
                if (e.getSalary() > bossSalary) {
                    return d;
                }
            }
        }
        return null;
    }
}

