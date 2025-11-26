package laba7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zavd3 {
    public static List<Employee> listAll(Firm firm) {
        List<Employee> all = new ArrayList<>();

        all.add(firm.getDirector());

        Iterator<Department> it = firm.getDepartments().iterator();   // типизированный

        while (it.hasNext()) {
            Department d = it.next();
            all.add(d.getBoss());

            Iterator<Employee> w = d.getEmployees().iterator();       // типизований
            while (w.hasNext()) {
                all.add(w.next());
            }
        }
        return all;
    }
}

