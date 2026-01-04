package CollectionFramwork.Map;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryMap {

    public static void main(String[] args) {
        //create Map
        Map<Integer, Double> empSalary = new HashMap<>();

        //Add Employee and Salary
        empSalary.put(1, 100.0);
        empSalary.put(2, 1000.0);
        empSalary.put(3, 500.0);
        empSalary.put(4, 5000.0);
        empSalary.put(5, 3000.0);

        //Iterate
        System.out.println("---Employee & Salary----");
        for (Map.Entry<Integer, Double> entry : empSalary.entrySet()) {
            System.out.println("Emp Id: " + entry.getKey() + ", Salary: " + entry.getValue());
        }

        // 4. Increase salary by 10%
        for (Map.Entry<Integer, Double> entry : empSalary.entrySet()) {
            entry.setValue(entry.getValue() * 1.10);
        }

        System.out.println("---After Increasing 10%------");
        empSalary.forEach((id, salary)-> System.out.println("Emp Id: " + id + ", Salary: " + salary));

        //Remove employee
        empSalary.remove(3);
        System.out.println("---After Remove Emp----");
        empSalary.forEach((id , salary)-> System.out.println("Emp Id: " + id + ", Salary: " + salary));

        //Calculate Average
        double total = 0;
        for (double salary : empSalary.values()){
            total += salary;
        }
        double avg = total / empSalary.size();
        System.out.println("Average Salary: " + avg);
    }
}
