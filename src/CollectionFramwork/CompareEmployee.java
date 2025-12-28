package CollectionFramwork;

import java.util.Comparator;

public class CompareEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getAddress() == e2.getAddress()) {
            return e1.getName().compareTo(e2.getName());
        } else {
            return e1.getAddress().compareTo(e2.getAddress());
        }
    }
}
