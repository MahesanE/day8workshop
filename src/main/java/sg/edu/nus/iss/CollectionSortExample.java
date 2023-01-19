package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSortExample {

    public void example01() {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println("Unsorted list: " + numbers);

        // Sorting in ascending order
        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);

        // Sorting in descending order
        // Collections.sort(numbers, Collections.reverseOrder());
        numbers.sort(Comparator.reverseOrder());

        System.out.println("Sorted in descending order: " + numbers);
    }

    public void example02() {
        Employee emp1 = new Employee("12345", "Tim", "SS", "Teacher", "Tim@hotmail.com", 10000);
        Employee emp2 = new Employee("23456", "Jon", "SS", "Teacher", "Tom@hotmail.com", 40000);
        Employee emp3 = new Employee("34567", "Max", "SS", "Teacher", "Max@hotmail.com", 30000);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Employees before sorting: " + employees);

        // sorting on ascending order by full name as the compare to function is by full
        // name on the employee page
        Collections.sort(employees);
        // System.out.println("Employees sorted: " + employees);

        // using Comparator and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Sorted by salary: " + employees);

        List<Employee> filteredEmployee = employees.stream().filter(e -> e.getFullName().equalsIgnoreCase("Jon"))
                .collect(Collectors.toList());
        System.out.println("Filter employees: " + filteredEmployee);

    }

}
