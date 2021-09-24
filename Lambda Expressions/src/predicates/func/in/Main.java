package predicates.func.in;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = fillEmployeesList();
        employees.sort((p2, p1) -> p1.getName().compareTo(p2.getName()));

        //Find employees by two condition using Predicate<T>
        //Here we define the Predicate condition: employee -> employee.getAge() > 30
        printEmployeesByAge(employees, "Employees OVER 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "Employees UNDER 30", employee -> employee.getAge() < 30);

        System.out.println("Employees UNDER 25 Using EmployeesUnder25 impl Predicate<Employee>");
        EmployeesUnder25<Employee> under25 = new EmployeesUnder25<>();
        employees.stream().filter(under25).forEach(e -> System.out.println(e.getName()));
    }

    public static void printEmployeesByAge(List<Employee> employees, String ageText,
                                           Predicate<Employee> ageCondition){
        System.out.println(ageText);
        for (Employee employee : employees) {
            //Here we use test() from Predicate class
            if (ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }

    private static List<Employee> fillEmployeesList() {
        List<Employee> employees = new ArrayList<>();
        Employee first = new Employee("Ganio", 53);
        Employee second = new Employee("Aleks", 29);
        Employee third = new Employee("Bobi", 18);
        Employee fourth = new Employee("Kolio", 35);
        Employee fifth = new Employee("Mitio", 21);
        Employee sixth = new Employee("Valio", 44);
        Employee seventh = new Employee("Alfonso", 52);
        Employee eight = new Employee("Masoc", 19);

        employees.add(first);
        employees.add(second);
        employees.add(third);
        employees.add(fourth);
        employees.add(fifth);
        employees.add(sixth);
        employees.add(seventh);
        employees.add(eight);

        return employees;
    }
}
